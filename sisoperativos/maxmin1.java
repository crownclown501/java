import java.util.*;
class Test{
    float maximo;
    float minimo;
}

public class maxmin1 {    
    static Test maxmin(int x,float array[]) {
        Test minmax = new Test();
        int i=2;
        if(x==1){
            minmax.maximo= array[0];
            minmax.minimo= array[0];
            return minmax;
        }
        if(array[0] > array[1]){
            minmax.maximo= array[0];
            minmax.minimo= array[1];
        }else if(array[1] > array[0]){
            minmax.maximo= array[1];
            minmax.minimo= array[0];
        }
        for(;i<x ; i++ ){
            if(array[i]>minmax.maximo){
                minmax.maximo= array[i];
            }else
            if(minmax.minimo>array[i]){
                minmax.minimo=array[i];
            }
        }
    return minmax;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        n=scanner.nextInt();
        float vector[] =new float[n];
        System.out.println("Ingrese valores del vector: ");
        for ( int i=0; i <n ; i++){
            vector[i] = scanner.nextFloat();
        }
        Test minmax = maxmin(n,vector);
        //maximo
        System.out.println("\n\nmaximo: "+minmax.maximo);
        //minimo
        System.out.println("\nminimo: "+minmax.minimo);
    }
}