package hospital2;
import java.util.Scanner;

public class Director extends Empleado{
    protected Director(String nombre ,int edad, char genero, String direccion, float salario) {
        super(nombre, edad, genero, direccion, salario);
    }
    protected void leerDirector(Director d1){
        String nombreDirector;
        int edadDirector;
        char generoDirector;
        String direccionDirector;
        float salarioDirector;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del director: ");
        nombreDirector= leer.nextLine();
        System.out.println("Ingrese la edad del director: ");
        edadDirector=leer.nextInt();
        while(edadDirector<=0 || edadDirector>=99){
            System.out.println("Ingrese la edad del director: ");
            edadDirector=leer.nextInt();
        }
        System.out.println("Ingrese el genero del director: ");
        generoDirector=leer.next().charAt(0);
        while(generoDirector!= 'm' && generoDirector!= 'M' && generoDirector!= 'f' && generoDirector!= 'F'){
            System.out.println("Ingrese el genero del director: ");
            generoDirector=leer.next().charAt(0);
        }
        leer.nextLine();
        System.out.println("Ingrese la direccion del director: ");
        direccionDirector= leer.nextLine();
        System.out.println("Ingrese el salario del director: ");
        salarioDirector = leer.nextFloat();
        while(salarioDirector<=0) {
            System.out.println("Ingrese el salario del director: ");
            salarioDirector = leer.nextFloat();
        }
        d1.setNombre(nombreDirector);
        d1.setEdad(edadDirector);
        d1.setGenero(generoDirector);
        d1.setDireccion(direccionDirector);
        d1.setSalario(salarioDirector);
    }
}
