
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.*;

public class Almacen1 {
    
    Vector  vPrincipal = new Vector();
	
	public void guardarArchivo(LinkedList<Producto>lista)
	{
		Producto p;
		Fecha f;
		try{
			FileWriter fw = new FileWriter("Inventario",true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.print(p.getNombre());
			pw.print(" "+p.getPrecio());
			pw.print(" "+p.getNumeroDeProducto());
			pw.print(" "+p.getPorcentaje());
			if (p instanceof ProductoPerecedero)
			{
				f=((ProductoPerecedero) p).getFechadeCaducidad();
				pw.print(" "+f.getDia()+"/"+f.getMes+"/"+getAnio()+)
				
			}
			pwclose();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
		}
	}
        
    Public DefaultTableModel Alma(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Precio");
        cabeceras.addElement("Numero Producto");
        cabeceras.addElement("Porcentaje");
        cabeceras.addElement("Fecha de Caducidad");
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
            try {
                FileReader fr = new FileReader("Inventario");
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine())!=null) {                    
                    StringTokenizer dato = new StringTokenizer(line," ");
                    Vector x =new Vector();
                    While(dato.hasMoreTokens())
                    {
                        (x.addElement(dato.nextToken()));
                    }
                    mdlTabla.addRow(x);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        return mdlTabla;
    }
    private void While(boolean hasMoreTokens) {
    }
}
