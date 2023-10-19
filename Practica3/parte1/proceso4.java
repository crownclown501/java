package Practica3.parte1;

import java.awt.Graphics;

class proceso4 extends Procesos2 implements Runnable
{
    public proceso4(Graphics g) {
        super(g);
        //TODO Auto-generated constructor stub
    }

    public void run()
    {
        C.WAIT();
        D.WAIT();
        mutex.WAIT();
        System.out.println("Soy el proceso #4 y la instruccion S4");
        mutex.SIGNAL();
        mutex.WAIT();
        System.out.println("Soy el proceso #4 y la instruccion S5");
        mutex.SIGNAL();
    }
}
