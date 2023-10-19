package segundoparcial;
import java.io.*;

public class Cliente {
	protected int Clave;
	protected String Nombre;
	protected String Direccion;
	protected String Tel;
	protected String correoElectronico;
	String n;
    public Cliente() {
    }
    
    public Cliente(int Clave,String Nombre,String Direccion,String Tel) {
    	this.Clave=Clave;
    	this.Nombre=Nombre;
    	this.Direccion=Direccion;
    	this.Tel=Tel;
    	
    }

    void Dar_Alta(int n)throws IOException{
		BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Clave:");
			this.Clave=Integer.parseInt(leer.readLine());
		if(n!=Clave){
			System.out.println("El usuario ya esta registrado");	
			}
			else
			{
				System.out.println("----- El usuario no esta registrado -----");
				System.out.println("Nombre:");
				this.Nombre=leer.readLine();
				System.out.println("Direccion:");
				this.Direccion=leer.readLine();
				System.out.println("Telefono:");
				this.Tel=leer.readLine();
			}
    }
    
    void Consultar(String n,int f){
    	if(n.equals(Nombre)&& f==Clave){
    	Mostrar_datos();	
    	}
    	else
		{
			System.out.println("----- El usuario no esta registrado -----");
		}
    		
    }
    
    void Mostrar_datos(){
    	System.out.println("Clave:  "+Clave);
    	System.out.println("Nombre:  "+Nombre);
    	System.out.println("Direccion:  "+Direccion);
    	System.out.println("Telefono:  "+Tel);
    	
    }  
}