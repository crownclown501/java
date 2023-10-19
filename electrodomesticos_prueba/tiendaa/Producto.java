public class Producto {
    private final String nombre;
    public Producto(String nombre, int numeroDeProducto, float precio, float porcentaje, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.numeroDeProducto = numeroDeProducto;
        this.precio = precio;
        this.porcentaje = porcentaje;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    private final int numeroDeProducto;
    private float precio;
    private float porcentaje;
    private final int dia;
    private final int mes;
    private final int anio;

    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
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

    Object getClass(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    static String toString(Producto fecha){
        String date;
        int dia,mes,anio;
        dia=fecha.getDia();
        mes=fecha.getMes();
        anio=fecha.getAnio();
        date=Integer.toString(dia)+Integer.toString(mes)+Integer.toString(anio);
        return date;
    }
}
