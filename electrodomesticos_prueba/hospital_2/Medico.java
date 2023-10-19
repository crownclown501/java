package hospital_2;
import java.util.Scanner;

public class Medico extends Empleado{
    protected int numeroDeMedico;
    protected boolean departamentoOftalmologia;
    protected boolean departamentoGinecologia;
    protected boolean departamentoPediatria;
    protected boolean departamentoMedicinaGeneral;

    protected Medico(String nombre, int edad, char genero, String direccion, float salario, boolean departamentoOftalmologia, boolean departamentoGinecologia, boolean departamentoPediatria, boolean departamentoMedicinaGeneral,int numeroDeMedico) {
        super(nombre, edad, genero, direccion, salario);
        this.numeroDeMedico= numeroDeMedico;
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

    public void setNumeroDeMedico(int numeroDeMedico) {
        this.numeroDeMedico = numeroDeMedico;
    }

    protected void leerMedico(Medico m1, int i, Empleado[] empleadosMedicos){
        String nombreMedico;
        int edadMedico;
        char generoMedico;
        String direccionMedico;
        float salarioMedico;
        int opcionDeDepartamento;
        int numeroDeMedico;
        opcionDeDepartamento=0;
        int j;
        boolean departamentoOftalmologia=false;
        boolean departamentoGinecologia=false;
        boolean departamentoPediatria=false;
        boolean departamentoMedicinaGeneral=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Medico(a): ");
        nombreMedico= leer.nextLine();
        System.out.println("Ingrese la edad del Medico(a): ");
        edadMedico=leer.nextInt();
        while(edadMedico<=0 || edadMedico>=99){
            System.out.println("Ingrese la edad del Medico(a): ");
            edadMedico=leer.nextInt();
        }
        System.out.println("Ingrese el genero del Medico(a): ");
        generoMedico=leer.next().charAt(0);
        while(generoMedico!= 'm' && generoMedico!= 'M' && generoMedico!= 'f' && generoMedico!= 'F'){
            System.out.println("Ingrese el genero del Medico(a): ");
            generoMedico=leer.next().charAt(0);
        }
        leer.nextLine();
        System.out.println("Ingrese la direccion del Medico(a): ");
        direccionMedico= leer.nextLine();
        System.out.println("Ingrese el salario del Medico(a): ");
        salarioMedico = leer.nextFloat();
        while(salarioMedico<=0) {
            System.out.println("Ingrese el salario del Medico(a): ");
            salarioMedico = leer.nextFloat();
        }
        while(opcionDeDepartamento<1 || opcionDeDepartamento>4){
            System.out.println("Ingrese el numero del departamento al que pertenece el Medico(a)");
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
        System.out.println("Ingres el numero de medico");
        numeroDeMedico=leer.nextInt();
        for(j=0;j<i;j++){
            Medico m2=(Medico) empleadosMedicos[j];
            while(numeroDeMedico==m2.numeroDeMedico){
                System.out.println("Ingres el numero de medico");
                numeroDeMedico=leer.nextInt();
            }
        }
        m1.setNombre(nombreMedico);
        m1.setEdad(edadMedico);
        m1.setGenero(generoMedico);
        m1.setDireccion(direccionMedico);
        m1.setSalario(salarioMedico);
        m1.setDepartamentoOftalmologia(departamentoOftalmologia);
        m1.setDepartamentoGinecologia(departamentoGinecologia);
        m1.setDepartamentoPediatria(departamentoPediatria);
        m1.setDepartamentoMedicinaGeneral(departamentoMedicinaGeneral);
        m1.setNumeroDeMedico(numeroDeMedico);
    }
    protected void escritura(Medico m1){
        if(m1.departamentoOftalmologia){
            System.out.println("El departamento del Medico(a) es Oftalmologia");
        }else if(m1.departamentoGinecologia){
            System.out.println("El departamento del Medico(a) es Ginecologia");
        }else if(m1.departamentoPediatria){
            System.out.println("El departamento del Medico(a) es Pediatria");
        }else if(m1.departamentoMedicinaGeneral){
            System.out.println("El departamento del Medico(a) es Medicina General");
        }
    }
}
