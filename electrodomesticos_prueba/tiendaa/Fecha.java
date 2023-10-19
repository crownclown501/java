public class Fecha {
    private final int dia;
    private final int mes;
    private final int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    static String toString(Fecha fecha){
        String date;
        int dia,mes,anio;
        dia=fecha.getDia();
        mes=fecha.getMes();
        anio=fecha.getAnio();
        date=Integer.toString(dia)+Integer.toString(mes)+Integer.toString(anio);
        return date;
    }
    
}