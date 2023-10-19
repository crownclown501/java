package Practica3.parte1;

class proceso1 extends Procesos2 implements Runnable
{
    public void run()
    {
        mutex.WAIT();
        System.out.println("Soy el proceso #1 y la instruccion S1");
        mutex.SIGNAL();
        A.SIGNAL();
        B.SIGNAL();
        /*mutex.WAIT();
        System.out.println("Soy el proceso #1 y la instruccion B");
        mutex.SIGNAL();*/
    }
}