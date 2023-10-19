package Practica3.cuest;

import java.awt.Graphics;

public class C extends Cuestionario3 implements Runnable 
{
    private final Graphics g;

    public C(Graphics g)
    {
        this.g = g;
    }
    public void run()
    {
        try
        {
            dos.WAIT();
            cuatro.WAIT();
            siete.WAIT();
            mutex.WAIT();
            aviso[i] = "Soy el proceso #3 y la instruccion C";
            orden[i] = "C";
            i++;
            Thread.sleep(500);
            g.drawString("P3-C",150,100);
            g.drawOval(130, 80, 60, 60);
            mutex.SIGNAL();
            seis.SIGNAL();
        }catch(Exception ex){}
    }
}
