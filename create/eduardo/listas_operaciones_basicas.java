class Nodo {
    public int info;
    public Nodo liga;
    public Nodo(int dato)
    {
        info=dato;
	    liga=null;
    }
}
public class listas_operaciones_basicas {
    private Nodo raiz;
    private Nodo inicio;
    private Nodo fin;
    private Nodo fin2;
    private Nodo suma;
    private Nodo resta;
    private Nodo Multi;
    private Nodo finsuma;
    private Nodo finresta;
    private Nodo finMulti;
    public listas_operaciones_basicas(){
        raiz=null;
        fin=null;
        fin2=null;
        inicio=null;
    }
    public void Insertar1(int valor){//[8]->[8]->[5] 12 7
        Nodo temp = new Nodo(valor);// f
        if(raiz==null){
            raiz=temp;
            fin =temp;
        }else{
            fin.liga=temp;
            fin=temp;
        }
    }
    public void Insertar2(int valor){
        Nodo aux = new Nodo(valor);
        if(inicio==null){
            inicio=aux;
            fin2=aux;
        }else{
            fin2.liga=aux;
            fin2=aux;
        }
    }
    public void recorrer1(){
        Nodo aux=raiz;
        System.out.println("DATOS LISTA 1");
        while(aux!=null){
            System.out.print("["+aux.info+"]");
            aux=aux.liga;
        }
        System.out.println();
    }
    public void recorrer2(){
        Nodo aux=inicio;
        System.out.println("Datos Lista 2");
        while(aux!=null){
            System.out.print("["+aux.info+"]");
            aux=aux.liga;
        }
        System.out.println();
    }
    public void Suma(){
        Nodo aux = raiz;
        Nodo aux1 = inicio;
        int ap=0;
        while(aux!=null && aux1!=null){  //7 ->12
            ap=aux.info+aux1.info;
            aux=aux.liga;
            aux1=aux1.liga;
            Nodo temp = new Nodo(ap);
            if(suma==null){   //55
                suma=temp;
                finsuma=temp;
            }else{
                finsuma.liga=temp;
                finsuma=temp;
            }
        }
    }
    public void Resta(){
        Nodo aux = raiz;
        Nodo aux1 = inicio;
        int ap=0;
        while(aux!=null && aux1!=null){
            ap=aux.info-aux1.info;
            aux=aux.liga;
            aux1=aux1.liga;
            Nodo temp = new Nodo(ap);
            if(resta==null){
                resta=temp;
                finresta=temp;
            }else{                            //temp
                finresta.liga=temp;  //[8]->[13]
                finresta=temp;               //fres
            }
        }
    }
    public void Multiplicacion(){
        Nodo aux = raiz;
        Nodo aux1 = inicio;
        int ap=0;
        while(aux!=null && aux1!=null){
            ap=aux.info*aux1.info;
            aux=aux.liga;
            aux1=aux1.liga;
            Nodo temp = new Nodo(ap);
            if(Multi==null){
                Multi=temp;
                finMulti=temp;
            }else{
                finMulti.liga=temp;
                finMulti=temp;
            }
        }
    }
    public void RecorrerS(){
        Nodo aux=suma;
        System.out.println();
        System.out.println("Suma: ");
        while(aux!=null){
            System.out.print("["+aux.info+"]");
            aux=aux.liga;
        }
        System.out.println();
    }
    public void RecorrerR(){
        Nodo aux=resta;
        System.out.println();
        System.out.println("Resta: ");
        while(aux!=null){
            System.out.print("["+aux.info+"]");
            aux=aux.liga;
        }
        System.out.println();
    }
    public void RecorrerM(){
        Nodo aux=Multi;
        System.out.println();
        System.out.println("Multiplicacion: ");
        while(aux!=null){
            System.out.print("["+aux.info+"]");
            aux=aux.liga;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       listas_operaciones_basicas L = new listas_operaciones_basicas();
        L.Insertar1(8);
        L.Insertar1(8);
    	L.Insertar1(5);
    	L.Insertar1(12);
    	L.Insertar1(7);
        //
        L.Insertar2(9);
        L.Insertar2(10);
        L.Insertar2(15);
        L.Insertar2(120);
        L.Insertar2(48);
        System.out.println("\t\tLista 1");
        L.recorrer1();
        System.out.println("\t\tLista 2");
        L.recorrer2();
        //
        L.Suma();
        L.RecorrerS();
        L.Resta();
        L.RecorrerR();
        L.Multiplicacion();
        L.RecorrerM();
    }
}