package Ejercicio1;

import java.util.Map;

public class P2 extends Proceso {
    public P2(Grafo grafo, Nodo inicio, Nodo fin) {
        super(grafo, inicio, fin);
    }

    @Override
    protected void recorrerGrafo(Nodo inicio, Nodo fin) {
        Nodo nodoActual = inicio;

        while (nodoActual != null && !nodoActual.equals(fin)) {
            System.out.println("P2 está en " + nodoActual.getNombre());

            // Obtén las aristas del nodo actual
            Map<String, Nodo> aristas = nodoActual.obtenerAristas();

            // Encuentra la siguiente arista para seguir el recorrido
            String siguienteArista = null;
            Nodo siguienteNodo = null;

            for (Map.Entry<String, Nodo> entry : aristas.entrySet()) {
                siguienteArista = entry.getKey();
                siguienteNodo = entry.getValue();
                break; // Tomamos la primera arista, pero puedes implementar tu lógica aquí
            }

            if (siguienteNodo != null) {
                System.out.println("P2 pasa por " + siguienteArista);
                nodoActual = siguienteNodo;
            } else {
                // No hay aristas salientes, hemos llegado al fin del proceso
                break;
            }
        }

        System.out.println("P2 ha llegado al fin del proceso en " + fin.getNombre());
    }
}
