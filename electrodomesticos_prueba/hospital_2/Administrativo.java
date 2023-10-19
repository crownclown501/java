package hospital_2;

import java.util.Scanner;

public class Administrativo extends Empleado{
    protected int numeroDeAdministrativo;
    protected boolean personalDeConfianza;
    protected boolean sindicalizado;

    protected Administrativo(String nombre, int edad, char genero, String direccion, float salario, boolean personalDeConfianza, boolean sindicalizado, int numeroDeAdministrativo) {
        super(nombre, edad, genero, direccion, salario);
        this.numeroDeAdministrativo = numeroDeAdministrativo;
        this.personalDeConfianza = personalDeConfianza;
        this.sindicalizado = sindicalizado;
    }

    protected void setPersonalDeConfianza(boolean personalDeConfianza) {
        this.personalDeConfianza = personalDeConfianza;
    }

    protected void setSindicalizado(boolean sindicalizado) {
        this.sindicalizado = sindicalizado;
    }


    public void setNumeroDeAdministrativo(int numeroDeAdministrativo) {
        this.numeroDeAdministrativo = numeroDeAdministrativo;
    }

    protected void leerAdministrativo(Administrativo a1,int m,Empleado[] empleadosAdministrativos){
        String nombreAdministrativo;
        int edadAdministrativo;
        char generoAdministrativo;
        String direccionAdministrativo;
        float salarioAdministrativo;
        int tipoDeContrato;
        int numeroDeAdministrativo;
        int j;
        tipoDeContrato=0;
        boolean perosnalDeConfianza=false;
        boolean sindicalizado=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Administrativo(a): ");
        nombreAdministrativo= leer.nextLine();
        System.out.println("Ingrese la edad del Administrativo(a): ");
        edadAdministrativo=leer.nextInt();
        while(edadAdministrativo<=0 || edadAdministrativo>=99){
            System.out.println("Ingrese la edad del Administrativo(a): ");
            edadAdministrativo=leer.nextInt();
        }
        System.out.println("Ingrese el genero del Administrativo(a): ");
        generoAdministrativo=leer.next().charAt(0);
        while(generoAdministrativo!= 'm' && generoAdministrativo!= 'M' && generoAdministrativo!= 'f' && generoAdministrativo!= 'F'){
            System.out.println("Ingrese el genero del Administrativo(a): ");
            generoAdministrativo=leer.next().charAt(0);
        }
        leer.nextLine();
        System.out.println("Ingrese la direccion del Administrativo(a): ");
        direccionAdministrativo= leer.nextLine();
        System.out.println("Ingrese el salario del Administrativo(a): ");
        salarioAdministrativo=leer.nextFloat();
        while(salarioAdministrativo<=0) {
            System.out.println("Ingrese el salario del Administrativo(a): ");
            salarioAdministrativo=leer.nextFloat();
        }
        while(tipoDeContrato<1 || tipoDeContrato>4){
            System.out.println("Ingrese el numero del tipo de contrato que tiene el administrativo(a)");
            System.out.println("1:Personal de confianza");
            System.out.println("2:sindicalizado");
            tipoDeContrato= leer.nextInt();
            switch(tipoDeContrato){
                case 1:{
                    perosnalDeConfianza=true;
                    break;
                }
                case 2:{
                    sindicalizado=true;
                    break;
                }
                default:{
                    System.out.println("La opcion ingresada no es valida");
                }
            }
        }
        System.out.println("Ingres el numero de medico");
        numeroDeAdministrativo=leer.nextInt();
        for(j=0;j<m;j++){
            Administrativo a2=(Administrativo) empleadosAdministrativos[j];
            while(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                System.out.println("Ingres el numero de medico");
                numeroDeAdministrativo=leer.nextInt();
            }
        }
        a1.setNombre(nombreAdministrativo);
        a1.setEdad(edadAdministrativo);
        a1.setGenero(generoAdministrativo);
        a1.setDireccion(direccionAdministrativo);
        a1.setSalario(salarioAdministrativo);
        a1.setSindicalizado(sindicalizado);
        a1.setPersonalDeConfianza(perosnalDeConfianza);
        a1.setNumeroDeAdministrativo(numeroDeAdministrativo);
    }
    protected void escritura(Administrativo a1){
        if(a1.sindicalizado){
            System.out.println("El contrato del Administrativo(a) indica que es sindicalizado");
        }else if(a1.personalDeConfianza){
            System.out.println("El contrato del Administrativo(a) indica que es personal de confianza");
        }
    }
}