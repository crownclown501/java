package hospital2;

import java.util.Scanner;

public class Intendente extends Empleado{
    String nombreDeLaEmpresa;
    protected int numeroDeIntendente;

    protected Intendente(String nombre, int edad, char genero, String direccion, float salario, String nombreDeLaEmpresa) {
        super(nombre, edad, genero, direccion, salario);
        this.nombreDeLaEmpresa = nombreDeLaEmpresa;
        
    }

    protected void setNumeroDeIntendente(int numeroDeIntendente){
        this.numeroDeIntendente = numeroDeIntendente;
    }

    protected String getNombreDeLaEmpresa() {
        return nombreDeLaEmpresa;
    }

    protected void setNombreDeLaEmpresa(String nombreDeLaEmpresa) {
        this.nombreDeLaEmpresa = nombreDeLaEmpresa;
    }

    protected void leerIntendente(Intendente i1,int l, Empleado empleadosIntendentes[]){
        String nombreIntendente;
        int j;
        int edadIntendente;
        char generoIntendente;
        String direccionIntendente;
        float salarioIntendente;
        String nombreDeLaEmpresa;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Intendente(a): ");
        nombreIntendente= leer.nextLine();
        System.out.println("Ingrese la edad del Intendente(a): ");
        edadIntendente=leer.nextInt();
        while(edadIntendente<=0 || edadIntendente>=99){
            System.out.println("Ingrese la edad del Intendente(a): ");
            edadIntendente=leer.nextInt();
        }
        System.out.println("Ingrese el genero del Intendente(a): ");
        generoIntendente=leer.next().charAt(0);
        while(generoIntendente!= 'm' && generoIntendente!= 'M' && generoIntendente!= 'f' && generoIntendente!= 'F'){
            System.out.println("Ingrese el genero del Intendente(a): ");
            generoIntendente=leer.next().charAt(0);
        }
        leer.nextLine();
        System.out.println("Ingrese la direccion del Intendente(a): ");
        direccionIntendente= leer.nextLine();
        System.out.println("Ingrese el salario del Intendente(a): ");
        salarioIntendente=leer.nextFloat();
        while(salarioIntendente<=0) {
            System.out.println("Ingrese el salario del Intendente(a): ");
            salarioIntendente=leer.nextFloat();
        }
        System.out.println("Ingres el numero de medico");
        numeroDeIntendente=leer.nextInt();
        for(j=0;j<l;j++){
            Intendente i2=(Intendente) empleadosIntendentes[j];
            while(numeroDeIntendente==i2.numeroDeIntendente){
                System.out.println("Ingres el numero de medico");
                numeroDeIntendente=leer.nextInt();
            }
        }
        leer.nextLine();
        System.out.println("Ingrese el nombre de la  empresa a la que pertenenece el Intendente(a): ");
        nombreDeLaEmpresa= leer.nextLine();
        i1.setNombre(nombreIntendente);
        i1.setEdad(edadIntendente);
        i1.setGenero(generoIntendente);
        i1.setDireccion(direccionIntendente);
        i1.setSalario(salarioIntendente);
        i1.setNombreDeLaEmpresa(nombreDeLaEmpresa);
        i1.setNumeroDeIntendente(numeroDeIntendente);
    }
    protected void escritura(Intendente i1){
        System.out.println("La empresa del intendente es: "+i1.getNombreDeLaEmpresa());
    }
}