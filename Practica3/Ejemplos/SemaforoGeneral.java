package Practica3.Ejemplos;

public class SemaforoGeneral extends SemaforoBinario 
{
    public SemaforoGeneral (int valorInicial) {
        super (valorInicial);
    }   
    synchronized public void SIGNAL () 
    {
        contador++;
        notify();
    }
    
}
