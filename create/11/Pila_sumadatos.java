public class Pila_sumadatos {
    int Pila_sumadatos[];
    int tope;
    int sum=0;
    int tamaño;
    
    public Pila_sumadatos(int t){
        tamaño=t;
        tope=0;
        Pila_sumadatos = new int[t];
    }
    public void push(int dato){//Ingresardato
        Pila_sumadatos[tope]=dato;
        sum+=Pila_sumadatos[tope];
        tope++;
        
    }
    public int pop(){
        tope--;
        return (Pila_sumadatos[tope]);
    }
    public int vacio(){
        if(tope==0){
            System.out.println("Pila_sumadatos Vacia");
            return 1;
        }else{
            System.out.println("Pila_sumadatos con valores");
            return 0;
        }
    }
    public int Lleno(){
        if(tope==tamaño){
            return 1;
        }else{
            return 0;
        }
    }
    public void Mostrar(){
        for(int i=0; i<tope; i++){
            System.out.print("["+Pila_sumadatos[i]+"]-");
        }
        System.out.println("\nsuma de datos de la pila es:"+sum);
    }
    
    public static void main(String[] args) {
        Pila_sumadatos P = new Pila_sumadatos(5);
       
        P.push(8);
        P.push(5);
        P.push(9);
        P.push(10);
        System.out.println("Mostrar datos Pila_sumadatos:");
        P.Mostrar();
        System.out.println("");
        
    }
    
}