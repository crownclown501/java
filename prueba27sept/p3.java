package prueba27sept;

public class p3 extends Procesos1 implements Runnable{
    public void run()
    {
        try {
            SD.WAIT();
            mutex. WAIT();
            System.out.println("Soy el proceso #3 y la instruccion D");
            Thread.sleep(5000);
            //System.out.flush();
            mutex.SIGNAL();
            SC.SIGNAL();
        } catch (InterruptedException e) {}
    }
}