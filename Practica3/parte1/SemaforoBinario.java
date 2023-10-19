package Practica3.parte1;

public class SemaforoBinario 
{
    private int contador =0;
    public SemaforoBinario(int valorinicial)
    {
    contador=valorinicial;
    }
 
    synchronized public void WAIT ()
    {        
        while(contador ==0)
        try 
        {
            wait();
        } 
        catch(Exception e){}
        contador --;
    }
    synchronized public void SIGNAL()
    {
        contador =1;
        notify();
    }
} 