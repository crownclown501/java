public class CodigoPrueba {
    public char A[];
       public int tam;
       public int last;
       public int first;
       
       public CodigoPrueba(int t){
           //colaEntrada
           tam=t;
           last=0;
           first=0;
           A = new char[t];
       }
       public void insertar(char data){
           A[last]=data;
           last++;
       }
       
       public void mostrar(){
           for(int i=first; i<last;i++){
               System.out.print(A[i]+" ");
           }
       }
       public static void main(String[] args){
           CodigoPrueba c = new CodigoPrueba(11);
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
           c.mostrar();   
       }
   }