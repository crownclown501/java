public abstract class Producto {
    private final String nombre;
    private final int numeroDeProducto;
    private float precio;
    private float porcentaje;

    public Producto(String nombre, int numeroDeProducto, float precio, float porcentaje) {
        this.nombre = nombre;
        this.numeroDeProducto = numeroDeProducto;
        this.precio = precio;
        this.porcentaje = porcentaje;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeProducto() {
        return numeroDeProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPorcentaje() {
        return porcentaje;
    }
}