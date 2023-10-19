import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class actionlisten extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JButton button;
    private JTextField textfield;
     
    public actionlisten()
    {
        setBounds(50,50,500,500); //place & size of the window
        setTitle("Events");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//this one stops the implementation  
    }

    private void iniciarComponentes() {
        putpanel();
        putetiquete();
        puttextbox();
        putbutton();
    }

    private void putbutton() {
        button = new JButton();
        button.setBounds(150, 100, 150, 40); 
        button.setFont(new Font("arial",0,15));
        panel.add(button);

        saludo = new JLabel();
        saludo.setBounds(50,300,300,40);
        saludo.setFont(new Font ("arial",1,20));
        panel.add(saludo);
        
        ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                saludo.setText("Hola"+textfield.getText());
            }
        };
        button.addActionListener(listener);
    }

    private void puttextbox() {
        textfield = new JTextField();
        textfield.setBounds(30,50,300,30);
        panel.add(textfield);
    }

    private void putetiquete() {
        JLabel etiqueteLabel = new JLabel("insert your name:");
        etiqueteLabel.setBounds(30,10,200,30);
        etiqueteLabel.setFont(new Font("cooper black",0,18));
        panel.add(etiqueteLabel);
    }

    private void putpanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
}
