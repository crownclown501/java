class Node
{
	public int info;   // info va a ser nuestro helper para saber lo que este dentro del Node en el que estemos 
	public Node liga;					  
	public Node(int dato)   // esta funcion va a ayudar a que se le asigne un valor a Node 
	{
		info=dato;
		liga=null;
	}
}
public class impar 
{
   private Node primero; //primero vamos a posicional al inicio 
   private Node ultimo; //ultimo vamos a posicionarlo al final
    public impar() 
    {
    	primero=null;  //asignamos a ambos el valor de null pa decirles que no tienen ningun dato al inciar el programa
    	ultimo=null;	
    }
    
    public void insertar(int valor)
    {
    	Node temp=new Node(valor);   // llamamos a la funcion Node que esta dentro de la clase Node y entonces temo va a ser igual a la posicion que insertemos 
    	if (primero==null) //insertar el primer Node de la listOrdenada
    	{ 
    		primero=temp; //ambos reciben el mismo valor ya que no existe un Node
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
	   Node aux=primero;
	   System.out.println("Lista Ligada Ordenada: ");
	   while(aux!=null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null 
	   {
   			System.out.print(aux.info+" ");
   			aux=aux.liga;//aux+=1;   // null
		}
	}

    public void recorrer_sin_pares()
   	{
	   Node aux=primero;
	   System.out.println("Lista Ligada Ordenada: ");
	   while(aux!=null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null 
	   {
		  
			   System.out.print(aux.info+" ");
   			aux=aux.liga;//aux+=1;   // null
		}
	}
    public void sin_pares()
    {
        if (primero.info%2==0) {
            primero = primero.liga;
          }
        Node aux=primero;
        while(aux!=null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null 
	   {  
            if (aux.liga!=null && aux.info%2==0)   
            {												
                aux.liga=aux.liga.liga;					                                              
            }
            aux=aux.liga;								 
          
		}
    }
    public static void main(String []args)
    {
    	impar L = new impar();
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
        L.sin_pares();
        L.sin_pares();
		L.recorrer_sin_pares();
		System.out.println("\n");
    }		
}
