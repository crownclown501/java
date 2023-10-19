class Nodo
{
	public int info;   // info va a ser nuestro helper para saber lo que este dentro del nodo en el que estemos 
	public Nodo liga;					  
	public Nodo(int dato)   // esta funcion va a ayudar a que se le asigne un valor a nodo 
	{
		info=dato;
		liga=null;
	}
}
public class lista_sin_pares 
{
   private Nodo primero; //primero vamos a posicional al inicio 
   private Nodo ultimo; //ultimo vamos a posicionarlo al final
    public lista_sin_pares() 
    {
    	primero=null;  //asignamos a ambos el valor de null pa decirles que no tienen ningun dato al inciar el programa
    	ultimo=null;	
    }
    
    public void insertar(int valor)
    {
    	Nodo temp=new Nodo(valor);   // llamamos a la funcion Nodo que esta dentro de la clase nodo y entonces temo va a ser igual a la posicion que insertemos 
    	if (primero==null) //insertar el primer nodo de la listOrdenada
    	{ 
    		primero=temp; //ambos reciben el mismo valor ya que no existe un nodo
    		ultimo=temp;
    	}
    	else  //insertar atras          imagina que temp.info es 2 y primero es 2 entonces entramos al if
    	{ 
    	    ultimo.liga=temp;
            ultimo=temp;
        }
    }	
		
   public void recorrer()
   {
	   Nodo aux=primero;
	   System.out.println("Lista Ligada Ordenada: ");
	   while(aux!=null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null 
	   {
   			System.out.print(aux.info+" ");
   			aux=aux.liga;//aux+=1;   // null
		}
	}

    public void recorrer_sin_pares()
   	{
	   Nodo aux=primero;
	   System.out.println("Lista Ligada Ordenada: ");
	   while(aux!=null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null 
	   {
		   if (aux.info%2!=0) {
			   System.out.print(aux.info+" ");
		   }
   			aux=aux.liga;//aux+=1;   // null
		}
	}
    public static void main(String []args)
    {
    	lista_sin_pares L = new lista_sin_pares();
    	System.out.println("datos antes de eliminar");
        L.insertar(0);L.insertar(10);L.insertar(5);
    	L.insertar(2);L.insertar(10);L.insertar(20);
    	L.insertar(10);L.insertar(9);L.insertar(8);
		L.insertar(5);L.insertar(9);L.insertar(7);
		L.insertar(5);
        /*L.insertar(2);
        L.insertar(5);
        L.insertar(1);
        L.insertar(12);
        L.insertar(9);
        L.insertar(10);
        L.insertar(3);*/
    	L.recorrer();
		System.out.println("\n");
		L.recorrer_sin_pares();
		System.out.println("\n");
    }		
}