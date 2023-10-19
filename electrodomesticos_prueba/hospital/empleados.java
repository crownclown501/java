package hospital;

import hospital.menu.nombresd;

class empleados {
    private String nombre,direcc,area;
    private int edad;
    private char genero;
    private double salario;
    private boolean esmedico,esenfermera,esintendente,esadministrativo;


    /*class empleados extends nombresd
    {

    }*/ 

    public empleados(String nombre,int edad,char genero,double salario,String direcc,String area)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario = salario;
        this.direcc = direcc;
        this.area = area;
    }
    
    public void comparador(String area)
    {
        if ((area == "Medico")|| (area == "medico")||(area == "MEDICO"))
        {
            esmedico = true;
        }
        else if ((area == "Enfermera")|| (area == "enfermera")||(area =="ENFERMERA"))
        {
            esenfermera = true;
        }
        else if ((area == "Intendente")|| (area == "intendente")||(area == "INTENDENTE"))
        {
            esintendente = true;
        }
        else if ((area == "Administrativo")|| (area == "administrativo")||(area == "ADMINISTRATIVO"))
        {
            esadministrativo = true;
        }
    }
    
    

    public void imprimirDatos()
    {
        comparador();
        if (esmedico)
        {
            imprimirDatosMedico();
        }
        else if (esenfermera)
        {
            imprimirDatosEnfermera();
        }
        else if (esadministrativo)
        {
            imprimirDatosAdministrador();
        }
        else if(esintendente)
        {
            imprimirDatosIntendente();
        }
    }

    private void imprimirDatosMedico()
    {
        System.out.println("nombre: " + nombre);
        System.out.println("edad " + edad );
        System.out.println("Su genero es  " + genero);
        System.out.println("direccion:" + direcc);
        System.out.println("Salario " + salario);
    }

    private void imprimirDatosEnfermera()
    {
        System.out.println("nombre: " + nombre);
        System.out.println("edad " + edad );
        System.out.println("Su genero es  " + genero);
        System.out.println("direccion:" + direcc);
        System.out.println("Salario " + salario);
    }

    private void imprimirDatosIntendente()
    {
        System.out.println("nombre: " + nombre);
        System.out.println("edad " + edad );
        System.out.println("Su genero es  " + genero);
        System.out.println("direccion:" + direcc);
        System.out.println("Salario " + salario);
    }

    private void imprimirDatosAdministrador()
    {
        System.out.println("nombre: " + nombre);
        System.out.println("edad " + edad );
        System.out.println("Su genero es  " + genero);
        System.out.println("direccion:" + direcc);
        System.out.println("Salario " + salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEsmedico() {
        return esmedico;
    }

    public void setEsmedico(boolean esmedico) {
        this.esmedico = esmedico;
    }

    public boolean isEsenfermera() {
        return esenfermera;
    }

    public void setEsenfermera(boolean esenfermera) {
        this.esenfermera = esenfermera;
    }

    public boolean isEsintendente() {
        return esintendente;
    }

    public void setEsintendente(boolean esintendente) {
        this.esintendente = esintendente;
    }

    public boolean isEsadministrativo() {
        return esadministrativo;
    }

    public void setEsadministrativo(boolean esadministrativo) {
        this.esadministrativo = esadministrativo;
    }

    /*public empleados(String nombre, String direcc, String area, int edad, char genero, double salario, boolean esmedico,
            boolean esenfermera, boolean esintendente, boolean esadministrativo) {
        this.nombre = nombre;
        this.direcc = direcc;
        this.area = area;
        this.edad = edad;
        this.genero = genero;
        this.salario = salario;
        this.esmedico = esmedico;
        this.esenfermera = esenfermera;
        this.esintendente = esintendente;
        this.esadministrativo = esadministrativo;
    }*/

    

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        empleados other = (empleados) obj;
        if (area == null) {
            if (other.area != null)
                return false;
        } else if (!area.equals(other.area))
            return false;
        if (direcc == null) {
            if (other.direcc != null)
                return false;
        } else if (!direcc.equals(other.direcc))
            return false;
        if (edad != other.edad)
            return false;
        if (esadministrativo != other.esadministrativo)
            return false;
        if (esenfermera != other.esenfermera)
            return false;
        if (esintendente != other.esintendente)
            return false;
        if (esmedico != other.esmedico)
            return false;
        if (genero != other.genero)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
            return false;
        return true;
    }*/

}
