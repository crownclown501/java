/**Determine para que tamaños de entrada, en la misma maquina es mas rrapido un algoritmo
 con funcion de costo 100n^2 que otro con funcion de cos 2^n
 
 */
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
public class tiempo 
{
    static int funcion(int x)
    {
        int data =x*x;
        return data*100;
    }

    static int funcion2(int x)
    {
        return ((int)Math.pow(2, x));
    }

    public static void main(String[] args) 
    {
       for (int i = 1; i<=30; i++)
        {
            long start = System.nanoTime();

            int respuesta = funcion2(i);
            
            long end = System.nanoTime();
            System.out.print("dato:"+i+" ");System.out.print("valor :"+respuesta+" ");System.out.print("tiempo en nano: "+(end-start)+"\n");
            // 1 second = 1_000_000_000 nano seconds
            double elapsedTimeInSecond = ((double) (end-start) / 1000000);
            
            System.out.print("dato:"+i+" ");System.out.print("valor :"+respuesta+" ");System.out.print("tiempo en segundos elap: "+elapsedTimeInSecond+"\n");
            System.out.println("\n");
        } 
    }
    
}
