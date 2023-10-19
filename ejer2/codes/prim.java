package codes;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
public class prim {
    int NN;
    char M[][] = new char[20][20];
    char array[] = {'A','B','C','D','E','F','G','H','I'};
    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public void escribematriz(){
 	int i,j;
 	System.out.println(" NODOS = "+NN);
 	System.out.println(" Matriz de Adyacencias");
 	System.out.print(" ");
 	for(int x=0;x<=NN;x++){System.out.print("  "+x);	}
 	System.out.println();
 	for(i=0;i<=NN; i++)
 	{
 		System.out.print((char)array[i]+"  ");
 		for (j=0;j<=NN;j++)
 		System.out.print(M[i][j]+"  ");	
 		System.out.println();
 	}
     }
    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    public void LeeGrafo(String arch){ //Lee archivo con los datos del grafo
  	FileInputStream fp;
        DataInputStream f;
	String linea = null;
	int i,j;
        String data ="1";
        String token1,token2;
        try{
            fp = new FileInputStream(arch);
            f = new DataInputStream(fp);
            linea=f.readLine();
		
            NN=Integer.parseInt(linea); 
            System.out.println(" Numero de Nodos: "+NN);
            // Inicializamos la matriz con ceros
            for (i=0;i<NN;i++){
  		for(j=0;j<NN; j++){
  		    M[i][j]='0';
                }
            }
            // Leemos el archivo linea por linea
            do{
                linea = f.readLine();
		if (linea!=null){
                    StringTokenizer tokens=new StringTokenizer(linea); 
                    token1 = String.valueOf(tokens.nextToken());

                    token2 = String.valueOf(tokens.nextToken());
                    // escribimos en pantalla los datos leidos transformados en numeros
                    System.out.println(token1+" "+token2);
                    // almacenamos en la matriz
                   /* M[token1][token2]=data;
                    M[token2][token1]=data;*/
	        }  
            }while(linea != null);
            fp.close();	
	}catch (FileNotFoundException exc){
            System.out.println ("El archivo " + arch + " no fue encontrado ");
        }catch (IOException exc){
            System.out.println (exc);
        }	
    }
    public static void main(String[] ar){
    prim G = new prim();
    G.LeeGrafo("grafo prim.txt");
    G.escribematriz();
    
   }
}

