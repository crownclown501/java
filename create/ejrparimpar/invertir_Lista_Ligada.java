class Nodos {
    public int info;
    public Nodos liga;
    
    public Nodos(int dato) {
        info = dato;
        liga = null;
       
    }
}

public class invertir_Lista_Ligada {
    private Nodos raiz;
    private Nodos invertida;
    private Nodos fin;
    public invertir_Lista_Ligada() {
        raiz = null;
        invertida=null;
        fin=null;
    }

    public void insertar(int valor) {
        Nodos temp = new Nodos(valor);
        if (raiz == null){
            raiz = temp;
            fin=temp;
        }else {
            fin.liga = temp;
            fin = temp;
        }
    }

    public void invertir_Lista()
    {
        Nodos aux=raiz;
        int help=0;
        while (aux!=null) {
            help=aux.info;
            aux=aux.liga;
            Nodos temp = new Nodos(help);
        if (raiz == null)
            invertida = temp;
        else {
            temp.liga = invertida;
            invertida = temp;
        }
        }
    }
    public void recorrer_lista_invertida() {
        invertir_Lista();
        Nodos aux1 = invertida;
        System.out.println("Datos de la Lista:");
        while (aux1 != null) {
            System.out.print(aux1.info + " ");
            aux1 = aux1.liga;
        }
        System.out.println();
    }

    public void recorrer() {
        Nodos aux = raiz;
        System.out.println("Datos de la Lista:");
        while (aux != null) {
            System.out.print(aux.info + " ");
            aux = aux.liga;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        invertir_Lista_Ligada L = new invertir_Lista_Ligada();
        System.out.println("lista normal:");
        L.insertar(5);L.insertar(8);L.insertar(6);L.insertar(2);
        L.recorrer();
        System.out.println("lista invertida:");
        
        L.recorrer_lista_invertida();
       // L.eliminarfin();
        //L.recorrer();
        //L.eliminar();
        //L.recorrer();
        //L.eliminarfin();
        //L.recorrer();
    }

}