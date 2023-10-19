package Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Nodo {
    private String nombre;
    private Map<String, Nodo> aristas = new HashMap<>();

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarArista(String nombre, Nodo nodo) {
        aristas.put(nombre, nodo);
    }

    public Map<String, Nodo> obtenerAristas() {
        return aristas;
    }
}
