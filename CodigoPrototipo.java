import java.util.Scanner;
import java.util.Stack;

public class CodigoPrototipo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String entrada = lector.next();
        String salida="";
        Stack<Character> p = new <Character>Stack();
        for(int i=0;i<entrada.length();i++){

            if (((entrada.charAt(i) >= 'a' && entrada.charAt(i) <= 'z') || entrada.charAt(i) >= 'A' && entrada.charAt(i) <= 'Z') ) 
            {
               salida=salida+entrada.charAt(i); 
            }
            
            
            if(entrada.charAt(i)>='0' && entrada.charAt(i)<='9')
            {
                salida=salida + entrada.charAt(i);
            }
                if ((entrada.charAt(i)=='*' || entrada.charAt(i)=='/')) {
                    p.push(entrada.charAt(i));
                } else {
                    if ((entrada.charAt(i)=='+' || entrada.charAt(i)=='-')) {
                        p.push(entrada.charAt(i));
                    }
                    
                }
            /*if((entrada.charAt(i)>=42 && entrada.charAt(i)<=47)/*||(entrada.charAt(i)<='+' && entrada.charAt(i)<='-')
                p.push(entrada.charAt(i));
                if(entrada.charAt(i)=='=')
                */
            
        }
        while(!p.isEmpty())
            salida = salida+p.pop();
        System.out.println(salida);
    }
    
}