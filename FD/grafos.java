import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
class cola
{
	int entrada, salida,tam;
	int C[]= new int[100];
	public cola(int t)
	{
		tam=t;
		entrada=salida=0;
	}
	public void insertar(int dato) 
	{
		C[entrada]=dato;
		entrada++;//1
	}
	public int extraer() 
	{
		int n;
		n=C[salida];
		salida++;
		return(n);
	}
	public int vacia() 
	{
		if(entrada==salida) return 1;
		else return 0;
	}
	public int llena() 
	{
		if(entrada==tam) return 1;
		else return 0;
	}

	public void muestra() // muestra los datos de la cola
	{
  	String datos="Datos de la COLA\n";
	for(int i=salida;i<entrada;i++)
		System.out.print(C[i]+" ");
	System.out.println();   
	}
	

}
/*
The string tokenizer class allows an application to break a string into tokens.
The tokenization method is much simpler than the one used by the StreamTokenizer class.
The StringTokenizer methods do not distinguish among identifiers,
 numbers, and quoted strings, nor do they recognize and skip comments.*/

class grafos 
{
 int NN;//vertcies
 int M[][] = new int[20][20];
 
 public void escribematriz()
 {
 	int i,j;
 	System.out.println(" NODOS = "+NN);
 	System.out.println(" Matriz de Adyacencias");
 	System.out.print(" ");
 	for(i=1;i<=NN;i++) System.out.print("  "+i);//1 2 3 4 5 6 7 8 9 10
 	System.out.println();

 	for(i=1;i<=NN; i++)
 	{
 		System.out.print(i+"  ");
 		for (j=1;j<=NN;j++)
 		System.out.print(M[i][j]+"  ");//[1][1]=0
 		System.out.println();
 	}
 }
 
 public void LeeGrafo(String arch) //Lee archivo con los datos del grafo
  {
 
  		FileInputStream fp;
		BufferedInputStream f;
		String linea = null;
		int token1,token2,i,j;
try
     {
		fp = new FileInputStream(arch);
		f = new BufferedInputStream(fp);
        
		linea=f.toString();
		
		NN=Integer.parseInt(linea); 
		System.out.println(" Numero de Nodos: "+NN);
		// Inicializamos la matriz con ceros
  		for (i=1;i<=NN;i++)
  		{
			for (j = 1; j <= NN; j++)
			{
				M[i][j] = 0;
			}
  		}
  		// Leemos el archivo linea por linea
		do {
			linea = f.toString();
			if (linea!=null){
				              StringTokenizer tokens=new StringTokenizer(linea); 
				              token1 = Integer.parseInt(tokens.nextToken());
				              token2 = Integer.parseInt(tokens.nextToken());
				              // escribimos en pantalla los datos leidos transformados en numeros
				              System.out.println(token1+" "+token2);
				              // almacenamos en la matriz
				              M[token1][token2]=1;
				              M[token2][token1]=1;
				            }  
			}while(linea != null);
		fp.close();	
	}
	
	
         catch (FileNotFoundException exc)
         {
             System.out.println ("El archivo " + arch + " no fue encontrado ");
         }
         
         catch (IOException exc)
         {
             System.out.println (exc);
         }
  		
  }
  
  public void aloancho(int inicio)
  {
  	cola C = new cola(100);
	int[] visitados=new int[NN+1];//11
  	int n,j,padre;

  	for(j=0;j<=NN;j++)
  		visitados[j]=0;//1
    C.insertar(inicio);//entada es 4
    visitados[inicio]=1;

  	while(C.vacia()!=1)
  	{
  	   n=C.extraer();
  	   System.out.print(n+"->");//4->2
  	   for(j=1;j<=NN;j++)
  	   {
  	   	if(M[n][j]!=0)//M[1][3]
  	   	   {
  	   	    if(visitados[j]==0)
  	   	       {
  	   	         C.insertar(j);
  	   	         visitados[j]=1;
  	   	       }
  	   	   }
	 	}

    }
   }
  
  
  public static void main(String[] ar)
  {
    grafos G=new grafos();
    G.LeeGrafo("entrada.dat");
    G.escribematriz();
    G.aloancho(4);
   }
  }