class NodoCd {
    public int info;
    public NodoCd next;
    public NodoCd last; // [2]->[5] array[i]+=1 temp.next raiz.next

    public NodoCd(int dato) {
        info = dato;
        next = null;
        last = null;
    }
}

public class ListaCircularDoble {
    private NodoCd raiz;
    private NodoCd fin;

    public ListaCircularDoble() {
        raiz = null;
        fin = null;
    }

    public void InsertarOrden(int data) {
        NodoCd temp = new NodoCd(data); // 1 0 20 3 12 4
        if (raiz == null) {  //->[1]-><-[1]-><-[1]-><-[]-><-[]-><-[]-><-[]->
            temp.next = temp;
            temp.last = temp;
            raiz = temp;
            fin = temp; 
        } else if (temp.info <= raiz.info) { // 0 <= 1
            temp.next = raiz;  //1
            temp.last=fin;
            raiz.last = temp;
            fin.next=temp;
            raiz = temp;
            
        } else if (temp.info >= fin.info) { // 4>=12
            temp.next=fin;
            temp.last = fin;
            fin.next = temp;
            fin = temp;// 12
        } else if (temp.info > raiz.info && temp.info < fin.info) {
            NodoCd anterior = null;
            NodoCd posterior = raiz.last;
            while (posterior.info <= temp.info) {
                anterior = posterior;
                posterior = posterior.next;
            }
            anterior.next = temp;
            temp.next = posterior;
        }
        if (raiz.last == null && fin.next == null) {
            raiz.last = fin;
            fin.next = raiz;
        }
    }

    public NodoCd eliminarDesdeFin(int valor2) {
        if (raiz.info == valor2) {
            raiz = raiz.last;
            return raiz;
        }
        NodoCd aux1 = raiz;
        while (aux1.info != valor2) {
            if (aux1.last != null && aux1.last.info == valor2) {
                aux1.last = fin.last.last;

            } else {
                aux1 = aux1.last;
            }
        }
        return aux1;
    }

    public NodoCd eliminarDesdeRaiz(int valor1) {
        if (raiz.info == valor1) {
            raiz = raiz.last;
            return raiz;
        }
        NodoCd aux1 = raiz;
        while (aux1 != null) {

            if (aux1.last != null && aux1.last.info == valor1) {
                aux1.last = aux1.last.last;

            } else {
                aux1 = aux1.last;
            }
        }
        return aux1;
    }

    public void recorrer_hacia_adelante() {
        NodoCd aux = raiz;
        System.out.println("Lista nextda Ordenada: ");

        while (aux.info != raiz.next.info) {
            System.out.print(aux.info + " ");
            aux = aux.next;

        }
    }

    public static void main(String[] args) {
        ListaCircularDoble dobleXD = new ListaCircularDoble();
        System.out.println("Datos:\n");
        dobleXD.InsertarOrden(1);
        dobleXD.InsertarOrden(20);
        dobleXD.InsertarOrden(3);
        dobleXD.InsertarOrden(12);
        dobleXD.InsertarOrden(4);
        dobleXD.recorrer_hacia_adelante();
        System.out.println("");
        dobleXD.eliminarDesdeRaiz(4);
        dobleXD.recorrer_hacia_adelante();
        System.out.println("");
    }
}
