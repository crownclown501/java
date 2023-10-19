import java.util.concurrent.Semaphore;
/**Enviar los mensajes de cada proceso según
entren a la sección critica mandando el
mensaje soy el proceso #1 y la instrucción s#
utilizando semáforos. (crear el semáforo) */
public class intento2 implements Runnable {
    private static final int MAX_PROCESOS = 10;//numero maximo de procesos que querramos
    private static int procesoActual = 0;
    
    private int id;
    private Semaphore semaforo;
    private intento2[] procesos;
    private Semaphore control;

    public intento2(int id, Semaphore semaforo, intento2[] procesos, Semaphore control) {
        this.id = id;
        this.semaforo = semaforo;
        this.procesos = procesos;
        this.control = control;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Simula un trabajo previo
            //aca se hace el punto a de obtener el par begin/end
            System.out.println("Proceso " + id + " entrando en la sección crítica (begin)");
            semaforo.acquire();//punto donde se llama para adquirir al semaforo,en caso de estar en uso este no corre

            // Envía mensaje
            for (int i = 0; i < procesos.length; i++) {
                if (i != id) {
                    procesos[i].recibirMensaje("Soy el proceso #" + id);
                }
            }

            semaforo.release();///aca liberamos el semaforo para que pueda entrar otro en la parte de arriba 
            System.out.println("Proceso " + id + " saliendo de la sección crítica (end)");

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
        intento2[] procesos = new intento2[MAX_PROCESOS];
        Semaphore control = new Semaphore(MAX_PROCESOS); // Control para limitar los procesos

        for (int i = 0; i < MAX_PROCESOS; i++) {
            try {
                control.acquire(); // Espera hasta que haya un "permiso" disponible para crear un nuevo proceso
                procesos[i] = new intento2(procesoActual++, semaforo, procesos, control);
                new Thread(procesos[i]).start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
