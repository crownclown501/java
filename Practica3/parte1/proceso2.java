package Practica3.parte1;

import java.awt.Graphics;

class proceso2 extends Procesos2 implements Runnable
{
    public proceso2(Graphics g) {
        super(g);
        //TODO Auto-generated constructor stub
    }

    public void run()
    {
        A.WAIT();
        mutex.WAIT();
        System.out.println("Soy el proceso #2 y la instruccion S2");
        mutex.SIGNAL();
        C.SIGNAL();
    }
}

