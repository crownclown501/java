package Ejercicio1;

public abstract class Proceso implements Runnable {
    protected Grafo grafo;
    protected Nodo inicio;
    protected Nodo fin;

    public Proceso(Grafo grafo, Nodo inicio, Nodo fin) {
        this.grafo = grafo;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        recorrerGrafo(inicio, fin);
    }

    protected abstract void recorrerGrafo(Nodo inicio, Nodo fin);
}
