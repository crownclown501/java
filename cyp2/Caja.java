package cyp2;

import java.util.concurrent.Semaphore;

class Caja {
    private int capacidad;
    private int gorrasDiferentes;
    private Semaphore semaforo;

    public Caja(int capacidad) {
        this.capacidad = capacidad;
        this.gorrasDiferentes = 0;
        this.semaforo = new Semaphore(1); // Semáforo binario para controlar el acceso a la caja
    }

    public boolean agregarGorra(Gorra gorra) {
        if (!gorra.tieneDefectos()) {
            try {
                semaforo.acquire(); // Adquiere el semáforo
                if (gorrasDiferentes < capacidad) {
                    gorrasDiferentes++;
                    System.out.println("Agregada gorra de color " + gorra.getColor());
                    return true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaforo.release(); // Libera el semáforo
            }
        }
        return false;
    }
}