import java.io.IOException;
import java.util.Scanner;

public class eduardopolaco {
    //colaEntrada
    public char A[];
    public int tam;
    public int last;
    public int first;
    //Pila
    public char Array[];
    public int tope;
   
    //ColaSlaida
    public char arreglo[];
    
    public int incio;
    public int fin;
    Scanner sc = new Scanner(System.in);
    
    public eduardopolaco(int t){
        //colaEntrada
        tam=t;
        last=0;
        first=0;
        A = new char[t];
        //Pila
        
        tope=0;
        Array = new char[t];
        //colasalida
        
        incio=0;
        fin=0;
        arreglo = new char[t];
    }
    public void insertarI() {
        System.out.print("ingrese datos\n");
        for(int i=0;i<tam;i++)
        {
            char cd=sc.next().charAt(i);
            //char c = (char)System.in.read();
            A[i]=cd;
            last++;
        }
    }
    public void insertar(){
        for (int i = 0; i < last; i++) 
        {
            if (A[last]=='+'||A[last]=='-'||A[last]=='*'||A[last]=='/'||A[last]=='=') {
                Array[tope]=A[i];
                tope++;
            }
            if (((A[last] >= 'a' && A[last] <= 'z') || (A[last] >= 'A' && A[last] <= 'Z') || A[last] == ' ')) {
                arreglo[fin]=A[i];
                fin++;
            }
        }

        /*if(data=='='){
            Array[tope]=data;
            tope++;
        }
        if((data=='+')||(data=='-')){
            Array[tope]=data;
            tope++;
        }
        if((data=='*')||(data=='/')){
            Array[tope]=data;
            tope++;
        }*/
    }
    public void mostrarColaEntrada(){
        for(int i=first; i<last;i++){
            System.out.print(A[i]+" ");
        }
    }
    public void MostrarPila(){
        for(int i=0; i<tope;i++){
            System.out.print(Array[i]+" ");
        }
    }
    public void mostrarColaSalida(){
        for(int i=first; i<last;i++){
            System.out.print(arreglo[i]+" ");
        }
    }
    public static void main(String[] args) throws IOException{
        eduardopolaco c = new eduardopolaco(7);
        c.insertarI();
        c.mostrarColaEntrada();
        System.out.println("");
        c.MostrarPila();
        c.mostrarColaSalida();
    }
}