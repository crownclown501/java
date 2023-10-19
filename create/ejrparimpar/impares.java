class Nodoi {
    public int info;
    public Nodoi liga;

    public Nodoi(int dato) {
        info = dato;
        liga = null;
    }
}

public class impares {
    private Nodoi raiz;
    private Nodoi raizi;
    public impares() {
        raiz = null;
        raizi=null;
    }
    Nodoi aux = raiz; 
    public void insertar(int valor) {//8 7 5 4 2 
        Nodoi temp = new Nodoi(valor);
       
        if (raiz == null ) {
            raiz = temp;
        } else  {
            temp.liga=raiz;
            raiz=temp;
        }
    }

    public void impar()
    {
        Nodoi aux=raiz;
        if (raiz==null) {
            return;
        }
        else{
            int help=0;
        while (aux!=null) {
            help=aux.info;
            aux=aux.liga;
            Nodoi temp = new Nodoi(help);
                if (raizi == null &&temp.info%2!=0) {
                    raizi = temp;
                } else if(temp.info%2!=0) {
                    temp.liga=raizi;
                    raizi=temp;
                }
            }
        }
    }

    public void recorrer() {
        impar();
        Nodoi aux = raizi;
        System.out.println("Datos de la Lista:");
        while (aux != null) {
            System.out.print(aux.info + " ");
            aux = aux.liga;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        impares L = new impares();
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
