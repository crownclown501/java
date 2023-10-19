class Nodo {
    public int info;
    public Nodo liga;
    public Nodo(int dato) {
        info = dato;
        liga = null;
    }
}

public class listasimpleelevada {
    private Nodo raiz;
    private Nodo raiz2;
    public Nodo fin2;
    private Nodo raizs2;
    public Nodo fins2;
    int contador=0;

    public listasimpleelevada() {
        raiz = null;
        raiz=null;
        fin2=null;
        raizs2=null;
        fins2=null;
     }
  
    public void insertar(int valor) {
        Nodo temp = new Nodo(valor);
        if (raiz == null) {
            raiz = temp;
        } else {
            temp.liga = raiz;
            raiz = temp;
        }
        contador++;
    }

    public void recorrer() {
        Nodo aux = raiz;
        System.out.println("Datos de la Lista:");
        while (aux != null) {
            System.out.print(aux.info + " ");
            aux = aux.liga;
        }
        System.out.println();
    }
    
    public void separa(listasimpleelevada lista1, listasimpleelevada lista2){
        int subcontador = contador/2;
        int contadorextra=0;
        Nodo aux = raiz;
        while (aux != null) {
            if(contadorextra<subcontador){
                aux.info = aux.info*aux.info;
                lista1.ordenar1 (aux.info );
                } if(contador>contadorextra&&contadorextra>=subcontador){
                aux.info = aux.info*aux.info*aux.info;
                lista2.ordenar2(aux.info);
            }
            aux = aux.liga;
            contadorextra++;
        }
        System.out.println();
    }

void ordenar1(int data)
{
    Nodo temp2=new Nodo(data);
         if (raiz2 == null) {
            raiz2= temp2;
            fin2=temp2;
        } else if(temp2.info<=raiz2.info){
            temp2.liga=raiz2;
            raiz2=temp2;
        }else if (temp2.info >=fin2. info){
        	fin2. liga=temp2;
        	fin2=temp2;
        }else{
        	Nodo anterior=null;
        	Nodo posterior=raiz2;
        	while(posterior.info<=temp2.info)
        	{
        		anterior=posterior;
        		posterior=posterior.liga;
        	}
        	anterior.liga=temp2;
        	temp2.liga=posterior;
        }
}

public void recorrer1() {
        Nodo aux = raiz2;
        System.out.println("Datos de la Lista:");
        while (aux != null) {
            System.out.print(aux.info + " ");
            aux = aux.liga;
        }
        System.out.println();
    }
    
    void ordenar2(int data)
   {
    Nodo temps2=new Nodo(data);
         if (raizs2 == null) {
            raizs2= temps2;
            fins2=temps2;
        } else if(temps2.info<=raizs2.info){
            temps2.liga=raizs2;
            raizs2=temps2;
        }else if (temps2.info >=fins2. info){
        	fins2. liga=temps2;
        	fins2=temps2;
        }else{
        	Nodo anterior=null;
        	Nodo posterior=raizs2;
        	while(posterior.info<=temps2.info)
        	{
        		anterior=posterior;
        		posterior=posterior.liga;
        	}
        	anterior.liga=temps2;
        	temps2.liga=posterior;
        }
}

public void recorrer2() {
        Nodo aux = raizs2;
        System.out.println("Datos de la Lista:");
        while (aux != null) {
            System.out.print(aux.info + " ");
            aux = aux.liga;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        listasimpleelevada L = new listasimpleelevada();
        listasimpleelevada lista1 = new listasimpleelevada();
        listasimpleelevada lista2 = new listasimpleelevada();
        L.insertar(3);
        L.insertar(5);
        L.insertar (7);        
        L.insertar(4);
        L.insertar(2);
        L.recorrer();
        L.separa(lista1 , lista2);
        System.out.println("\nlista elevada al cuadrado");
        lista1.recorrer1();
        System.out.println("\nlista elevada al cubo");
        lista2.recorrer2();
    }
}