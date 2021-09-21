class Nodo
{
	public int info;    
	public Nodo liga;
	public Nodo liga1;
	public Nodo liga2;
		//[2]->[5]   array[i]+=1   temp.liga primero.liga				  
	public Nodo(int dato)    
	{
		info=dato;
		liga=null;
		liga1=null;
		liga2=null;
	}
	
}

public class ListaOrdenada 
{
   private Nodo primero; 
    private Nodo primerNodo;
	private Nodo segundoNodo; 
    public ListaOrdenada() 
    {
		
    	primero=null; 
		primerNodo=null;
		segundoNodo=null;
    }
    public void insertar(int valor)
    {
    	Nodo temp=new Nodo(valor);   
    	if (primero==null) 
    	{ 
    		primero=temp;
    	}
    	else
    	{ 
    	    temp.liga=primero;
    	 	primero=temp;
    	}	
    }	

	public void lista1_2(int data1)
	{
		
		Nodo auxNodo=primero;
		Nodo auxNodo2=primero;
		Nodo auxnodo1=primero;
		while (auxNodo!=null) {
				 if(auxNodo.info>data1){
					auxNodo.liga1=auxNodo;
					auxNodo=auxnodo1;
				}
				if(auxNodo.info<=data1){
					auxNodo2.liga2=auxNodo2;
					auxNodo2=auxnodo1;
				}	
				auxnodo1=auxnodo1.liga;
		}
		primerNodo=auxNodo;
		segundoNodo=auxNodo2;
	}

	public void recorrerlista()
	{
		Nodo aux1=primerNodo;
		Nodo aux2=segundoNodo;
		System.out.println("Lista1 Ligada: ");
		while(aux1!=null) 
		{
				System.out.print(aux1.info+" ");
				aux1=aux1.liga;
		 }
		 System.out.println("\n");
		 System.out.println("Lista2 Ligada: ");
		 while(aux2!=null) 
		{
				System.out.print(aux2.info+" ");
				aux2=aux2.liga;
		 }
		 System.out.println("\n");
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
	}
    public static void main(String []args)
    {
    	ListaOrdenada L = new ListaOrdenada();
    	System.out.println("datos");
        L.insertar(12);L.insertar(5);L.insertar(2);L.insertar(10);L.insertar(20);L.insertar(10);
		L.insertar(9);L.insertar(8);L.insertar(3);L.insertar(3);L.insertar(7);L.insertar(18);L.insertar(0);
    	L.recorrer();
		System.out.println("");
        L.lista1_2(5);
		L.recorrerlista();
		System.out.println("");
    }		
}