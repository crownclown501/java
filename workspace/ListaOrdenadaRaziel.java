class Nodo
{
	public int info;
	public Nodo liga;
	public Nodo(int dato)
	{
		info=dato;
		liga=null;
	}	
}


public class ListaOrdenadaRaziel 
{
   private Nodo primero;
   private Nodo ultimo;
    public ListaOrdenadaRaziel
() 
    {
    	primero=null; 
    	ultimo=null;	
    }
    
    public void insertar(int valor)
    {
    	Nodo temp=new Nodo(valor);
    	if (primero==null) //insertar el primer nodo de la listOrdenada
    		{ 
    			primero=temp;
    			ultimo=temp;
    		}
    	else if(temp.info<=primero.info) //insertar atras
    	     { 
    	     	temp.liga=primero;
    	     	primero=temp;
    	     }	
    	    else if(temp.info>=ultimo.info) //isertar al final
    	         {
    	           ultimo.liga=temp;
    	           ultimo=temp; 	 
    	         }
    	         else { //inserta en medio
    	               Nodo ant=null;
    	               Nodo pos=primero;
    	         	   while(pos.info<=temp.info)
    	         	   {
    	         	   	ant=pos;
    	         	   	pos=pos.liga;
    	         	   }
    	         	   ant.liga=temp;
    	         	   temp.liga=pos;
    	             } 	   
    				
    }	
    
    
    	
  	public void eliminar(int valor) 	
	{
		if (primero.info == valor) 
		{
			primero = primero.liga;
			return;
		}
    	Nodo pos=primero;
		Nodo ant = null;
    	System.out.println("Eliminando dato...");
    	do 
		{
			ant=pos;
        	pos=pos.liga;
		} while (pos.info!=valor);
		ant.liga=pos.liga;
	}
   
   public void recorrer()
   {
   	Nodo aux=primero;
   	System.out.println("Lista Ligada Ordenada: ");
   	while(aux!=null)
   	{
   		System.out.print(aux.info+" ");
   		aux=aux.liga;
   	}
   		System.out.println();
   }
   
   
    public static void main(String []args)
    {
    	ListaOrdenadaRaziel L = new ListaOrdenadaRaziel();
    	L.insertar(8);
    	L.insertar(5);
    	L.insertar(2);
    	L.insertar(15);
    	L.insertar(20);
    	L.insertar(10);
    	L.insertar(9);
    	L.recorrer();
    	
    	L.eliminar(12);
		 //Implementar el metodo eliminar
    	L.recorrer();
    }		
    
}