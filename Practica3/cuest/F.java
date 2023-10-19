package Practica3.cuest;

import java.awt.Graphics;

public class F extends Cuestionario3 implements Runnable 
{
    private final Graphics g;

    public F(Graphics g)
    {
        this.g = g;
    }
    public void run()
    {
        try
        {
            nueve.WAIT();
            mutex.WAIT();
            aviso[i] = "Soy el proceso #6 y la instruccion F";
            orden[i] = "F";
            i++;
            Thread.sleep(500);
            g.drawString("P6-F",150,100);
            g.drawOval(130, 80, 60, 60);
            mutex.SIGNAL();
            once.SIGNAL();
        }catch(Exception ex){}
    }
}