package matrices;

import java.util.Scanner;

public class ejer {
    static double f(double x)
    {
        return x*Math.cos(x);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            int i =1;
            double FA=0,FP=0;
            double a = input.nextDouble();
            double b = input.nextDouble();
            double e = 0.0005;
            double p=0;
            while (Math.abs((a-b)/b)>e)
            {
                p = (a+b)/2;
                if(( f(a)* f(p)) > 0)
                a=p;
                else
                b=p;
            }
            System.out.println("root of the equation=" + p);
        }
    }
