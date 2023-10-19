class Nodo {
    public int info;
    public Nodo liga;
    public Nodo(int dato) {
        info = dato;
        liga = null;
    }
}

public class listasimpleimpar {
    private Nodo raiz;
    public listasimpleimpar() {
        raiz = null;
       
    }
  
    public void insertar(int valor) {
        Nodo temp = new Nodo(valor);
        if (raiz == null) {
            raiz = temp;
        } else {
            temp.liga = raiz;
            raiz = temp;
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

    public void separa(listasimpleimpar lista1){
        Nodo aux1 = raiz;
        while (aux1 != null) {
            if(aux1.info%2!=0){
                lista1.insertar(aux1.info);
                } 
            aux1 = aux1.liga;  
            }
            System.out.println("");
        }
    public static void main(String[] args) {
        listasimpleimpar L = new listasimpleimpar();
        listasimpleimpar lista1 = new listasimpleimpar();
        L.insertar(3);
        L.insertar(5);
        L.insertar (7);        
        L.insertar(4);
        L.insertar(2);
        L.recorrer();
        L.separa(lista1);
        System.out.println("\nlista impar");
        lista1.recorrer();
        System.out.println();
    }
}