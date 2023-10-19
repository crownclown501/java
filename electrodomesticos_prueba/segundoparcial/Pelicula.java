package segundoparcial;


import java.io.*;


public class Pelicula {
	int codigo;
	String nombre;
	double precio;
	String clasificacion;
	int status;
	int ejemplar;
	
    public Pelicula() {
    }
  
    public Pelicula(int codigo,String nombre,double precio,String clasificacion,int status,int ejemplar){
    	this.codigo=codigo;
    	this.nombre=nombre;
    	this.precio=precio;
    	this.clasificacion=clasificacion;
    	this.status=status;
    	this.ejemplar=ejemplar;
    }
    
   void Registrar_pelicula()throws IOException {
   	BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
   	System.out.println("C�digo:  ");
   	this.codigo=Integer.parseInt(leer.readLine());
   	System.out.println("Nombre:  ");
   	this.nombre=leer.readLine();
   	System.out.println("Precio:  ");
   	this.precio=Double.parseDouble(leer.readLine());
   	System.out.println("Clasificaci�n:  ");
   	this.clasificacion=leer.readLine();
   	System.out.println("Status (1= disponible || 0 = No disponible):  ");
   	this.status=Integer.parseInt(leer.readLine());
   	System.out.println("Ejemplares:  ");
   	this.ejemplar=Integer.parseInt(leer.readLine());
   	
   }
   
   public int Consultar_pelicula(String nom){
   	if(nombre.equals(nom)) 
   		return 1;
   	else
   		return 0;
   }
   
   void Mostrar_datos(){
   	System.out.println("C�digo:  "+codigo);
   	System.out.println("Nombre:  "+nombre);
   	System.out.println("Precio:  "+precio);
   	System.out.println("Clasificaci�n:  "+clasificacion);
   	System.out.println("Status:  "+status);	
    System.out.println("Ejemplares:  "+ejemplar);
   }
   
   void setPrecio(double precio){
   	this.precio=precio;
   }
}

