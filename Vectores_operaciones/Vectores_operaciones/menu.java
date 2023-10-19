
import java.util.Scanner;

public class menu {
    Scanner Vector=new Scanner(System.in);
    public void mostrar(){
        int i;
        if (inicio<fin)
            for(i=inicio;i<fin;i++)
                System.out.print(cola[i]+" ");
        if(inicio>fin || llena()){
            for(i=inicio;i<cola.length;i++)
                System.out.print(cola[i]+" ");
            for(i=0;i<fin;i++)
                System.out.print(cola[i]+" ");
        }
        if (vacia())
            System.out.println("Cola vacia");
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        int i=0,productopunto=0;
        int []suma= new int[5];
        int []resta=new int[5]; 
        
        int [] a1= new int[5];
        int [] a2= new int [5];
        for(i=0;i<a1.length;i++)
        {
            int numeroAleatorio1 = (int)(Math.random()*25+1);
            a1[i] = numeroAleatorio1;
            System.out.println("a1 :" +a1[i]);
            System.out.println("\n");
            int numeroAleatorio2 = (int)(Math.random()*25+1);
            a2[i] = numeroAleatorio2;
            System.out.println("a2 :" +a2[i]);  
            System.out.println("\n"); 
        }
        
        for (i=0;i<a1.length;i++)
        {
            productopunto+= a1[i]*a2[i];
        }

        for (i=0;i<a1.length;i++)
        {
            suma[i]= a1[i]+a2[i];
            System.out.println("la suma es:"  +suma[i]);
        }

        for (i=0;i<a1.length;i++)
        {
            resta[i] = a1[i] - a2[i];
            System.out.println("la resta es:" +resta[i]);
        }
        System.out.println("el producto_punto es:" +productopunto);
    }
    
}

