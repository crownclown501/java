package Practica3.cuest;

import java.awt.Graphics;

public class G extends Cuestionario3 implements Runnable 
{
    private final Graphics g;

    public G(Graphics g)
    {
        this.g = g;
    }
    public void run()
    {
        try
        {
            diez.WAIT();
            once.WAIT();
            mutex.WAIT();
            aviso[i] = "Soy el proceso #7 y la instruccion G";
            orden[i] = "G";
            Thread.sleep(500);
            g.drawString("P1-A",150,100);
            g.drawOval(130, 80, 60, 60);
            mutex.SIGNAL();
        }catch(Exception ex){}
    }
}