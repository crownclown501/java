package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Agrega nodos y aristas al grafo según tu necesidad
        // ...

        Nodo inicioP1 = grafo.obtenerNodo("S1");
        Nodo finP1 = grafo.obtenerNodo("S5");
        Proceso p1 = new P1(grafo, inicioP1, finP1);

        Nodo inicioP2 = grafo.obtenerNodo("S6");
        Nodo finP2 = grafo.obtenerNodo("S8");
        Proceso p2 = new P2(grafo, inicioP2, finP2);

        Nodo inicioP3 = grafo.obtenerNodo("S9");
        Nodo finP3 = grafo.obtenerNodo("S10");
        Proceso p3 = new P3(grafo, inicioP3, finP3);

        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(p2);
        Thread thread3 = new Thread(p3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
