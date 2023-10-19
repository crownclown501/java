import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Principal extends JFrame implements ActionListener {
    private JPanel contenPane; JFrame frame = new JFrame();
    JMenuItem Informacion = new JMenuItem("Informacion",'K');
    JMenuItem Crear = new JMenuItem("Crear Cuenta",'A');
    JMenuItem Motivacion = new JMenuItem("Motivacion",'X');
    JMenuItem Salir = new JMenuItem("Salir",'S');
    JMenuItem Mover = new JMenuItem("Movimientos",'C');
    JMenuItem Eliminar = new JMenuItem("Eliminar Cuenta",'G');
    JMenuItem Buscar = new JMenuItem("Buscar Cuenta",'B');
    JMenuItem MostrarC = new JMenuItem("Mostrar Cuentas",'T');
    JMenuItem ModificarC = new JMenuItem("Modificar Cuenta",'D');
    JMenuItem Retirar = new JMenuItem("Retirar",'R');
        
    JMenuItem EliminarC = new JMenuItem("Eliminar todo",'F');
   
      
    public Principal(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contenPane = new JPanel();
        contenPane.setLayout(null);
        contenPane.setBackground(Color.RED);
        setFocusable(true);
        this.getContentPane().setBackground(contenPane.setBackground(ColorAttribute(Color.BLUE)));
        this.getContentPane().setBackground(contenPane.createImage(fondo.jpg));
        JLabel fondoPresentacion = new JLabel();
        fondoPresentacion.setSize(contenPane.getWidth(),contenPane.getHeight());
        fondoPresentacion.setLocation(0, 0);
        fondoPresentacion.setIcon(new ImageIcon("fondo.png"));
        fondoPresentacion.setVisible(true);
        contenPane.add(fondoPresentacion,0);
        
        JMenuBar barraMenu = new JMenuBar();
        JMenu Iniciar = new JMenu("Iniciar");
        Iniciar.setMnemonic('I');
        JMenu archivo = new JMenu("Archivo");
        archivo.setMnemonic('A');
        JMenu Editar = new JMenu("Editar");
        Editar.setMnemonic('E');
        JMenu Movimientos = new JMenu("Movimientos");
        JMenu Ayuda = new JMenu("Ayuda");
        JMenu Salir1 = new JMenu("Salir");
        
        barraMenu.add(Iniciar);
        barraMenu.add(archivo);
        barraMenu.add(Movimientos);
        barraMenu.add(Editar);
        barraMenu.add(Ayuda);
        barraMenu.add(Salir1);

        Iniciar.add(Crear);
        Iniciar.add(Eliminar);
        Iniciar.add(new JSeparator());
        Iniciar.add(EliminarC);
        archivo.add(Buscar);
        archivo.add(MostrarC);
        Editar.add(ModificarC);
        Movimientos.add(Mover);
        Movimientos.add(Retirar);
        Ayuda.add(Informacion);
        Ayuda.add(Motivacion);
        Salir1.add(Salir);
        
        setJMenuBar(barraMenu);
        
        Informacion.addActionListener(this);
        Crear.addActionListener(this);
        Motivacion.addActionListener(this);
        Salir.addActionListener(this);
        Mover.addActionListener(this);
        Buscar.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Crear){
            DatosPersonales a1 = new DatosPersonales();
            a1.setBounds(0,0,500,450);
            a1.setVisible(true);
        }
        if(ae.getSource()==Informacion){
            JOptionPane.showMessageDialog(null,"Jose Eduardo Blanco Hernandez\n"
                    + "Antonio Garcia de Cristobal\nJaquelin Bonilla Serrano");
        }
        if(ae.getSource()==Motivacion){
            JOptionPane.showMessageDialog(null,"'Si puedes imaginarlo puedes programarlo'\n-Alejandro Taboada Sanchez");
        }
        if(ae.getSource()==Mover){
            Movimientos a2 = new Movimientos();
        }
        if(ae.getSource()==Salir){
            System.exit(0);
        }
        if(ae.getSource()==Buscar){
            Buscar a3 = new Buscar();
            a3.setBounds(0,0,400,400);
           a3.setVisible(true);
        }
    }
   
}