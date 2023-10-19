package prueba27sept;

import java.io.*;
class Procesos1
{
    protected static final SemaforoBinario SA = new SemaforoBinario(0);
    protected static final SemaforoBinario SD = new SemaforoBinario(0);
    protected static final SemaforoBinario SC = new SemaforoBinario(0);
    protected static final SemaforoBinario mutex = new SemaforoBinario(1);
    public static void main(String args[]) throws
    IOException
    {
    try
    {
        Thread P1 = new Thread(new p1());
        Thread P2 = new Thread(new p2());
        Thread P3 = new Thread(new p3());
        P1.start();
        P2.start();
        P3.start();
        Thread.sleep(300);
    }catch (InterruptedException e) {}
    //System.out.println(" Termine...");
    // System.exit(0);
    }
}