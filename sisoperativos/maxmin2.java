import java.util.*;
public class maxmin2 {
    static float maximovalor(int x,float array[])
    {   int i=2; float maximo=0;
            if(x==1){
                maximo=array[0];
                return maximo;
            }
            if(array[0] > array[1]){
                maximo=array[0];
            }else if(array[1] > array[0]){
                maximo=array[1];
            }
            for(;i<x ; i++ )
            {
                if(array[i]>maximo)
                {
                    maximo=array[i];
                }
            }
        
        return maximo;
    }

    static float minimovalor(int y,float array[])
    {
        int i=1;
        float minimo=0;
        if(y==1){
            minimo=array[0];
            return minimo;
        }
        if(array[0] > array[1]){
            minimo=array[1];
        }else if(array[1] > array[0]){
            minimo=array[0];
        }
        for(;i<y ; i++ )
        {
            if(array[i]<minimo)
            {
                minimo=array[i];
            }
        }
        return minimo;
    }
        
    public static void main(String[] args) 
    {
        int n;
        float data1,data2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        n=scanner.nextInt();
        float vector[] =new float[n];
        System.out.println("Ingrese valores del vector: ");
        for ( int i=0; i <n ; i++){
            vector[i] = scanner.nextFloat();
        }
        //maximo
        data1 = maximovalor(n,vector);
        System.out.println("\n\n");
        System.out.println("maximo: "+data1);
        //minimo
        data2 = minimovalor(n,vector);
        System.out.println("\n");
        System.out.println("minimo: "+data2);
    }
}
//1000 11 445 1 330 3000