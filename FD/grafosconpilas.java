import java.io.*;
import java.util.StringTokenizer;

class Pila_s {
    int Pila_s[]=new int [100];
    int tope;
    int tamaño;
    
    public Pila_s(int t){
        tamaño=t;
        tope=0;
        Pila_s = new int[t];
    }
    public void push(int dato){//Ingresardato
        Pila_s[tope]=dato;
        tope++;
        
    }
    public int pop(){
        int n;
        n = Pila_s[tope];
        tope--;
        return (n);
    }
    public int vacio(){
        if(tope==0){
            System.out.println("Pila Vacia");
            return 1;
        }else{
            System.out.println("Pila con valores");
            return 0;
        }
    }
    public int Lleno(){
        if(tope==tamaño){
            return 1;
        }else{
            return 0;
        }
    }
    public void Mostrar(){
        for(int i=0; i<tope; i++){
            System.out.print("["+Pila_s[i]+"]-");
        }
    }
}
public class grafosconpilas {
    int NN;
    int M[][] = new int[20][20];

    public void escribematriz() {
        int i, j;
        System.out.println(" NODOS = " + NN);
        System.out.println(" Matriz de Adyacencias");
        System.out.print(" ");
        for (i = 1; i <= NN; i++)
            System.out.print("  " + i);
        System.out.println();

        for (i = 1; i <= NN; i++) {
            System.out.print(i + "  ");
            for (j = 1; j <= NN; j++)
                System.out.print(M[i][j] + "  ");
            System.out.println();
        }
    }

    public void LeeGrafo(String arch) // Lee archivo con los datos del grafo
    {
        FileInputStream fp;
        DataInputStream f;
        String linea = null;
        int token1, token2, i, j;
        try {
            fp = new FileInputStream(arch);
            f = new DataInputStream(fp);
            linea = f.readLine();

            NN = Integer.parseInt(linea);
            System.out.println(" Numero de Nodos: " + NN);
            // Inicializamos la matriz con ceros
            for (i = 1; i <= NN; i++)
                for (j = 1; j <= NN; j++)
                    M[i][j] = 0;
            // Leemos el archivo linea por linea
            do {
                linea = f.readLine();
                if (linea != null) {
                    StringTokenizer tokens = new StringTokenizer(linea);
                    token1 = Integer.parseInt(tokens.nextToken());
                    token2 = Integer.parseInt(tokens.nextToken());
                    // escribimos en pantalla los datos leidos transformados en numeros
                    System.out.println(token1 + " " + token2);
                    // almacenamos en la matriz
                    M[token1][token2] = 1;
                    M[token2][token1] = 1;
                }
            } while (linea != null);
            fp.close();
        }
        catch (FileNotFoundException exc) {
            System.out.println("El archivo " + arch + " no fue encontrado ");
        }
        catch (IOException exc) {
            System.out.println(exc);
        }
    }
    public void aloancho(int inicio) {
        Pila_s C = new Pila_s(100);
        int[] visitados = new int[NN + 1];
        int n, j, padre;

        for (j = 0; j <= NN; j++)
            visitados[j] = 0;
        C.push(inicio);
        visitados[inicio] = 1;

        while (C.vacio() != 1) {
            n = C.pop();
            System.out.print(n + "->");
            for (j = 1; j <= NN; j++) {
                if (M[n][j] != 0) {
                    if (visitados[j] == 0) {
                        C.push(j);
                        visitados[j] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] ar) {
        grafosconpilas G = new grafosconpilas();
        G.LeeGrafo("entrada.txt");
        G.escribematriz();
        G.aloancho(1);
    }
}

