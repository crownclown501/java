package matrices;

public class BisectionMethod {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double tolerance = 0.0005;
        int maxIterations = 100;
        
        double result = bisectionMethod(a, b, tolerance, maxIterations);
        
        if (Double.isNaN(result)) {
            System.out.println("Método falló después de " + maxIterations + " iteraciones.");
        } else {
            System.out.println("Solución aproximada: " + result);
        }
    }
    
    public static double bisectionMethod(double a, double b, double tolerance, int maxIterations) {
        double FA = computeFunctionValue(a);
        
        for (int i = 1; i <= maxIterations; i++) {
            double p = a + (b - a) / 2;
            double FP = computeFunctionValue(p);
            
            if (FP == 0 || (b - a) / 2 < tolerance) {
                return p;
            }
            
            if (FA * FP > 0) {
                a = p;
                FA = FP;
            } else {
                b = p;
            }
        }
        
        return Double.NaN; // Indicar falla
    }
    
    public static double computeFunctionValue(double x) {
        //double x1 =pow(x, 12);
        return x-(Math.cos(x));
    }

    /*private static double pow(double x, int i) {
        return 0;
    }*/
}

