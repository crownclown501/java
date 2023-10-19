class Nodoc {
    public int info;
    public Nodoc adelante;
    public Nodoc atras;

    public Nodoc(int dato) {
        info = dato;
        adelante = null;
        atras = null;
    }
}

public class listadoblesimple {
    private Nodoc raiz;
    private Nodoc fin;

    public listadoblesimple() {
        raiz = null;
        fin = null;
    }

    public void setnode(int valor) {
        Nodoc temp = new Nodoc(valor);
        if (raiz == null) {
            raiz = temp;
            fin = temp;
        } else {
            temp.atras = null;
            raiz.atras = temp;
            temp.adelante = raiz;
            raiz = temp;
        }
    }

    public void readforward() {
        Nodoc aux = raiz;
        while (aux != null) {
            System.out.print(" <-[" + aux.info + "]-> ");
            aux = aux.adelante;
        }
    }

    public void readbackward() {
        Nodoc aux = fin;
        while (aux != null) {
            System.out.print(" <-[" + aux.info + "]-> ");
            aux = aux.atras;
        }
    }
    public static void main(String[] args) {
        listadoblesimple L = new listadoblesimple();
        L.setnode(3);
        L.setnode(5);
        L.setnode(7);
        L.setnode(4);
        L.setnode(2);
        System.out.println("lectura hacia adelante:");
        L.readforward();
        System.out.println("\nlectura hacia atras:");
        L.readbackward();
        System.out.println();
    }
}