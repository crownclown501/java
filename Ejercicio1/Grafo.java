package Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Grafo {
    private Map<String, Nodo> nodos = new HashMap<>();
    private Nodo nodoInicio = new Nodo("inicio");
    private Nodo nodoFin = new Nodo("fin");

    public Grafo() {
        nodos.put("inicio", nodoInicio);
        nodos.put("fin", nodoFin);
    }

    public void agregarNodo(String nombre) {
        nodos.put(nombre, new Nodo(nombre));
    }

    public Nodo obtenerNodo(String nombre) {
        return nodos.get(nombre);
    }

    public void agregarArista(String nombre, String inicio, String fin) {
        Nodo nodoInicio = obtenerNodo(inicio);
        Nodo nodoFin = obtenerNodo(fin);

        if (nodoInicio != null && nodoFin != null) {
            nodoInicio.agregarArista(nombre, nodoFin);
        }
    }
}
