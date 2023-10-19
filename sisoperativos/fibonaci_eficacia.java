public class fibonaci_eficacia {
    //recursividad en cascada fibonaci
    
    static long fib(int n){
        if(n <= 1) return n;
        else 
            return 
        fib(n-1)+fib(n-2);
    }
    //lineal fibonaci
    static long fibo(int n,int x,int y){
        if(n <= 1) return x+y;
        else 
            return
            fibo(n-1,y,x+y);
    }
    public static long fib1 (int n)
    {
        return fibo(n,0,1);
    }

    public static void main(String[] args) 
    {
        System.out.println("\nLineal\n");
        //System.out.println("\nRecursivo\n");
       for (int i = 4 ; i>=1; i--)
        {
            long start = System.nanoTime();

            long respuesta = fib(i);
            
            long end = System.nanoTime();
            System.out.print("dato:"+i+" ");System.out.print("valor :"+respuesta+" ");System.out.print("tiempo en nano: "+(end-start)+"\n");
        } 
    }
}
//long respuesta = fib(i);//long respuesta = fib1(i);