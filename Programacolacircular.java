public class Programacolacircular {
    public int[] A;
    public int atras;
    public int frente;
    public int tamano;
    public int ultimaoperacion;

    public Programacolacircular(int t) {
        tamano = t;
        atras = 0;
        frente = 0;
        ultimaoperacion = 0;
        A = new int[t];
    }

    public void insertar(int dato) {
        int x=llena();
        if (x==1){ //llena!=0
            System.out.println("la cola ya esta llena");
        }else{
            if (atras == tamano){
                atras = 0;
            }
            A[atras] = dato;
            atras++;
            ultimaoperacion = 1;
        }
    }

    public int extraer () {
        int dato=0; 
        int x = vacia();
        if (x == 1){
            System.out.println("la cola ya esta vacia");
        }else{
            if (frente == tamano){
                frente = 0;
            }
            ultimaoperacion = 0;
            dato = A[frente];
        }   
        A[frente]=0;
        frente++;
        return dato;
    }

    public int vacia() {
        if ((atras == frente) && (ultimaoperacion == 0)){ //1 2 3 4 5              12 2 3 4 5       0 0 0 0
            return 1;
        } else {
            return 0;
        }
    }

    public int llena() {
        if ((atras == frente) && (ultimaoperacion == 1)){
            return 1;
        } else {
            return 0;
        }
    }

    public void mostrar() {
        int y=vacia(),full=llena();
        if (frente<atras) 
            for (int i = frente; i < atras; i++) //
                System.out.println("Array["+i+"]: "+A[i]);
        if (frente>atras || full==1) {
            for (int i = frente; i < A.length; i++) 
                System.out.println("Array["+i+"]: "+A[i]);
            for (int i = 0; i < atras; i++) 
                System.out.println("Array["+i+"]: "+A[i]); 
        }
    
        if (y==1) {
            System.out.println("cola vacia\n");
        }
    
    }

    public static void main(String[] args) throws Exception {
        Programacolacircular Cc = new Programacolacircular(5);
        Cc.insertar(12);
        Cc.insertar(15);
        Cc.insertar(3);
        Cc.insertar(20);
        Cc.insertar(5);        
        System.out.println("Datos de la cola");
        Cc.mostrar();
         Cc.extraer();

        System.out.println("\nDatos de la cola");
        Cc.mostrar();
        
        Cc.insertar(300);
        
        /*x = Cc.extraer();
        System.out.println("dato extraido: "+ x);
        x = Cc.extraer();
        System.out.println("dato extraido: "+ x);
        x = Cc.extraer();
        System.out.println("dato extraido: "+ x);
        x = Cc.extraer();
        System.out.println("dato extraido: "+ x);
        x = Cc.extraer();
        System.out.println("dato extraido: "+ x);
        Cc.mostrar();*/
        
        System.out.println("\nDatos de la cola");
        Cc.mostrar();
        int r = Cc.vacia();
        int s = Cc.llena();
        System.out.println("\nVacia = " + r);
        System.out.println("\nLlena = " + s);
    }
}