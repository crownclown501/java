package cyp;

class Alumno {
    private String nombre;
    private float calificacion;

    public Alumno(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public String toString() {
        return nombre + ": " + calificacion;
    }
}
