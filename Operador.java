public class Operador {
    //colaEntrada
    public char A[];
    public int tam;
    public int last;
    public int first;
    //Pila
    public char Array[];
    public int tope;
    public int tope1;
    public int tamaño;
    //ColaSlaida
    public char arreglo[];
    public int tama;
    public int incio;
    public int fin;
    
    public Operador(int t){
        //colaEntrada
        tam=t;
        last=0;
        first=0;
        A = new char[t];
        //Pila
        tamaño=t;
        tope=0;
        tope1=0;
        Array = new char[t];
        //colasalida
        tama=t;
        incio=0;
        fin=0;
        arreglo = new char[t];
    }
    public void insertar(char c){
        A[last]=c;
        last++;
        if (vacia()) {
            System.out.println("pila vacia");

        }else{
            Aux=pila[y]
        }
    }

    public void signos()
    {
        Operador A = new Operador(tam/2);
        /*for(String signo : A)
        {
            if (pilacheck(signo)) {
                
            }
        }*/
    }

    public boolean pilacheck(String signo)
    {
        return signo.equals("=")|| signo.equals("+")||signo.equals("-")|| signo.equals("*")|| signo.equals("/");
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
    public static void main(String[] args){
        Operador c = new Operador(11);
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
        
    }
}