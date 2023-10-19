package Practica3.cuest;

import java.awt.Graphics;

public class D extends Cuestionario3 implements Runnable 
{
    private final Graphics g;

    public D(Graphics g)
    {
        this.g = g;
    }
    public void run()
    {
        try
        {
            tres.WAIT();
            mutex.WAIT();
            aviso[i] = "Soy el proceso #4 y la instruccion D";
            orden[i] = "D";
            i++;
            Thread.sleep(500);
            g.drawString("P4-D",150,100);
            g.drawOval(130, 80, 60, 60);
            mutex.SIGNAL();
            siete.SIGNAL();
            ocho.SIGNAL();
        }catch(Exception ex){}
    }
}