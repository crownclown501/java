package Practica3.parte1;

import java.awt.Graphics;

class proceso3 extends Procesos2 implements Runnable
{
    public proceso3(Graphics g) {
        super(g);
        //TODO Auto-generated constructor stub
    }

    public void run()
    {
        B.WAIT();
        mutex.WAIT();
        System.out.println("Soy el proceso #3 y la instruccion S3");
        mutex.SIGNAL();
        D.SIGNAL();
    }
}
