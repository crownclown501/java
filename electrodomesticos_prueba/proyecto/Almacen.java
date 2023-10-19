import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.DataOutputStream;

public class Almacen {
    private final String nombreDelArchivo;

    public Almacen(String nombreDelArchivo) {
        this.nombreDelArchivo = nombreDelArchivo;
    }

    public boolean almacenaProductos(LinkedList<Producto> lista){
        DataOutputStream escribir;
        if (lista != null) {
            try{
                escribir=new DataOutputStream(new FileOutputStream(nombreDelArchivo));
            }
            catch(IOException e){
                return false;
                
            }
            ListIterator <Producto> listaIterador=lista.listIterator(0);
            Producto p;
            Fecha f;
            while (listaIterador.hasNext()) {
                p=listaIterador.next();
                try{
                    escribir.writeBytes("Nombre del producto es: "+p.getNombre());
                    escribir.writeBytes("\nPrecio del producto es: "+p.getPrecio());
                    escribir.writeBytes("\nNumero de producto " +p.getNumeroDeProducto());
                    escribir.writeBytes("\nPorcentaje de ganacia del producto"+p.getPorcentaje());
                    escribir.writeBytes("\n");
                    if (p instanceof ProductoPerecedero) {
                        f=((ProductoPerecedero)p).getFechaDeCaducidad();
                        escribir.writeBytes("La fecha de caducidad es: "+f.getDia()+"/"+f.getMes()+"/"+f.getAnio());

                    } else {
                        escribir.writeInt(0);
                        escribir.writeInt(0);
                        escribir.writeInt(0);
                    }
                    escribir.flush();
                    escribir.writeBytes("\n");
                }
                catch(IOException e){return false;}
            }
            try {
                escribir.close();
            }
            catch(IOException e){return false;}
            return true;
        }
        return false;
        
    }

    public LinkedList<Producto> readProductos(LinkedList lista){
        
        DataInputStream entrada;
        LinkedList<Producto> listaProductos=new LinkedList();
        try{
            entrada=new DataInputStream(new FileInputStream(nombreDelArchivo));
        }
        catch(IOException e){
            return null;
        }

        File archivo = null;
       FileReader fr = null;
       BufferedReader br = null;
 
       try {
          // Apertura del fichero y creacion de BufferedReader para poder
          // hacer una lectura comoda (disponer del metodo readLine()).
          archivo = new File ("C:\\archivo.txt");
          fr = new FileReader (archivo);
          br = new BufferedReader(fr);
 
          // Lectura del fichero
          String linea;
          while((linea=br.readLine())!=null)
             System.out.println(linea);
       }
       catch(Exception e){
          e.printStackTrace();
       }finally{
          // En el finally cerramos el fichero, para asegurarnos
          // que se cierra tanto si todo va bien como si salta 
          // una excepcion.
          try{                    
             if( null != fr ){   
                fr.close();     
             }                  
          }catch (Exception e2){ 
             e2.printStackTrace();
          }
       }
    return lista;
    
    }


   /* public LinkedList<Producto> recuperaProductos(LinkedList lista){
        DataInputStream entrada;
        LinkedList<Producto> listaProductos=new LinkedList();
        try{
            entrada=new DataInputStream(new FileInputStream(nombreDelArchivo));
        }
        catch(IOException e){
            return null;
        }

        String nombre;
        float precio;
        int numeroDeProducto, d, m, a;
        float porcentaje;
        while(true) {
            try{
                nombre=entrada.readUTF();
                numeroDeProducto=entrada.readInt();
                precio=entrada.readFloat();
                porcentaje=entrada.readFloat();
                d=entrada.readInt();
                m=entrada.readInt();
                a=entrada.readInt();
            }
            catch(IOException e){break;}
            if (d==0)
                listaProductos.add(new ProductoNoPerecedero(nombre,numeroDeProducto,precio,porcentaje));
            else
                listaProductos.add(new ProductoPerecedero(nombre,numeroDeProducto, precio,porcentaje,new Fecha(d, m, a)));
        }
        try {
            entrada.close();
        }
        catch(IOException e){return null;}
        return listaProductos;
        
    }*/
}
