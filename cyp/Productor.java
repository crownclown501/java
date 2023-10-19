package cyp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.BlockingQueue;

class Productor implements Runnable {
    private BlockingQueue<Alumno> cola;
    private String archivoEntrada;

    public Productor(BlockingQueue<Alumno> cola, String archivoEntrada) {
        this.cola = cola;
        this.archivoEntrada = archivoEntrada;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    String[] partes = linea.split(",");
                    String nombre = partes[0];
                    float calificacion = Float.parseFloat(partes[1]);
                    Alumno alumno = new Alumno(nombre, calificacion);
                    cola.put(alumno);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}