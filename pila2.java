import java.util.*;

public class pila2 
{
    public int A[];
    public int tope;
    public int tamaño;
    
    public pila2(int t)
    {
          tamaño=t; 
          tope=0;
          A= new int[t]; 
    }
    
    public void push(int dato)
    {
      A[tope]=dato;
      tope++;
    }
    
    public int pop()
    {
      tope--;
      return (A[tope]);
    }

   public int vacia()
    {
      if(tope==0) return 1;
      else return 0;
    }
    
    public int llena()
    {
      if(tope==tamaño) return 1;
      else return 0;
    }
    
    public void mostrar()
    {
        int sum=0;
        for(int i=0; i< tope; i++)
        {
        System.out.print(A[i]+" ");
        sum+=A[i];
        }
        System.out.println("\n");
        System.out.println("la suma es :"+sum + "\n");
    }
    
    public static void main(String[] args) throws Exception 
    {
        // Your code here!
        pila2 P = new pila2(5);         
        P.push(12);
        P.push(15);
        P.push(3);
        P.push(9);
        P.push(-7);
        System.out.println("Datos de la Pila");
        P.mostrar();
        P.pop();
        P.mostrar();
        P.pop();
        P.mostrar();
        System.out.println("\nDatos de la Pila");
        int r=P.vacia();
        int s=P.llena();
        System.out.println("\nVacia = "+ r);
        System.out.println("\nLlena = "+ s);
    }
    
}
