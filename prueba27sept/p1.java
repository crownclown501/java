package prueba27sept;

class p1 extends Procesos1 implements Runnable{
    public void run(){
        try {
            SA.WAIT();
            mutex.WAIT();
            System.out.println("Soy el proceso #1 y la instruccion A");
            Thread.sleep(5000);
            mutex.SIGNAL();
            SC.SIGNAL();
            mutex.SIGNAL();
        } catch (InterruptedException e) {}
    // System.err.println("interrupted out of sleep");
    }
}