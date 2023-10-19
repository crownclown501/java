import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
class Nodo{

    public int info1;
    public int info2;
    public int info3;
    public Nodo liga;
    
    public Nodo(int sig, int ant, int cos) {
        info1 = sig;
        info2 = ant;
        info3 = cos;
        liga = null;
    }
}
    
class listaord {
    
    private Nodo primero;
    private Nodo ultimo;

    public listaord() {
        primero = null;
        ultimo = null;
    }

    public void insertar(int siguiente, int anterior, int costo) {
        Nodo temp = new Nodo(siguiente, anterior, costo);
        if (primero == null) {
            primero = temp;
            ultimo = temp;
        } else if (temp.info3 <= primero.info3) {
            temp.liga = primero;
            primero = temp;
        } else if (temp.info3 >= ultimo.info3) {
            ultimo.liga = temp;
            ultimo = temp;
        } else {
            Nodo ant = null;
            Nodo pos = primero;
            while (pos.info3 <= temp.info3) {
                ant = pos;
                pos = pos.liga;
            }
            ant.liga = temp;
            temp.liga = pos;
        }
    }

    public int eliminar(int valor) {
        Nodo ant = null;
        Nodo pos = primero;

        if (primero.info1 == valor) {
                primero = primero.liga;
            return(2);
        }
        while (pos.info1 != valor ) {
            ant = pos;
            pos = pos.liga;
            if (pos == null) {
                return(3);
            }
        }
        ant.liga = pos.liga;
        return(1);
    }

    public void recorrer() {
        Nodo aux = primero;
        System.out.println("Lista ligada ordenada: ");
        while (aux != null) {
            System.out.print("|"+aux.info3+ "-"+aux.info2+aux.info1+ "| ->");
            aux = aux.liga;
        }
        System.out.println();
    }
    
    public int regresa1(){
        int z = primero.info1;
        return(z);  
    }
    
    public int regresa2(){
        int z = primero.info2;
        return(z);  
    }
    
    public int regresaprimordial(){
        int z = primero.info3;
        return(z);
    }
    
    public void quitar(){
        primero = primero.liga;
    } 
} 
class Grafo {

    int NN;
    int M[][] = new int[20][20];
    

    public void escribematriz() {
        int i, j;
        System.out.println(" NODOS = " + NN);
        System.out.println(" Matriz de Adyacencias");
        System.out.print(" ");
        for (i = 1; i <= NN; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (i = 1; i <= NN; i++) {
            System.out.print(i + "  ");
            for (j = 1; j <= NN; j++) {
                System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void LeeGrafo(String arch) //Lee archivo con los datos del Grafo
    {

        FileInputStream fp;
        DataInputStream f;
        String linea = null;
        int token1, token2, token3, i, j;
        try {
            fp = new FileInputStream("C:\\Users\\David\\Documents\\NetBeansProjects\\dijkstra\\src\\dijkstra\\entrada.dat");
            f = new DataInputStream(fp);
            linea = f.readLine();

            NN = Integer.parseInt(linea);
            System.out.println(" Numero de Nodos: " + NN);
            // Inicializamos la matriz con ceros
            for (i = 1; i <= NN; i++) {
                for (j = 1; j <= NN; j++) {
                    M[i][j] = 0;
                }
            }

            // Leemos el archivo linea por linea
            do {
                linea = f.readLine();
                if (linea != null) {
                    StringTokenizer tokens = new StringTokenizer(linea);
                    token1 = Integer.parseInt(tokens.nextToken());
                    token2 = Integer.parseInt(tokens.nextToken());
                    token3 = Integer.parseInt(tokens.nextToken());
                    // escribimos en pantalla los datos leidos transformados en numeros
                    System.out.println(token1 + " " + token2 +" " + token3);
                    // almacenamos en la matriz
                    M[token1][token2] = token3;
                    M[token2][token1] = token3;
                }
            } while (linea != null);
            fp.close();
        } catch (FileNotFoundException exc) {
            System.out.println("El archivo " + arch + " no fue encontrado ");
        } catch (IOException exc) {
            System.out.println(exc);
        }

    }

    public void dijkstra(int nodoinicial) {
        listaord lo = new listaord();
        int repetido [] = new int[NN];
        int j, x=1, i=nodoinicial, costo2=0, costo=0;
        String nombre;
        int b =0, d=0;
        
        nombre = nodoinicial+"";
        repetido[0]=nodoinicial;
        
        while(x < NN){
            for(j=0; j<NN+1; j++){
                if(M[i][j] != 0){
                    costo = costo2 + M[i][j];
                    //System.out.println("costo= "+costo);
                    lo.insertar(j, i, costo);
                    //System.out.println(i+"-"+j+" "+M[i][j]);
                    //lo.recorrer();
                }
                costo = costo2;
            }
            lo.recorrer();
            if(x>1){
                for(int r=0; r<NN; r++){
                int not = lo.eliminar(repetido[r]);
                    if(not != 2){
                        d = lo.regresa1();
                        repetido[x]=d;
                        //System.out.println("esto es d " +d);
                        i=d;
                        //System.out.println("esto es i " +i);
                        b = lo.regresa2(); 
                        //System.out.println("esto es b " +b);
                        costo2 = lo.regresaprimordial();
                        System.out.println("camino: "+nombre+" costo= "+costo2);
                    }
                }
            }else{
                d = lo.regresa1();
                //repetido[x]=d;
                //System.out.println("esto es d " +d);
                i=d;
                //System.out.println("esto es i " +i);
                b = lo.regresa2();
                //b = lo.regresa2(); 
                //System.out.println("esto es b " +b);
                costo2 = lo.regresaprimordial();  
                nombre=b+"-"+d;
                System.out.println("camino: "+nombre+" costo= "+costo2);
            }
            //System.out.println("el costo = "+ costo2);
            for(int h=0;h<NN+1;h++){
                M[h][b] = 0;
            }
            escribematriz();
            //lo.recorrer();
            //lo.quitar();   
            //lo.recorrer();
            x++;
            //nombre = nodoinicial+"-"+j+"";
            //System.out.println("camino: "+nombre+ " costo: "+costo2);
            //lo.recorrer();
        }
        lo.recorrer();
        //System.out.println("el camino es: "+nombre);
        //System.out.println("el costo menor es: "+lo.regresaprimordial());
    }

    public static void main(String[] ar) {
        Scanner lec = new Scanner(System.in);
        Grafo G = new Grafo();
        G.LeeGrafo("entrada.dat");
        G.escribematriz();
        System.out.println("escribe el nodo inicial a buscar");
        int nodoinicial = lec.nextInt();
        G.dijkstra(nodoinicial);

    }
}
