import java.util.concurrent.Semaphore;

public class Proceso implements Runnable {
    private static final int MAX_PROCESOS = 10;
    private static int procesoActual = 0;
    
    private int id;
    private Semaphore semaforo;
    private Proceso[] procesos;
    private Semaphore control;

    public Proceso(int id, Semaphore semaforo, Proceso[] procesos, Semaphore control) {
        this.id = id;
        this.semaforo = semaforo;
        this.procesos = procesos;
        this.control = control;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Simula un trabajo previo

            System.out.println("Proceso " + id + " entrando en la sección crítica");
            semaforo.acquire();

            // Envía mensaje
            for (int i = 0; i < procesos.length; i++) {
                if (i != id) {
                    procesos[i].recibirMensaje("Soy el proceso #" + id);
                }
            }

            semaforo.release();
            System.out.println("Proceso " + id + " saliendo de la sección crítica");

            Thread.sleep(2000); // Simula trabajo dentro de la sección crítica
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Libera el control para permitir que otro proceso sea creado
            control.release();
        }
    }

    public void recibirMensaje(String mensaje) {
        System.out.println("Proceso " + id + " recibió el mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);
        Proceso[] procesos = new Proceso[MAX_PROCESOS];
        Semaphore control = new Semaphore(MAX_PROCESOS); // Control para limitar los procesos

        for (int i = 0; i < MAX_PROCESOS; i++) {
            try {
                control.acquire(); // Espera hasta que haya un "permiso" disponible para crear un nuevo proceso
                procesos[i] = new Proceso(procesoActual++, semaforo, procesos, control);
                new Thread(procesos[i]).start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
