import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

public class Lista {

    private Lista liga;
    private int dato;

    public static Scanner teclado = new Scanner(System.in);
    public static PrintStream out;
    public static String FLECHA = "\u2500\u25BA";
   
    private Lista() {}

    public static Lista insertar(Lista cabecera, int dato) {
        Lista nodo = new Lista();
        nodo.liga = cabecera;
        nodo.dato = dato;
        return nodo;
    }

    public static Lista quitar(Lista nodo, int dato) {
        if (nodo != null) {
            if (nodo.dato == dato)
                return quitar_ultimo(nodo);
            nodo.liga = quitar(nodo.liga, dato);
        }
        return nodo;
    }

    public static void listar(Lista nodo) {
        if (nodo != null) {
            listar(nodo.liga);
            out.println(nodo.dato);
        }
    }

    public static boolean ordenar(Lista nodo) {
        int dato;
        boolean cambio = false;
        if (nodo != null && nodo.liga != null) {
            if (nodo.dato < nodo.liga.dato) {
                dato = nodo.dato;
                nodo.dato = nodo.liga.dato;
                nodo.liga.dato = dato;
                cambio = true;
            }
            cambio = cambio || ordenar(nodo.liga);
            if (cambio)
                ordenar(nodo);
        }
        return cambio;
    }

    public static Lista invertir(Lista nodo, Lista inversa) {
        if (nodo != null)
            inversa = invertir(nodo.liga, insertar(inversa, nodo.dato));
        return inversa;
    }

    public static void imprimir(Lista nodo) {
        if (nodo != null) {
            out.print(nodo.dato + " " + FLECHA + " ");
            imprimir(nodo.liga);
        } else
            out.println("null\n");
    }

    public static int tamano(Lista nodo) {
        return nodo == null ? 0 : 1 + tamano(nodo.liga);
    }

    public static Lista insertar_primero(Lista nodo, int dato) {
        if (nodo == null)
            return insertar(null, dato);
        nodo.liga = insertar_primero(nodo.liga, dato);
        return nodo;
    }

    public static Lista quitar_primero(Lista nodo) {
        if (nodo != null) {
            if (nodo.liga == null)
                return quitar_ultimo(nodo);
            nodo.liga = quitar_primero(nodo.liga);
        }
        return nodo;
    }

    public static boolean contiene(Lista nodo, int dato) {
        return nodo != null && (nodo.dato == dato || contiene(nodo.liga, dato));
    }

    public static Lista quitar_ultimo(Lista nodo) {
        return nodo != null ? nodo.liga : null;
    }

    public static int leer_entero(String mensaje) {
        int entero;
        out.print("Ingrese " + mensaje + ": ");
        entero = Integer.parseInt(teclado.nextLine());
        out.println();
        return entero;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Lista cabecera = null;
        int dato;
        String input;
        char opcion;
        Random random = new Random();
        if(System.getProperties().get("os.name").equals("Linux") || System.console()==null)
            out = new PrintStream(System.out);
        else {
            out = new PrintStream(System.out, true, "CP850");
            FLECHA = "\u2500\20";
        }
        do {
            out.println("\n\n\n\n\n\n\n\n");
            out.print("OPERACIONES B\u00C1SICAS DE LISTAS LIGADAS\n"
                    + "a) Insertar un n\u00FAmero al final\n"
                    + "b) Quitar el \u00FAltimo n\u00FAmero\n"
                    + "c) Listar n\u00FAmeros\n"
                    + "d) Tama\u00F1o de la lista\n"
                    + "e) Vaciar lista\n"
                    + "OPERACIONES COMPLEMENTARIAS\n"
                    + "f) Insertar n\u00FAmeros aleatorios\n"
                    + "g) Insertar un n\u00FAmero al principio\n"
                    + "h) Consular si contiene un n\u00FAmero\n"
                    + "i) Quitar un n\u00FAmero a buscar\n"
                    + "j) Quitar el primer n\u00FAmero\n"
                    + "k) Ordenar lista\n"
                    + "l) Ivertir lista\n"
                    + "m) Salir\n\n"
                    + "Seleccione una opci\u00F3n: ");
            do {
                input = teclado.nextLine().toLowerCase();
            } while (input == null || input.length() != 1 || input.charAt(0) < 'a' || input.charAt(0) > 'm');
            opcion = input.charAt(0);
            if (opcion != 'm') {
                out.println();
                if (cabecera == null && opcion != 'a' && opcion != 'd' && opcion != 'f' && opcion != 'g')
                    out.println("La lista est\u00E1 vac\u00EDa.\n");
                else {
                    if (opcion != 'c' && opcion != 'd' && opcion != 'h') {
                        out.println("Lista original:");
                        Lista.imprimir(cabecera);
                    }
                    switch (opcion) {
                    case 'a': /* Insertar un numero al final */
                        dato = leer_entero("el n\u00FAmero a insertar");
                        cabecera = Lista.insertar(cabecera, dato);
                        break;
                    case 'b': /* Quitar el ultimo numero */
                        cabecera = Lista.quitar_ultimo(cabecera);
                        break;
                    case 'c': /* Listar numeros */
                        Lista.listar(cabecera);
                        out.println();
                        break;
                    case 'd': /* Tamano de la lista */
                        out.println("Tama\u00F1o de la lista: " + Lista.tamano(cabecera) + ".\n");
                        break;
                    case 'e': /* Vaciar lista */
                        while (cabecera != null)
                            cabecera = Lista.quitar_ultimo(cabecera);
                        break;
                    case 'f': /* Insertar numeros aleatorios */
                        dato = leer_entero("la cantidad de n\u00FAmeros aleatorios a insertar");
                        for (; dato > 0; dato--)
                            cabecera = Lista.insertar(cabecera, random.nextInt(1000));
                        break;
                    case 'g': /* Insertar un numero al principio */
                        dato = leer_entero("el n\u00FAmero a insertar");
                        cabecera = Lista.insertar_primero(cabecera, dato);
                        break;
                    case 'h': /* Consular si existe un numero */
                        dato = leer_entero("el n\u00FAmero a consultar");
                        out.println("El n\u00FAmero " + dato + " "
                            + (Lista.contiene(cabecera, dato) ? "s\u00ED" : "no")
                            + " est\u00E1 en la lista.\n");
                        break;
                    case 'i': /* Quitar un numero a buscar */
                        dato = leer_entero("el n\u00FAmero a quitar");
                        cabecera = Lista.quitar(cabecera, dato);
                        break;
                    case 'j': /* Quitar el primer numero */
                        cabecera = Lista.quitar_primero(cabecera);
                        break;
                    case 'k': /* Ordenar lista */
                        Lista.ordenar(cabecera);
                        break;
                    case 'l': /* Ivertir lista */
                        cabecera = Lista.invertir(cabecera, null);
                        break;
                    }
                    if (opcion != 'c' && opcion != 'd' && opcion != 'h') {
                        out.println("Lista actualizada:");
                        Lista.imprimir(cabecera);
                    }
                }
                out.print("Presione <ENTER> tecla para continuar . . . ");
                teclado.nextLine();
            }
        } while (opcion != 'm');
    }

}