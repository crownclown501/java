package hospital2;
import java.util.Scanner;

public class Enfermera extends Empleado{
    protected int numeroDeEnfermera;
    protected boolean departamentoOftalmologia;
    protected boolean departamentoGinecologia;
    protected boolean departamentoPediatria;
    protected boolean departamentoMedicinaGeneral;

    protected Enfermera(String nombre, int edad, char genero, String direccion, float salario, boolean departamentoOftalmologia, boolean departamentoGinecologia, boolean departamentoPediatria, boolean departamentoMedicinaGeneral,int numeroDeEnfermera) {
        super(nombre, edad, genero, direccion, salario);
        this.numeroDeEnfermera=numeroDeEnfermera;
        this.departamentoOftalmologia = departamentoOftalmologia;
        this.departamentoGinecologia = departamentoGinecologia;
        this.departamentoPediatria = departamentoPediatria;
        this.departamentoMedicinaGeneral = departamentoMedicinaGeneral;
    }

    protected void setDepartamentoOftalmologia(boolean departamentoOftalmologia) {
        this.departamentoOftalmologia = departamentoOftalmologia;
    }

    protected void setDepartamentoGinecologia(boolean departamentoGinecologia) {
        this.departamentoGinecologia = departamentoGinecologia;
    }

    protected void setDepartamentoPediatria(boolean departamentoPediatria) {
        this.departamentoPediatria = departamentoPediatria;
    }

    protected void setDepartamentoMedicinaGeneral(boolean departamentoMedicinaGeneral) {
        this.departamentoMedicinaGeneral = departamentoMedicinaGeneral;
    }

    public void setNumeroDeEnfermera(int numeroDeEnfermera) {
        this.numeroDeEnfermera = numeroDeEnfermera;
    }

    protected void leerEnfermera(Enfermera e1,int k, Empleado[] empleadosEnfermeros){
        String nombreEnfermera;
        int edadEnfermera;
        char generoEnfermera;
        String direccionEnfermera;
        float salarioEnfermera;
        int opcionDeDepartamento;
        int numeroDeEnfermera;
        opcionDeDepartamento=0;
        int j;
        boolean departamentoOftalmologia=false;
        boolean departamentoGinecologia=false;
        boolean departamentoPediatria=false;
        boolean departamentoMedicinaGeneral=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Enfermero(a): ");
        nombreEnfermera= leer.nextLine();
        System.out.println("Ingrese la edad del Enfermero(a): ");
        edadEnfermera=leer.nextInt();
        while(edadEnfermera<=0 || edadEnfermera>=99){
            System.out.println("Ingrese la edad del Enfermero(a): ");
            edadEnfermera=leer.nextInt();
        }
        System.out.println("Ingrese el genero del Enfermero(a): ");
        generoEnfermera=leer.next().charAt(0);
        while(generoEnfermera!= 'm' && generoEnfermera!= 'M' && generoEnfermera!= 'f' && generoEnfermera!= 'F'){
            System.out.println("Ingrese el genero del Enfermero(a): ");
            generoEnfermera=leer.next().charAt(0);
        }
        leer.nextLine();
        System.out.println("Ingrese la direccion del Enfermero(a): ");
        direccionEnfermera= leer.nextLine();
        System.out.println("Ingrese el salario del Enfermero(a): ");
        salarioEnfermera = leer.nextFloat();
        while(salarioEnfermera<=0) {
            System.out.println("Ingrese el salario del Enfermero(a): ");
            salarioEnfermera = leer.nextFloat();
        }
        while(opcionDeDepartamento<1 || opcionDeDepartamento>4){
            System.out.println("Ingrese el numero del departamento al que pertenece el Enfermero(a)");
            System.out.println("1:Oftalmologia");
            System.out.println("2:Ginecologia");
            System.out.println("3:Pediatria");
            System.out.println("4:Medicina General");
            opcionDeDepartamento= leer.nextInt();
            switch(opcionDeDepartamento){
                case 1:{
                    departamentoOftalmologia=true;
                    break;
                }
                case 2:{
                    departamentoGinecologia=true;
                    break;
                }
                case 3:{
                    departamentoPediatria=true;
                    break;
                }
                case 4:{
                    departamentoMedicinaGeneral=true;
                    break;
                }
                default:{
                    System.out.println("La opcion ingresada no es valida");
                }
            }
        }
        System.out.println("Ingres el numero de Enfermero(a)");
        numeroDeEnfermera=leer.nextInt();
        for(j=0;j<k;j++){
            Enfermera e2=(Enfermera) empleadosEnfermeros[j];
            while(numeroDeEnfermera==e2.numeroDeEnfermera){
                System.out.println("Ingres el numero de Enfermero(a)");
                numeroDeEnfermera=leer.nextInt();
            }
        }
        e1.setNombre(nombreEnfermera);
        e1.setEdad(edadEnfermera);
        e1.setGenero(generoEnfermera);
        e1.setDireccion(direccionEnfermera);
        e1.setSalario(salarioEnfermera);
        e1.setDepartamentoOftalmologia(departamentoOftalmologia);
        e1.setDepartamentoGinecologia(departamentoGinecologia);
        e1.setDepartamentoPediatria(departamentoPediatria);
        e1.setDepartamentoMedicinaGeneral(departamentoMedicinaGeneral);
        e1.setNumeroDeEnfermera(numeroDeEnfermera);
    }
    protected void escrituta(Enfermera e1){
        if(e1.departamentoOftalmologia){
            System.out.println("El departamento del Enfermero(a) es Oftalmologia");
        }else if(e1.departamentoGinecologia){
            System.out.println("El departamento del Enfermero(a) es: Ginecologia");
        }else if(e1.departamentoPediatria){
            System.out.println("El departamento del Enfermero(a) es: Pediatria");
        }else if(e1.departamentoMedicinaGeneral){
            System.out.println("El departamento del Enfermero(a) es: Medicina General");
        }
    }
}