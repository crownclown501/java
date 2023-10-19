import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

class Pila {
    public int A[];
    public int tope;
    public int tamaño;
    
    public Pila(int t){
          tamaño=t; 
          tope=0;
          A= new int[t]; 
    }
    
    public void push(int dato)
    {
      A[tope]=dato;
      tope++;
    }
    
    public int pop()
    {
      tope--;
      return (A[tope]);
    }

   public int vacia()
    {
      if(tope==0) return 1;
      else return 0;
    }
    
    public int llena()
    {
      if(tope==tamaño) return 1;
      else return 0;
    }
    
    public void mostrar()
    {
        int cont=0;
        for(int i=0; i< tope; i++){
            System.out.print(A[i]+" ");
            cont+=A[i];
        }
    }
}

public class Grafos {
    int NN;
    char M[][] = new char[20][20];
 
    
    public void LeeGrafo(String arch){ //Lee archivo con los datos del grafo
  	FileInputStream fp;
        DataInputStream f;
	String linea = null;
	int token1,token2,i,j;
        try{
            fp = new FileInputStream(arch);
            f = new DataInputStream(fp);
            linea=f.readLine();
		
            NN=Integer.parseInt(linea); 
            System.out.println(" Numero de Nodos: "+NN);
            // Inicializamos la matriz con ceros
            for (i=1;i<=NN;i++){
  		        for(j=1;j<=NN; j++)
                {
  		            M[i][j]=0;
                }
            }
            // Leemos el archivo linea por linea
            do{
                linea = f.readLine();
		        if (linea!=null)
                {
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
	}catch (FileNotFoundException exc){
            System.out.println ("El archivo " + arch + " no fue encontrado ");
        }catch (IOException exc){
            System.out.println (exc);
        }	
    }
public void aloprofundo(int inicio)
  {
        Pila P=new Pila(50);
        Pila P2=new Pila(60);
	int[] visitados=new int[NN+1];
  	int n,j;
  	  	
  	for(j=0;j<=NN;j++) visitados[j]=0;
        P.push(inicio);
        visitados[inicio]=1; 
    	n=P.pop();
        P2.push(n); 
        System.out.print(n+"->");
        for(j=NN; j>=1; j--)
        {
            if(M[n][j]!=0)
            {
  	   	    if(visitados[j]==0)
  	   	         P.push(j);
            }
        }
  	    while(P.vacia()!=1)
        {  
  	        n=P.pop();  
  	        if(visitados[n]==0)
            {
  	            visitados[n]=1;
                P2.push(n);
                System.out.print(n+"->");
                for(j=NN; j>=1; j--)
                { 
                    if(M[n][j]!=0 && visitados[j]==0)
                    {
  	   	                P.push(j);
  	   	            }
	            }    
            }
        }
}

public static void main(String[] ar){
    Grafos G = new Grafos();
    G.LeeGrafo("data.txt");
   
    G.aloprofundo(5);
    System.out.println("\n");
   }
}
