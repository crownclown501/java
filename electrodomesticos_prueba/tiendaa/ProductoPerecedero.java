public class ProductoPerecedero extends Producto{
    private final Fecha fechaDeCaducidad;
    public ProductoPerecedero(String nombre, int numeroDeProducto, float precio, float porcentaje,Fecha fechaDeCaducidad) {
        super(nombre, numeroDeProducto, precio, porcentaje);
        this.fechaDeCaducidad=fechaDeCaducidad;
    }

    public Fecha getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }
    
    public String toString(String nombre, int numeroDeProducto, float precio, float porcentaje, Fecha fechaDeCaducidad){
        String date;
        date=nombre+Integer.toString(numeroDeProducto)+Float.toString(precio)+Float.toString(porcentaje)+Fecha.toString(fechaDeCaducidad);
        return date;
    }
}
