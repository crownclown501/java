package segundoparcial;
import java.io.*;

public class Compu {
    protected String nombre;
    protected  int ram;
    protected boolean ocupada;
    protected long id;

    public Compu(String nombre, int ram, boolean ocupada, long id) {
        this.nombre = nombre;
        this.ram = ram;
        this.ocupada = ocupada;
        this.id = id;
    }

    void Dar_Alta()throws IOException{
    	BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Nombre:");
    	this.nombre=leer.readLine();
        System.out.println("Digite tamanio de la ram:");
    	this.ram=Integer.parseInt(leer.readLine());
    	System.out.println("Direccion:");
    	this.ocupada=leer.ready();
    	System.out.println("id:");
    	this.id=leer.read();
    	
    }

    void Mostrar_datos(){
    	System.out.println("sistema:  "+nombre);
    	System.out.println("tamanio ram:  "+ram);
    	System.out.println("disponibilidad:  "+ocupada);
    	System.out.println("id:  "+id);
    	
    }




}
