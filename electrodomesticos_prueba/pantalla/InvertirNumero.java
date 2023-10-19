
import javax.swing.*;
import java.awt.event.*; //Para agregar el evento a los botones

//No es necesario importar Scanner :)

public class InvertirNumero extends JFrame implements ActionListener{ //Heredas JFrame e implementas ActionListener

private JLabel solicitud, respuesta; //JLabel es un texto (lo utilizaremos en lugar del print)
private JTextField entrada; //Tu la llamaste sc (al crear la instancia de Scanner)
private JButton boton;

public InvertirNumero(){ //Constructor
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE); 

    solicitud = new JLabel("Introduce un número para invertir: ");
    solicitud.setBounds(10,10,220,30);   // Coordenadas donde se ubicará
    add(solicitud);

    respuesta = new JLabel("Respuesta: ");
    respuesta.setBounds(120,50,240,30);  // Coordenadas donde se ubicará
    add(respuesta);

    entrada = new JTextField();
    entrada.setBounds(220, 10, 100, 30); // Coordenadas donde se ubicará
    add(entrada);

    boton = new JButton("Invertir");
    boton.setBounds(10, 50, 100, 30);    // Coordenadas donde se ubicará
    boton.addActionListener(this);
    add(boton);
}

@Override //Sobrecargas el metodo de la clase implementada: ActionListener
public void actionPerformed(ActionEvent evento){ //Evento para cuando des clic

    if(evento.getSource() == boton){

        respuesta.setText("Respuesta: " + invertirNumero(Integer.parseInt(entrada.getText())));

        /* 
        Para entender la linea anterior:

        - respuesta.setText() Establece lo que dirá en el label: respuesta.
        - invertirNumero() Es tu funcion.
        - Integer.parseInt() convierte un texto de numeros a Enteros
        - entrada.getText() devuelve lo que introdujiste en el JTextField: entrada.
        */
    }
}

public static void main(String[] args) {
    InvertirNumero ventana = new InvertirNumero(); //Creas la ventana
    ventana.setBounds(0, 0, 380, 150);
    ventana.setVisible(true);
}

private static int invertirNumero(int numero){ //Aquí no toqué nada
    int cifra, inverso = 0;
    while(numero!=0){
        cifra = numero%10;
        inverso = (inverso * 10) + cifra;
        numero/=10;
    }
    return inverso;
}
}

