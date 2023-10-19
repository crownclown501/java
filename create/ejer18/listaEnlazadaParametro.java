class Nodo {
    public int info; // info va a ser nuestro helper para saber lo que este dentro del nodo en el que
                     // estemos
    public Nodo liga;

    public Nodo(int dato) // esta funcion va a ayudar a que se le asigne un valor a nodo
    {
        info = dato;
        liga = null;
    }
}

public class listaEnlazadaParametro {
    private Nodo primero; // primero vamos a posicional al inicio
    private Nodo ultimo; // ultimo vamos a posicionarlo al final

    public listaEnlazadaParametro() {
        primero = null; // asignamos a ambos el valor de null pa decirles que no tienen ningun dato al
                        // inciar el programa
        ultimo = null;
    }

    public void insertar(int valor) {
        Nodo temp = new Nodo(valor); // llamamos a la funcion Nodo que esta dentro de la clase nodo y entonces temo
                                     // va a ser igual a la posicion que insertemos
        if (primero == null) // insertar el primer nodo de la listOrdenada
        {
            primero = temp; // ambos reciben el mismo valor ya que no existe un nodo
            ultimo = temp;
        } else if (temp.info <= primero.info) // insertar atras imagina que temp.info es 2 y primero es 2 entonces
                                              // entramos al if
        {
            temp.liga = primero;// el siguiente nodo vas a asignarle la variable primero null=2
            primero = temp;// y primero va a obtener la informacion que tiene temp principal 2=2
        } else if (temp.info >= ultimo.info) // isertar al final 2>=2 entonces no entra pero si temp se volviera 5y
                                             // ultimo fuese 2 entonces entra
        { // este sirve mas que nada para cuando metes un nuevo nodo y ya tienes todos tus
          // datos ordenandos
            ultimo.liga = temp; // por ejemplo si yo tengo un 8 y inseto un 9 pues tengo que agregar ese nuevo
                                // nodo y ponerlo como ultimo 'cause cuando
                                // el codigo es diferente puedes terminar imprimiendo todos tus nodos pero sin
                                // el nuevo o imprimir solo el nuevo
            ultimo = temp; // ultimorecibe el dato de 8 pero el siguiente nodo ya existe y esta conectado a
                           // los demas nodos asi que ya se va a impirmir bien
        } else { // inserta en medio
            Nodo anterior = null;
            Nodo posterior = primero;
            while (posterior.info <= temp.info) {
                anterior = posterior;
                posterior = posterior.liga;
            }
            anterior.liga = temp;
            temp.liga = posterior;
        }
    }

    public void recorrer(int x) {
        Nodo aux = primero;
        int contador = 0;
        System.out.println("Lista Ligada Ordenada: ");
        while (aux != null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null
        {
            if (aux.info == x) {
                contador += 1;
            }
            System.out.print(aux.info + " ");
            aux = aux.liga;// aux+=1; // null
        }
        System.out.println();
        System.out.println("\nEl parametro [" + x + "] se repite " + contador + " veces");
    }

    public static void main(String[] args) {
        listaEnlazadaParametro L = new listaEnlazadaParametro();
        System.out.println("datos antes de eliminar");
        L.insertar(0);
        L.insertar(10);
        L.insertar(5);
        L.insertar(2);
        L.insertar(5);
        L.insertar(20);
        L.insertar(10);
        L.insertar(9);
        L.insertar(8);
        L.insertar(5);
        L.insertar(9);
        L.insertar(7);
        L.insertar(5);
        L.recorrer(5);
        System.out.println();

    }
}
