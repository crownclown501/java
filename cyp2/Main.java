package cyp2;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(7);

        Thread[] trabajadores = new Thread[7]; 
        for (int i = 0; i < 7; i++) {
            trabajadores[i] = new Thread(new Trabajador(caja));
            trabajadores[i].start();
        }

        for (int i = 0; i < 7; i++) {
            try {
                trabajadores[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Caja llena. Todas las gorras empacadas.");
    }
}