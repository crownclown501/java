public class Prueba
{    
     //colaEntrada
     public char A[];
     public int tam;
     public int last;
     public int first;
     //Pila
     public char Array[];
     public int tope;
     public int tamaño;
     //ColaSlaida
     public char arreglo[];
     public int tama;
     public int inicio;
     public int fin;
     
     public Prueba(int t){
         //colaEntrada
         tam=t;
         last=0;
         first=0;
         A = new char[t];
        inicio=0;
         fin=0;
         arreglo = new char[t];
         tope = 0;
         Array = new char [t]
        
     }
     
      public void pila(int t){
        
         
         
     }
     public void insertar(char data){
        A[last]=data;
        if (data=='+'||data=='-'||data=='*'||data=='/'||data=='=') {
            Array[tope]=data;
            tope++;
        }
        if (((data >= 'a' && data <= 'z') || (data >= 'A' && data <= 'Z') || data == ' ')) {
            if (data!='+'||data!='-'||data!='*'||data!='/'||data!='='||data!='\0') 
            {
                arreglo[fin]=data; 
                fin++;
            }
        }
        last++;
     }

     /*public void listaSalida()
     {
        
        int i=0;
        if (A[i]!='+'||A[i]!='-'||A[i]!='*'||A[i]!='/'||A[i]!='='||A[i]!='\0') {
            char output=A[i];
            arreglo[fin]=output;
        }
        fin++;
        i++;
     }*/
     /*public boolean PilaOperacion(String signo){
        return false;
            
        }  */  
     public void mostrarColaEntrada(){
         for(int i=first; i<last;i++){
            System.out.print(A[i]+" ");
         }
     }
     public void MostraraLaCola(){
         for(int i=inicio; i<fin;i++){
            System.out.println(arreglo[i]+" ");
         }
     }
     public void MostrarPila(){
         for(int i=0; i<tope;i++){
            System.out.print(Array[i]+" ");
         }
     }
    
    public static void main(String[] args){
        Prueba c = new Prueba(11);
        c.pila(11);
        c.insertar('x');
        c.insertar('=');
        c.insertar('3');
        c.insertar('*');
        c.insertar('4');
        c.insertar('+');
        c.insertar('8');
        c.insertar('/');
        c.insertar('2');
        c.insertar('+');
        c.insertar('1');
        c.mostrarColaEntrada();
        System.out.println("");
        c.MostrarPila();
        System.out.println("");
        c.MostraraLaCola();
        //c.MostraraLaCola();
    }
}