import java.util.concurrent.Semaphore;

public class Proceso implements Runnable {
    private int id;
    private Semaphore semaforo;
    private Proceso[] procesos;

    public Proceso(int id, Semaphore semaforo, Proceso[] procesos) {
        this.id = id;
        this.semaforo = semaforo;
        this.procesos = procesos;
    }

    @Override
    public void run() {
        while (true) {
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
            }
        }
    }

    public void recibirMensaje(String mensaje) {
        System.out.println("Proceso " + id + " recibió el mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        int numProcesos = 3;
        Semaphore semaforo = new Semaphore(1);
        Proceso[] procesos = new Proceso[numProcesos];

        for (int i = 0; i < numProcesos; i++) {
            procesos[i] = new Proceso(i, semaforo, procesos);
            new Thread(procesos[i]).start();
        }
    }
}


