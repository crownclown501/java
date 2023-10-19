class Nodos {
    public int info;
    public Nodos liga;

    public Nodos(int dato) {
        info = dato;
        liga = null;
    }
}

public class ListaSimple {
    private Nodos raiz;

    public ListaSimple() {
        raiz = null;
    }

    public void insertar(int valor,int y) {
        Nodos temp = new Nodos(valor);
        if (raiz == null)
            raiz = temp;
        else {
            temp.liga = raiz;
            raiz = temp;
        }

    }

    public int eliminar() {
        if (raiz==null) {
            return 0;
        }
        else{
        Nodos aux = raiz;
        int valor = raiz.info;
        raiz = raiz.liga;
        aux.liga = null;
        return valor;
        }
    }

    public Nodos eliminarfin() // 7 12 5 8 -> null
    {
        if (raiz==null) {
            return null;
        }
        Nodos aux1 = raiz;
        while (aux1 != null) {

            if (aux1.liga.liga == null) {

                aux1.liga = null;
                aux1=aux1.liga;
            } else {
                aux1 = aux1.liga;// aux=8
            }
        }
        return raiz;
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
        ListaSimple L = new ListaSimple();
        L.insertar(8,5);
        L.insertar(2,8);
        L.insertar(6,2);
        L.insertar(10,8);
        L.insertar(12,6);
        L.recorrer();
        L.eliminarfin();
        L.recorrer();
        L.eliminar();
        L.recorrer();
        L.eliminarfin();
        L.recorrer();
    }

}