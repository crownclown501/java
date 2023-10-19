package MetodosNumericos.tarea4;

public class GAUSS3 {
    public static void main(String[] args) {
        // INPUT: número de incógnitas y de ecuaciones 𝑛;
        // Declararemos y definiremos los valores de la matriz ampliada A y el vector b
        // para resolver el sistema.
        double[][] A = {{2, 5, 3, 0},{2, 6, 0, 4},{-1, -2, 0, 1},{0, 2, 9, 9}};
        //double[][] A = {{0, 1, -2},{1, 1, 1},{0, -2, 3}};//1
        //double[][] A = {{1, 1, 1},{2, 2, 1},{1, 1, 2}};//sistema con error
        //double[][] A = { { 5, -2, 1 }, { 2, -1, 1 }, { -1, 1, 2 } };
        //double[][] A = {{1, 2},{-1, -3}};
        //double[][] A = {{1, 1, 1},{2, 2, 1},{1, 1, 2}};//error
        //double[][] A = {{7, 90},{3, 2}};
        //double[][] A = {{5, 5, 0, 0, 0},{0, 0, 1, -1, -1},{0, 0, 0, 2, -3},{1, -1, -1, 0, 0},{0, 5, -7, -2, 0}};
        /*modificar si queremos agragar complejos y en caso de meter matrices muy grandes podriamos llegar a 
        hacer que se lea un archivo de texto obviamente con cada fila de datos por separado y leerlo primero como una cadena o string y 
        de ahi separarlo, para eso necesitaria que tengan algun caracter como la coma para que pueda solo tomar el valor que esta antes de la coma
        y agregarlo a la matriz metiendo como condicion que una vez lleguemos a un punto(.) se pase a la siguiente fila 
        y asi sucesivamente y aca el tamaño lo tendriamos que poner de acuerdo al numero de filas que exista en nuestro 
        archivo de texto 
        */
        
        double[] b = {4, 10, 0, 13};
        //double[] b = {-1, 3, 1};//1
        //double[]b = {4, 6, 6};//sistema con error
        //double[] b = { 2, 1, 0 };
        //double[] b = {-1, 0};
        //double[]b = {4, 4, 6};//error
        //double[]b = {713, 13};
        //double[]b = {5.5, 0, 0, 0, 0};

        int n = A.length;

        // Paso 1: i=1 hasta n-1 hacer pasos 2 al 4
        for (int i = 0; i < n-1; i++) {
            // Paso 2: Buscamos el entero más pequeño p con 𝑖≤𝑝≤𝑛 y 𝑎_𝑝𝑖≠0.
            int p = -1;
            for (int j = i; j < n; j++) {
                if (A[j][i] != 0) {
                    p = j;
                    //System.out.println(p);
                    break;
                }
            }
            // Si no se encontró p, no existe solución única.
            if (p == -1) {
                System.out.println("ERROR: no existe solución única.");
                return;
            }

            // Paso 3: si entra aca intercambiamos filas 𝐸_𝑝 y 𝐸_𝑖 si 𝑝!=𝑖.
            if (p != i) {
                double[] l = A[i];
                //System.out.println("A[" + A[i] + "] ," + "A[" + A[p] + "]");
                A[i] = A[p];
                //System.out.println(l);
                A[p] = l;
                //System.out.println("b[" + b[i] + "]");
                double l2 = b[i];
                //System.out.println("b[" + b[p] + "]");
                b[i] = b[p];
                //System.out.println(l2);
                b[p] = l2;
            }

            // Crear la matriz m para almacenar los coeficientes de eliminación.
            double[][] m = new double[n][n];

            // Paso 4: j=i+1 hasta n realizar pasos 5 y 6
            for (int j = i + 1; j < n; j++) {
                // Paso 5: Sean 𝑚_𝑗𝑖=𝑎_𝑗𝑖/𝑎_𝑖𝑖.
                m[j][i] = A[j][i] / A[i][i];
                //System.out.println("valor en mji:"+m[j][i]);
                // Paso 6: Realizar (𝐸_𝑗−𝑚_𝑗𝑖 𝐸_𝑖).
                for (int k = i; k < n; k++) {
                    A[j][k] -= m[j][i] * A[i][k];
                   // System.out.println("valor en Ajk:"+ A[j][k]);
                }
                //System.out.println("valor en bj:"+ b[j]);
                b[j] -= m[j][i] * b[i];
            }
        }

        // Paso 7: Verificar si A_𝑛𝑛=0.
        if (A[n-1][n-1] == 0) {
            System.out.println("No existe solución");
            return;
        }
        // Realizamops la sustitución hacia atrás para encontrar la solución del
        // sistema.
        double[] x = new double[n];
        x[n-1] = b[n-1]/A[n-1][n-1];
        // Paso 8
        for (int i = n - 2; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }

            // Paso 9
            x[i] = (b[i]-sum)/A[i][i];
        }
        // OUTPUT: Mostrar la solución del sistema.
        System.out.println("La solución del sistema es:");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(" _" + "_");
            }

            System.out.println("|x" + i + "| = " + "[" + x[i] + "]");
            if (i == (n-1)) {
                System.out.println(" -" + "-");
            }
        }
    }
}
