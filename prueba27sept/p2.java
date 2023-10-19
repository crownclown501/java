package prueba27sept;

class p2 extends Procesos1 implements Runnable{
public void run()
{
try {
mutex.WAIT();
System.out.println("Soy el proceso #2 y la instruccion B");
Thread.sleep(5000);
//System.out.flush();
mutex.SIGNAL();
SA.SIGNAL();
SD.SIGNAL();
} catch (InterruptedException e) {}
try {
SC.WAIT();
SC.WAIT();
mutex.WAIT();
System.out.println("Soy el proceso #2 y la instruccion C");
Thread.sleep(5);
mutex.SIGNAL();
} catch (InterruptedException e) {}
}
}