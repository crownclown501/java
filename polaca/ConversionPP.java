package polaca;

import java.util.Scanner;

 import javax.swing.JOptionPane;
public class ConversionPP {
 
    public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    String infija=in.nextLine();
    
    String postfija= Convertidor.convertirApostfija(infija);//Aqui el programa convierte la operacion a posfija
    
    JOptionPane.showMessageDialog(null,"La operación infija es: "+infija+
            "\nExpresion en notación postfija: "+postfija);//Aqui se imprime la operacion en posfija
    }
    
}