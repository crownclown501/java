import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JButton button;
    private JTextField textfield;
    private JButton btnAceptar;
    private JLabel jLabel;
    private JRadioButton Alta;
    private JRadioButton Baja;
    private JRadioButton Modificar;
    private JRadioButton Mostrar;
    private JRadioButton Añadir;
    private JRadioButton Cobrar;
    
    public Ventana()
    {
       JFrame frame = new JFrame();
        setBounds(50,50,500,500); //place & size of the window
        setTitle("Events");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//this one stops the implementation  
        ButtonGroup btg = new ButtonGroup();
		
		btg.add(Alta);
		btg.add(Baja);
		btg.add(Modificar);
		btg.add(Mostrar);
		btg.add(Añadir);
		btg.add(Cobrar);
        frame.getContentPane().setBackground(ColorAttribute.green);
    }

    private void iniciarComponentes() {
        putpanel();
        putetiquete();
        puttextbox();
        putbutton();
       
    }

    private void putbutton() {
        button = new JButton("¡Pulsa Aqui!");
        button.setBounds(150, 100, 150, 40); 
        button.setFont(new Font("arial",0,15));
        panel.add(button);

        saludo = new JLabel();
        saludo.setBounds(50,300,800,50); // u can change the 400 for another number depending on how mani words u wanna show
        saludo.setFont(new Font ("arial",1,20));
        panel.add(saludo);
        
        ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                saludo.setText(" Hola " +textfield.getText());
            }
        };
        button.addActionListener(listener);
    }

    private void puttextbox() {
        Alta = new javax.swing.JRadioButton();
		Baja = new javax.swing.JRadioButton();
		Modificar = new javax.swing.JRadioButton();
		Mostrar	= new javax.swing.JRadioButton();
		Añadir = new javax.swing.JRadioButton();
		Cobrar = new javax.swing.JRadioButton();
		jLabel = new javax.swing.JLabel();
		btnAceptar = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Sistema");
		
		Alta.setText(" Dar de alta un producto");
		
		Baja.setText("Dar de baja un producto");
		
		Modificar.setText("Modificar un producto");
		
		Mostrar.setText("Mostrar lista de productos a comprar");
			
		Añadir.setText("Añadir producto a lista de comprar");
		
		Cobrar.setText("Cobrar cliente");

		jLabel.setText("Elige una opcion");

		btnAceptar.setText("Aceptar");
		btnAceptar.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				btnAceptarActionPerformed(evt);
			}
		});


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            
                            .addComponent(jLabel)
                            .addComponent(Alta)
                            .addComponent(Baja)
			                .addComponent(Modificar)
			                .addComponent(Mostrar)
			                .addComponent(Añadir)
                            .addComponent(Cobrar)))
                    
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAceptar)
                        .addGap(0, 0, Short.MAX_VALUE))
                );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel)
                .addGap(18, 18, 18)
                .addComponent(Alta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Baja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addComponent(Añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addComponent(Cobrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(21, Short.MAX_VALUE))
        );
 
        pack();
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
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)
	{
		String info = "Elegiste la opcion ";
		JRadioButton[] opc={Alta,Baja,Modificar,Mostrar,Añadir,Cobrar};
		for( int i = 0; i < opc.length;i++)
		{
			if (opc[i].isSelected())
			{
				info += opc[i].getText();
			}
		}
		JOptionPane.showMessageDialog(this, info, "Muestra de datos", JOptionPane.INFORMATION_MESSAGE);
	}
}
