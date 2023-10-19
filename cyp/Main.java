package cyp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class Main {
    public static void main(String[] args) {
        BlockingQueue<Alumno> cola = new LinkedBlockingQueue<>();
        String archivoEntrada = "calificaciones.txt";
        String archivoSalida = "aprobados.txt";

        Thread productorThread = new Thread(new Productor(cola, archivoEntrada));
        Thread consumidorThread = new Thread(new Consumidor(cola, archivoSalida));

        productorThread.start();
        consumidorThread.start();
    }
}