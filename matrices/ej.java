package matrices;

public class ej {
    public static void main(String[] args) {
        double a = 1/* establece el valor inicial de 'a' */;
        double b = 2/* establece el valor inicial de 'b' */;
        double tolerance = 0.0001/* establece el valor de tolerancia */;
        int maxIterations = 100/* establece el número máximo de iteraciones */;
        
        double result = bisectionMethod(a, b, tolerance, maxIterations);
        
        if (Double.isNaN(result)) {
            System.out.println("El método falló después de " + maxIterations + " iteraciones.");
        } else {
            System.out.println("Solución aproximada: " + result);
        }
    }
    
    public static double bisectionMethod(double a, double b, double tolerance, int maxIterations) {
        if (computeFunctionValue(a) * computeFunctionValue(b) >= 0) {
            System.out.println("Los valores de f(a) y f(b) no tienen signos opuestos en el intervalo.");
            return Double.NaN;
        }
        
        for (int i = 1; i <= maxIterations; i++) {
            double p = a + (b - a) / 2;
            double FP = computeFunctionValue(p);
            
            if (Math.abs(FP) < tolerance) {
                return p;
            }
            
            if (computeFunctionValue(a) * FP > 0) {
                a = p;
            } else {
                b = p;
            }
        }
        
        System.out.println("El método falló después de " + maxIterations + " iteraciones.");
        return Double.NaN; // Indica falla
    }
    
    public static double computeFunctionValue(double x) {
        // Reemplaza esto con la implementación real de tu función f(x)
        // Por ejemplo: return x * x - 4;
        return x*x-3; // Reemplaza con el cálculo de tu función
    }
}
