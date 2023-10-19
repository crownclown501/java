package Practica3.cuest;

import java.awt.Graphics;

public class B extends Cuestionario3 implements Runnable
{
    private final Graphics g;

    public B(Graphics g)
    {
        this.g = g;
    }
    public void run()
    {
        try
        {
            uno.WAIT();
            mutex.WAIT();
            aviso[i] = "Soy el proceso #2 y la instruccion B";
            orden[i] = "B";
            i++;
            Thread.sleep(500);
            g.drawString("P2-B",150,100);
            g.drawOval(130, 80, 60, 60);
            mutex.SIGNAL();
            cuatro.SIGNAL();
            cinco.SIGNAL();
        }catch(Exception ex){}
    }
 
}