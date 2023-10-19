package cyp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;
class Consumidor implements Runnable {
    private BlockingQueue<Alumno> cola;
    private String archivoSalida;

    public Consumidor(BlockingQueue<Alumno> cola, String archivoSalida) {
        this.cola = cola;
        this.archivoSalida = archivoSalida;
    }

    public void run() {
        try {
            try (PrintWriter writer = new PrintWriter(new FileWriter(archivoSalida))) {
                while (true) {
                    try {
                        Alumno alumno = cola.take();
                        if (alumno.getCalificacion() >= 6.0) {
                            System.out.println("Alumno aprobado: " + alumno);
                            writer.println(alumno.toString());
                            writer.flush();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
