package Practica3.parte1;
import java.io.IOException;
import java.awt.Graphics;
/*import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.Dimension;
*/
public class Procesos2
{
    
    protected static final SemaforoBinario A = new SemaforoBinario(0);
    protected static final SemaforoBinario B = new SemaforoBinario(0);
    protected static final SemaforoBinario C = new SemaforoBinario(0);
    protected static final SemaforoBinario D = new SemaforoBinario(0);
    protected static final SemaforoBinario mutex = new SemaforoBinario(1);
    static Graphics g;
    public Procesos2(Graphics g) {

    }
    public static void main(String args[]) throws IOException{
    try {
        Thread P1 = new Thread(new proceso1());
        Thread P2 = new Thread(new proceso2(g));
        Thread P3 = new Thread(new proceso3(g));
        Thread P4 = new Thread(new proceso4(g));
        P1.start();
        P2.start();
        P3.start();
        P4.start();
        Thread.sleep(10);
    } catch (InterruptedException e) {}
    }
}