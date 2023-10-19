package matrices;

public class ejer1 {

    public static void main(String[] args) {
        double a = -200;  // Assign the value of 'a'
        double b = 300;  // Assign the value of 'b'
        double tolerance = 3;  // Assign the value of 'TOL'
        int N0 = 6;  // Assign the value of 'N0'
        
        double result = bisectionMethod(a, b, tolerance, N0);
        
        if (Double.isNaN(result)) {
            System.out.println("Method failed after " + N0 + " iterations.");
        } else {
            System.out.println("Approximate solution: " + result);
        }
    }

    public static double bisectionMethod(double a, double b, double tolerance, int N0) {
        double fa = f(a);
        
        for (int i = 1; i <= N0; i++) {
            double p = a + (b - a) / 2;
            double fp = f(p);
            
            if (fp == 0 || (b - a) / 2 < tolerance) {
                return p;
            }
            
            if (fa * fp > 0) {
                a = p;
                fa = fp;
            } else {
                b = p;
            }
        }
        
        return Double.NaN;  // Method failed
    }
    
    public static double f(double x) {
        // Define your continuous function here
        // Example: return x * x - 4;
        return x*x-16;
    }
}
