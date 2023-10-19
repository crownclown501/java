import java.util.concurrent.Semaphore;
//import java.util.ArrayList;
//import java.util.List;
/**Enviar los mensajes de cada proceso segun
entren a la sección critica mandando el
mensaje soy el proceso #1 y la instruccion s#
utilizando semaforos. (crear el semáforo) */
public class intento3 implements Runnable {
    private static final int MAX_PROCESOS = 10;//numero maximo de procesos que querramos
    private static int procesoActual = 0;
    
    private int id;
    private Semaphore semaforo;
    private intento3[] procesos;
    private Semaphore control;
   // private List<Integer> dependencias = new ArrayList<>();

    public intento3(int id, Semaphore semaforo, intento3[] procesos, Semaphore control) {
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
            System.out.println("Proceso " + id + " en la sección crítica (cobegin)");
            // Registra la dependencia del proceso actual en el grafo de precedencia
            /*for (int i = 0; i < procesos.length; i++) {
                if (i != id) {
                    procesos[i].agregarDependencia(id);
                }
            }*/
            
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
            control.release(); // Libera el control para permitir que otro proceso sea creado
        }
    }

    public void recibirMensaje(String mensaje) {
        System.out.println("Proceso " + id + " recibió el mensaje: " + mensaje);
    }

    /*public void agregarDependencia(int procesoDependiente) {
        dependencias.add(procesoDependiente);
    }
    public void imprimirGrafoPrecedencia() {
        System.out.println("Grafo de Precedencia para Proceso #" + id + ": " + dependencias);
    } */
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);
        intento3[] procesos = new intento3[MAX_PROCESOS];
        Semaphore control = new Semaphore(MAX_PROCESOS);
        for (int i = 0; i < MAX_PROCESOS; i++) {
            try {
                control.acquire();
                procesos[i] = new intento3(procesoActual++, semaforo, procesos, control);
                new Thread(procesos[i]).start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*for (int i = 0; i < MAX_PROCESOS; i++) {
            try {
                procesos[i].imprimirGrafoPrecedencia();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } */ 
    }
}
