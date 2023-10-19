import java.util.Scanner;

class Nodos {
    public int info;
    public Nodos adelante;
    public Nodos atras;
    public Nodos(int dato) {
        info = dato;
        adelante = null;
        atras = null;
    }
}

public class listadobleconswitch {
    private Nodos raiz;
    private Nodos fin;
    public listadobleconswitch() {
        raiz = null;
        fin = null;
    }

    public void setnode(int valor) {
        Nodos temp = new Nodos(valor);
        if (raiz == null) {
            raiz = temp;
            fin = temp;
        } else {
            raiz.atras = temp;
            temp.adelante = raiz;
            raiz = temp;
        }
    }

    public void readforward_and_or_backward(Nodos node) {
        Nodos aux = node;
        while (aux != null) {
            System.out.print(" <-[" + aux.info + "]-> ");
            if (node==raiz) {
                aux = aux.adelante;
            }else{
                aux = aux.atras;
            } 
        }
    }
    public static void main(String[] args) {
        listadobleconswitch L = new listadobleconswitch();
        Scanner reader=new Scanner(System.in);
        System.out.println("1)leer haci adelante\n2)leer hacia atras");
        int noder = reader.nextInt();
        L.setnode(3);
        L.setnode(5);
        L.setnode(7);
        L.setnode(4);
        L.setnode(2);
        switch (noder) {
            case 1:
                L.readforward_and_or_backward(L.raiz);
                break;
                case 2:
                L.readforward_and_or_backward(L.fin);
                break;
            default:
                break;
        }
        reader.close();
        System.out.println();
    }
}