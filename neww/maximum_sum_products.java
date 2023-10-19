package neww;
import java.util.*;
public class maximum_sum_products {
   
    static int n;
    static int sumOfProdcuts(int []a,int []b)
    {
        int maximum = 0;
        n = a.length;
        Arrays.sort(a);Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            maximum += (a[i]*b[i]);
        }
        //System.out.println(n);
        return maximum;
    }
    public static void main(String[] args) {
        int Array1[]={1,8,7,6,3,6};
        int Array2[]={5,9,6,8,8,6};
        
        
        System.out.println(sumOfProdcuts(Array1,Array2));
    }
}

