
import javax.swing.JFrame;
import java.io.*;
public class prueba {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        InputStream entrada = null;
        OutputStream salida = null;
        try {
            entrada = new FileInputStream("origen.txt"); 
            salida = new FileOutputStream("destino.txt"); 
            int c;
            while ((c = entrada.read()) != -1) {
                salida.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de E/S");
        }
        if (entrada != null) try {
            entrada.close();
        } catch (IOException e) {}
        if (salida != null) try {
            salida.close();
        } catch (IOException e) {}
    }
}