

public class Pila 
{
    public char[] A;
    public int tope;
    public int tamaño;
    
    public Pila(int t)
    {
          tamaño=t; 
          tope=0;
          A= new char[t]; 
    }
    
    public void push(char dato)
    {
      A[tope]=dato;
      tope++;
    }
    
    public int pop()
    {
      tope=0;
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
        for(int i=0; i< tope; i++)
        System.out.print(A[i]+" ");
    }
    
    public static void main(String[] args) throws Exception 
    {
        // Your code here!
        Pila P = new Pila(5);         
        P.push((char) 12);
        P.push((char) 15);
        P.push((char) 3);
        System.out.println("Datos de la Pila");
        P.mostrar();
        P.pop();
        System.out.println("\nDatos de la Pila");
        P.mostrar();
        int r=P.vacia();
        int s=P.llena();
        System.out.println("\nVacia = "+ r);
        System.out.println("\nLlena = "+ s);
    }

    
}