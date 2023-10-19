package hospital_2;

public abstract class Empleado {
    protected  String nombre;
    protected int edad;
    protected char genero;
    protected String direccion;
    protected float salario;

    protected Empleado(String nombre, int edad, char genero, String direccion, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.salario = salario;
    }

    private String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int getEdad() {
        return edad;
    }

    protected void setEdad(int edad) {
        this.edad = edad;
    }

    private char getGenero() {
        return genero;
    }

    protected void setGenero(char genero) {
        this.genero = genero;
    }

    private String getDireccion() {
        return direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private float getSalario() {
        return salario;
    }

    protected void setSalario(float salario) {
        this.salario = salario;
    }

    public void escritura(){
        System.out.println("El nombre del empleado es: "+getNombre());
        System.out.println("La edad del empleado es: "+getEdad());
        System.out.println("El genero del empleado es: "+getGenero());
        System.out.println("La direccion del empleado es: "+getDireccion());
        System.out.println("El salario del empleado es: "+getSalario());
    }

}

