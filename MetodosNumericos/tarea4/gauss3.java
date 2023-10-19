package MetodosNumericos.tarea4;

public class gauss3 {
    public static void main(String[] args) {
        double[][] A = {{1, 2},{-1, -3}};
        double[] b = {-1, 0};
        int n = A.length;

        // Implementar la eliminación gaussiana con pivoteo parcial.
        for (int i = 0; i < n; i++) {
            // Encontrar el pivote (el elemento con el valor absoluto máximo) en la columna actual.
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(A[j][i]) > Math.abs(A[maxRow][i])) {
                    maxRow = j;
                }
            }

            // Intercambiar filas para asegurar el pivote en la posición correcta.
            double[] tempRow = A[i];
            A[i] = A[maxRow];
            A[maxRow] = tempRow;
            double tempB = b[i];
            b[i] = b[maxRow];
            b[maxRow] = tempB;

            // Realizar eliminación gaussiana en la columna actual.
            for (int j = i + 1; j < n; j++) {
                double vec = A[j][i] / A[i][i];
                for (int k = i; k < n; k++) {
                    A[j][k] -= vec * A[i][k];
                }
                b[j] -= vec * b[i];
            }
        }

        // Verificar si el sistema es consistente o tiene múltiples soluciones.
        boolean unasoluc = true;
        boolean multiples = false;

        for (int i = 0; i < n; i++) {
            boolean p = true;
            for (int j = 0; j < n; j++) {
                if (A[i][j] != 0) {
                    p = false;
                    break;
                }
            }
            if (p && b[i] != 0) {
                unasoluc = false;
                break;
            } else if (p && b[i] == 0) {
                multiples = true;
            }
        }

        if (!unasoluc) {
            System.out.println("El sistema no tiene solución única.");
        } else if (multiples) {
            System.out.println("El sistema tiene múltiples soluciones.");
        } else {
            // Realizar la sustitución hacia atrás para encontrar la solución del sistema.
            double[] x = new double[n];
            for (int i = n - 1; i >= 0; i--) {
                double sum = 0.0;
                for (int j = i + 1; j < n; j++) {
                    sum += A[i][j] * x[j];
                }
                x[i] = (b[i] - sum) / A[i][i];
            }

            System.out.println("La solución del sistema es:");
            for (int i = 0; i < n; i++) {
                System.out.println("x[" + i + "] = " + x[i]);
            }
        }
    }
}
