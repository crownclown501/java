public class ProductoPerecedero extends Producto{
    private final Fecha fechaDeCaducidad;
    public ProductoPerecedero(String nombre, int numeroDeProducto, float precio, float porcentaje,Fecha fechaDeCaducidad) {
        super(nombre, numeroDeProducto, precio, porcentaje);
        this.fechaDeCaducidad=fechaDeCaducidad;
    }

    public Fecha getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

}
