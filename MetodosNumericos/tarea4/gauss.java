package MetodosNumericos.tarea4;

public class gauss {
    public static void main(String[] args) {
        //double[][] A = {{2, 5, 3, 0},{2, 6, 0, 4},{-1, -2, 0, 1},{0, 2, 9, 9}};
        //double[][] A = {{5, -2, 1},{2, -1, 1},{-1, 1 ,2}};
        //double[][] A = {{1, 2},{-1, -3}};

        double[][] A = {{0, 1, -2},{1, 1, 1},{0, -2, 3}};
        //double[][] A = { { 5, -2, 1 }, { 2, -1, 1 }, { -1, 1, 2 } };
        // double[][] A = {{1, 2},{-1, 3}};

        //double[] b = {4, 10, 0, 13};
        double[] b = {-1, 3, 1};
        //double[] b = {4, 10, 0, 13};
        //double[] b = {2, 1, 0};
        //double[] b = {-1, 0};
        int n = A.length;

        // hacemos la eliminacion en esta parte y damos el valor de la division a vec de ahi los datos 
         //de la matriz en j,k los vamos restando con el result de vec antes obtenido con la mult de la matriz en i,k
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double vec = A[j][i] / A[i][i]; //empezamos a generar los ceros 
                for (int k = i; k < n; k++) {
                    A[j][k] -= vec * A[i][k];//actualizamos datos
                }
                b[j] -= vec * b[i];
            }
        }

        // Verificamos aqui si el sistema es consistente o no osease si tiene multiples o una sola
        boolean unasoluc = true;
        boolean multiples = false;
        // Paso 2: Buscamos el entero más pequeño p con 𝑖≤𝑝≤𝑛 y 𝑎_𝑝𝑖≠0.
        for (int i = 0; i < n; i++) {
            boolean p = true;
            for (int j = 0; j < n; j++) {
                if (A[i][j] != 0) {
                    p = false;
                    break;
                }
            }
            //verificamos si es una fila de ceros la matriz o no esto nos dira si es multiples soluciones o no
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
            // Realiza la sustitución hacia atrás para encontrar la solución del sistema
            double[] x = new double[n];
            for (int i = n - 1; i >= 0; i--) {
                double sum = 0.0;
                for (int j = i + 1; j < n; j++) {
                    sum += A[i][j] * x[j];
                }
                x[i] = (b[i]-sum) / A[i][i];// calculamos el valor de x dependiendo del tamaño obviamente
            }

            System.out.println("La solución del sistema es:");
            for (int i = 0; i < n; i++) {
                System.out.println("x[" + i + "] = " + x[i]);
            }
        }
    }
}
