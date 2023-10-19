class Nodo {
    public int info;
    public Nodo liga;

    public Nodo(int dato) {
        info = dato;
        liga = null;
    }
}

public class par_impar {
    private Nodo raiz;
    public par_impar() {
        raiz = null;
    }
    Nodo aux = raiz; 
    public void insertar(int valor) {//8 7 5 4 2 
        Nodo temp = new Nodo(valor);
       
        if (raiz == null && temp.info%2==0) {
            raiz = temp;
        } else if (raiz == null && temp.info%2!=0) {
            raiz=temp;
            raiz.liga = temp;
            aux=raiz.liga;
        } else if(temp.info%2==0) {
            temp.liga=raiz;
            raiz=temp;
        } else if(temp.info%2!=0) {
            aux.liga=temp;
            aux=temp;
        }
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
    public static void main(String[] args) {
        par_impar L = new par_impar();
        L.insertar(7);
        L.insertar(8);
        L.insertar(5);
        L.insertar(4);
        L.insertar(3);
        L.insertar(2);
        L.insertar(10);
        L.recorrer();
    }
}
