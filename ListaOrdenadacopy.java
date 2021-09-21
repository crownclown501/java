class Nodo1
{
	public int info;   // info va a ser nuestro helper para saber lo que este dentro del nodo en el que estemos 
	public Nodo1 liga;
							  // tomen a liga como la fecha que apunta al siguiente nodo o casilla
	public Nodo1(int dato)   // esta funcion va a ayudar a que se le asigne un valor a nodo 
	{
		info=dato;
		liga=null;
	}
}
public class ListaOrdenadacopy 
{
   private Nodo1 primero; //primero vamos a posicional al inicio 
   private Nodo1 ultimo; //ultimo vamos a posicionarlo al final
    public ListaOrdenadacopy() 
    {
    	primero=null;  //asignamos a ambos el valor de null pa decirles que no tienen ningun dato al inciar el programa
    	ultimo=null;	
    }
    
    public void insertar(int valor)
    {
    	Nodo1 temp=new Nodo1(valor);   // llamamos a la funcion Nodo que esta dentro de la clase nodo y entonces temo va a ser igual a la posicion que insertemos 
    	if (primero==null) //insertar el primer nodo de la listOrdenada
    	{ 
    		primero=temp; //ambos reciben el mismo valor ya que no existe un nodo
    		ultimo=temp;
    	}
    	else if(temp.info<=primero.info) //insertar atras          imagina que temp.info es 2 y primero es 2 entonces entramos al if
    	{ 
    	    temp.liga=primero;//el siguiente nodo vas a asignarle la variable primero          null=2 
    	 	primero=temp;//y primero va a obtener la informacion que tiene temp principal      2=2
    	}	
    	    else if(temp.info>=ultimo.info) //isertar al final               2>=2 entonces no entra pero si temp se volviera 5y ultimo fuese 2 entonces entra
    	    {  // este sirve mas que nada para cuando metes un nuevo nodo y ya tienes todos tus datos ordenandos
    	        ultimo.liga=temp;       //por ejemplo si yo tengo un 8 y inseto un 9 pues tengo que agregar ese nuevo nodo y ponerlo como ultimo 'cause cuando  
										//el codigo es diferente puedes terminar imprimiendo todos tus nodos pero sin el nuevo o imprimir solo el nuevo
    	       ultimo=temp; 	 		//ultimorecibe el dato de 8 pero el siguiente nodo ya existe y esta conectado a los demas nodos asi que ya se va a impirmir bien
    	    }
    	        else 
				{ //inserta en medio
    	            Nodo1 anterior=null;       
    	            Nodo1 posterior=primero;
    	         	while(posterior.info<=temp.info)
    	           {
					   anterior=posterior;
					   posterior=posterior.liga;
    	         	}
    	         	anterior.liga=temp;
    	         	temp.liga=posterior;
    	        } 	   			
    }	
	public Nodo1 eliminar(int valor) {
		if (primero.info == valor) {
		  primero = primero.liga;
		  return primero;
		}
		Nodo1 aux1=primero;      //declaramos la variable que nos va a hacer todo el proceso 
		//aux va a poscicionarse en donde esta primero 
			while (aux1!=null) {   //entramos en este ciclo hasta que ya no halla ningun otro dato y encontremos null 
				/*if (aux1.info==valor) //2,5,8,9,10,15,20     .info nos lanza el valor que esta en aux1  we check if the number aux1 has it's equal to valor
				//ejemplo de la primera entrada:  2== 5 pues no entonces no entra y se va al else cuando sea igual lo que hacemos es irnos a la siguente casilla o nodo
				//and that way we delete that number
				{						//2,5,8,9,10,15,20 
					aux1=aux1.liga;     //aux1 estaba posicionado donde esta el 2 pero el .liga hace como si tuviera +=1 
										//entonces aux1 pasa a posicionarse donde esta el 5 
 				} else {*/
					if (aux1.liga!=null && aux1.liga.info==valor)   //conque no se cumpla una de estas pasamos al else
					{												//no ponemos aux1!=null ni aux.info==valor porque estariamos repitiendo lo del primer if
																	//asi que pasamos a la siguiente direccion y hacemos esa comparacion 
						aux1.liga=aux1.liga.liga;					//aqui pasa lo mismo que explico en la linea 71 y 72 asi que aparte de saltar uno 
																	//al asignar no podemos asignar el mismo asi que tenemos que hacer un doble salto para que no haga con el mismo 
					} else {
						aux1=aux1.liga;								//the same as the comments on line 67 & 68
					}
				//}
			}
		return aux1; // we need to return our node cause is the one that will give all the information that contains with the proccess that we have done
		  
	}
		
   public void recorrer()
   {
	   Nodo1 aux=primero;
	   System.out.println("Lista Ligada Ordenada: ");
	   while(aux!=null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null 
	   {
   			System.out.print(aux.info+" ");
   			aux=aux.liga;//aux+=1;   // null
		}
	}

    public void recorrer_sin_pares()
   	{
	   Nodo1 aux=primero;
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
    	ListaOrdenadacopy L = new ListaOrdenadacopy();
    	System.out.println("datos antes de eliminar");
        L.insertar(0);
		L.insertar(10);
    	L.insertar(5);
    	L.insertar(2);
    	L.insertar(10);
    	L.insertar(20);
    	L.insertar(10);
    	L.insertar(9);
		L.insertar(8);
		L.insertar(5);
		L.insertar(9);
		L.insertar(7);
		L.insertar(5);
    	L.recorrer();
		System.out.println("\n");
        /*System.out.println("\n\ndatos despues de eliminar");
        L.eliminar(10); //Implementar el metodo eliminar
    	L.recorrer();
		System.out.println("");
		L.eliminar(5);
		L.recorrer();
		System.out.println("");
		L.eliminar(0);
		L.recorrer();
		System.out.println("");
		L.eliminar(9);
		L.recorrer();
		System.out.println("");
		System.out.println("prueba con numero inexistente:");
		L.eliminar(12);
		System.out.println("");*/
		L.recorrer_sin_pares();
		System.out.println("\n");
    }		
}
