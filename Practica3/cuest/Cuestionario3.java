package Practica3.cuest;

import java.awt.Dimension;
import java.awt.Graphics;



public class Cuestionario3 extends javax.swing.JFrame 
{
    protected static final SemaforoBinario uno = new SemaforoBinario(0);
    protected static final SemaforoBinario dos = new SemaforoBinario(0);
    protected static final SemaforoBinario tres = new SemaforoBinario(0);
    protected static final SemaforoBinario cuatro = new SemaforoBinario(0);
    protected static final SemaforoBinario cinco = new SemaforoBinario(0);
    protected static final SemaforoBinario seis = new SemaforoBinario(0);
    protected static final SemaforoBinario siete = new SemaforoBinario(0);
    protected static final SemaforoBinario ocho = new SemaforoBinario(0);
    protected static final SemaforoBinario nueve = new SemaforoBinario(0);
    protected static final SemaforoBinario diez = new SemaforoBinario(0);
    protected static final SemaforoBinario once = new SemaforoBinario(0);
    protected static final SemaforoBinario mutex = new SemaforoBinario(1);
    public static int i = 0;
    public static String [] aviso = new String[7];
    public static String [] orden = new String[7];
    /**
     * Creates new form Cuestionario3
     */
    public Cuestionario3() 
    {
        this.setTitle("Grafo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setMinimumSize(new Dimension(300,500));  
        this.setResizable(false);
        this.setLayout(null);
    }
    public void drawArrow(int x0, int y0, int x1, int y1, Graphics g){
        double alfa = Math.atan2(y1-y0, x1-x0);
        g.drawLine(x0, y0, x1, y1);
        int k = 10;
        int xa = (int)(x1-k*Math.cos(alfa+1));
        int ya = (int)(y1-k*Math.sin(alfa+1));
        g.drawLine(xa, ya, x1, y1);
        xa = (int)(x1-k*Math.cos(alfa-1));
        ya = (int)(y1-k*Math.sin(alfa-1));
        g.drawLine(xa, ya, x1, y1);
    }
    public static void main(String[] args) {
        
        Cuestionario3 e = new Cuestionario3();
        e.setVisible(true);                
        new Thread(new A(e.getGraphics())).start();
        new Thread(new B(e.getGraphics())).start();
        new Thread(new C(e.getGraphics())).start();
        new Thread(new D(e.getGraphics())).start();
        new Thread(new E(e.getGraphics())).start();
        new Thread(new F(e.getGraphics())).start();
        new Thread(new G(e.getGraphics())).start();        
    }
}