package cyp2;

class Trabajador implements Runnable {
    private String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};
    private Caja caja;

    public Trabajador(Caja caja) {
        this.caja = caja;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            Gorra gorra = new Gorra(colores[i], Math.random() < 0.4); 
            if (caja.agregarGorra(gorra)) {
                try {
                    Thread.sleep(100); // Simula el tiempo de revisión y empaque
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}