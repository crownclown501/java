import java.lang.reflect.Method;

public class prototipo2{
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
    public char postfija;

    public Pila()
    {
        postfija='\0';
    }

    
    
}public static void main(String[] args) {
    Scanner lec = new Scanner(System.in);
    String entrada = lec.next();
    String salida="";
    
    Stack<Character> p = new <Character>Stack();
    for(int i=0;i<entrada.length();i++){
        if(entrada.charAt(i)>='0' && entrada.charAt(i)<='9')
            salida=salida + entrada.charAt(i);
        if(entrada.charAt(i)>='=' && entrada.charAt(i)<='/')
            p.push(entrada.charAt(i));
            
        
        
    }
    while(!p.isEmpty())
        salida += p.pop();
    System.out.println(salida);
}
    }

}