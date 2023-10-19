package Practica3.cuest;

import java.awt.Graphics;

public class A extends Cuestionario3 implements Runnable 
{
    private final Graphics g;

    public A(Graphics g)
    {
        this.g = g;
    }
    public void run()
    {
        try{
            mutex.WAIT();
            aviso[i] = "Soy el proceso #1 y la instruccion A";
            orden[i] = "A";
            i++;
            Thread.sleep(500);
            g.drawString("P1-A",150,100);
            g.drawOval(130, 80, 60, 60);
            mutex.SIGNAL();
            uno.SIGNAL();
            dos.SIGNAL();
            tres.SIGNAL();
        }catch(Exception ex){}
    }
}