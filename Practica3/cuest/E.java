package Practica3.cuest;

import java.awt.Graphics;

public class E extends Cuestionario3 implements Runnable
{
    private final Graphics g;

    public E(Graphics g)
    {
        this.g = g;
    }
    public void run()
    {
        try
        {
            cinco.WAIT();
            seis.WAIT();
            ocho.WAIT();
            mutex.WAIT();
            aviso[i] = "Soy el proceso #5 y la instruccion E";
            orden[i] = "E";
            i++;
            Thread.sleep(500);
            g.drawString("P5-E",150,100);
            g.drawOval(130, 80, 60, 60);
            mutex.SIGNAL();
            nueve.SIGNAL();
            diez.SIGNAL();
        }catch(Exception ex){}
    }
}