public class newpila {
    public String[] A;
    public int tope;
    public int tamaño;
    final String ops = "-+/*";

    public newpila()
    {
        tope=0;
    }
    

    
    public void push(String dato)
    {
        for(String signo:dato.split("\\s"))
        {
            if (signo.isEmpty()) 
            continue;
            char array= signo.charAt(0);
            int i = ops.indexOf(array);
        }
      
      
    }
    
    public String pop()
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
        newpila P = new newpila();         
        String inicialString = "x = 3 + 4 * 2 / 5 + 2 * 3";
        P.push(inicialString);
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
