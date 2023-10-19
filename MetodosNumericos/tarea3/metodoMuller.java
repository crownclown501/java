package MetodosNumericos.tarea3;
import java.util.Scanner;

public class metodoMuller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Método de Muller para encontrar la raíz de f(x) = e^(-x^3) - x^3");

        // Definir la tolerancia y el número máximo de iteraciones.
        double TOL = .05;
        int N0 = 100;

        // Número de iteraciones deseadas (k)
        int k = 3; // Cambia este valor según lo necesites.

        // Valor inicial para p0
        double p0 = -1.0;

        for (int i = 0; i < k; i++) {
            double p1 = p0 + 1.0; // Asegurar que p1 esté cerca de p0.
            double p2 = p1 + 1.0; // Asegurar que p2 esté cerca de p1.
            System.out.println("Valores iniciales: p0=" + p0 + ", p1=" + p1 + ", p2=" + p2);
            metodoMuller(p0, p1, p2, TOL, N0);
            
            // Actualizar p0 para la próxima iteración.
            p0 = (i + 1) * 1.0; // Ajustar el valor inicial p0 en función de la iteración.
        }
    }

    public static void metodoMuller(double p0, double p1, double p2, double TOL, int N0) {
        int i = 3;
        double h1, h2, S1, S2, d, p, b, D, E, h;

        while (i <= N0) {
            h1 = p1 - p0;
            h2 = p2 - p1;
            S1 = (Math.exp(-p1 * p1 * p1) - p1 * p1 * p1) - (Math.exp(-p0 * p0 * p0) - p0 * p0 * p0);
            S2 = (Math.exp(-p2 * p2 * p2) - p2 * p2 * p2) - (Math.exp(-p1 * p1 * p1) - p1 * p1 * p1);
            d = (S2 - S1) / (h2 + h1);

            b = S2 + h2 * d;
            D = Math.sqrt(b * b - 4 * Math.exp(-p2 * p2 * p2) * d);

            if (Math.abs(b - D) < Math.abs(b + D)) {
                E = b + D;
            } else {
                E = b - D;
            }

            h = (-2 * Math.exp(-p2 * p2 * p2)) / E;
            p = p2 + h;

            if (Math.abs(h) < TOL) {
                System.out.println("La aproximación de la raíz es: " + p);
                return;
            }

            p0 = p1;
            p1 = p2;
            p2 = p;
            h1 = p1 - p0;
            h2 = p2 - p1;
            S1 = (Math.exp(-p1 * p1 * p1) - p1 * p1 * p1) - (Math.exp(-p0 * p0 * p0) - p0 * p0 * p0);
            S2 = (Math.exp(-p2 * p2 * p2) - p2 * p2 * p2) - (Math.exp(-p1 * p1 * p1) - p1 * p1 * p1);
            d = (S2 - S1) / (h2 + h1);

            i++;
        }

        System.out.println("El método falló después de " + N0 + " iteraciones.");
    }
}
