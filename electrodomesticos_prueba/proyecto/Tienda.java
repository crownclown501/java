import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Tienda {
    public static void main(String[] args) throws IOException {
       
        Scanner leer = new Scanner(System.in); //se va a borrar este
        LinkedList <Producto> lista =new LinkedList();
        LinkedList <Producto> listaCompra =new LinkedList();
        Fecha f1;
        ProductoPerecedero pp1;
        ProductoNoPerecedero pnp1;
        String nombre;
        int numeroDeProducto;
        float precio;
        float porcentaje;
        int dia,mes,anio;
        float contador,pago,ganancia;
        int opc,opc1,opc3,contadorProductos;
        ganancia=0;
        contador=ganancia;
        Almacen archivo=new Almacen("Inventario");
        Producto p;
        ListIterator <Producto> listaIterador;
        contadorProductos=0;
        archivo.recuperaProductos(lista);
        System.out.println(""+lista.size());
        do {
            //set.textfield("ingrese")
            System.out.println("1: Dar de alta un producto");
            System.out.println("2: Dar de baja un producto");
            System.out.println("3: Modificar un producto");
            System.out.println("4: Mostrar lista de productos a comprar");
            System.out.println("5: Añadir producto a lista de comprar");
            System.out.println("6: Cobrar cliente");
            System.out.println("7: Salir");
            opc= leer.nextInt();
            switch(opc){
                case 1:{
                    System.out.println("Ingreso a la opcion Dar de alta un producto");
                    System.out.println("Ingrese el numero de la opcion del producto que desea dar de alta");
                    System.out.println("1: Procuto perecedero");
                    System.out.println("2: Producto no perecedero");
                    opc1=leer.nextInt();
                    switch(opc1){
                        case 1:{
                            System.out.println("Ingreso a la opcion Dar de alta un producto  perecedero");
                            leer.nextLine();
                            System.out.println("Ingrese el nombre del producto");
                            nombre=leer.nextLine();
                            numeroDeProducto=contadorProductos;
                            contadorProductos++;
                            System.out.println("Ingrese el precio del producto");
                            do {
                                precio = leer.nextFloat();
                            }while(precio<=0);
                            System.out.println("Ingrese el porcentaje del precio del producto: NOTA  DEBE DE SER INGRESADO COMO PUNTO DECIMAL");
                            do {
                                porcentaje = leer.nextFloat();
                            }while(porcentaje<=0);
                            porcentaje=precio*porcentaje;
                            System.out.println("Ingrese el dia de la fecha de caducidad");
                            do{
                                dia=leer.nextInt();
                            }while(dia<=0 || dia>31);
                            System.out.println("Ingrese el mes de la fecha de caducidad");
                            do{
                                mes=leer.nextInt();
                            }while(mes<=0 || mes>12);
                            System.out.println("Ingrese el anio de la fecha de caducidad");
                            do{
                                anio=leer.nextInt();
                            }while(anio<=0 || anio>2021);
                            f1= new Fecha(dia,mes,anio);
                            pp1= new ProductoPerecedero(nombre,numeroDeProducto,precio,porcentaje,f1);
                            lista.add(pp1);
                            System.out.println(contadorProductos);
                            break;
                        }
                        case 2:{
                            System.out.println("Ingreso a la opcion Dar de alta un producto no perecedero");
                            leer.nextLine();
                            System.out.println("Ingrese el nombre del producto");
                            nombre=leer.nextLine();
                            numeroDeProducto=contadorProductos;
                            contadorProductos++;
                            System.out.println("Ingrese el precio del producto");
                            do {
                                precio = leer.nextFloat();
                            }while(precio<=0);
                            System.out.println("Ingrese el porcentaje del precio del producto: NOTA  DEBE DE SER INGRESADO COMO PUNTO DECIMAL");
                            do {
                                porcentaje = leer.nextFloat();
                            }while(porcentaje<=0);
                            porcentaje=precio*porcentaje;
                            pnp1= new ProductoNoPerecedero(nombre,numeroDeProducto,precio,porcentaje);
                            lista.add(pnp1);
                            System.out.println(pnp1.getNumeroDeProducto());
                            break;
                        }
                        default:{
                            System.out.println("La opcion ingresada no es valida");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Ingreso a la opcion Dar de baja un producto");
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del producto que desea eliminar");
                    nombre= leer.nextLine();
                    listaIterador=lista.listIterator(0);
                    while (listaIterador.hasNext()) {
                        p=listaIterador.next();
                        if(nombre.equals(p.getNombre())){
               
                            listaIterador.remove();
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Ingreso a la opcion Modificar un producto");
                    System.out.println("Ingrese el nombre del producto que desea modificar");
                    leer.nextLine();
                    nombre= leer.nextLine();
                    listaIterador=lista.listIterator(0);
                    while (listaIterador.hasNext()) {
                        p=listaIterador.next();
                        if(nombre.equals(p.getNombre())){
                            System.out.println("Ingrese el numero de la opcion de lo que desea modificar:");
                            System.out.println("1: precio");
                            System.out.println("2: porcentaje");
                            opc3=leer.nextInt();
                            switch (opc3) {
                                case 1: {
                                    System.out.println("Ingreso a la opcion modificar precio");
                                    System.out.println("Ingrese el nuevo precio");
                                    precio = leer.nextFloat();
                                    p.setPrecio(precio);
                                    listaIterador.set(p);
                                    break;
                                }
                                case 2: {
                                    System.out.println("Ingreso a la opcion modificar porcentaje");
                                    System.out.println("Ingrese el nuevo porcentaje");
                                    porcentaje = leer.nextFloat();
                                    p.setPorcentaje(porcentaje);
                                    listaIterador.set(p);
                                    break;
                                }
                                default:{
                                    System.out.println("La opcion ingresada no es valida");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Ingreso a la opcon Ver inventario ");
                    System.out.println("\n ............Lista de Compras .... \n");
                    listaIterador=listaCompra.listIterator(0);
                    while (listaIterador.hasNext()) {
                        p=listaIterador.next();
                        if(!p.getNombre().equals(" ")){
                            System.out.println("Nombre del producto: "+p.getNombre());
                            System.out.println("Precio del producto: "+p.getPrecio());
                            if (p instanceof ProductoPerecedero) {
                                f1 = ((ProductoPerecedero)p).getFechaDeCaducidad();
                                System.out.println("Fecha de caducidad del producto: "+f1.getDia()+"/"+f1.getMes()+"/"+f1.getAnio());
                            }else{
                                System.out.println("Producto No Perecedero");
                            }
                            System.out.println( );
                        }
                    }
                    break;
                }
                case 5:{
                    System.out.println("Ingreso a la opcion Hacer lista de compra");
                    System.out.println("Ingrese el nombre del producto que desea modificar");
                    leer.nextLine();
                    nombre= leer.nextLine();
                    listaIterador=lista.listIterator(0);
                    while (listaIterador.hasNext()) {
                        p=listaIterador.next();
                        if(nombre.equals(p.getNombre())){
                            listaCompra.add(p);
                            contador+=p.getPrecio();
                            ganancia+=p.getPorcentaje();
                        }
                    }
                    break;
                }
                case 6:{
                    if(contador!=0) {
                        System.out.println("Ingreso a la opcion Cobrar cliente");
                        while (contador > 0) {
                            System.out.println("Usted debe de pagar: " + contador);
                            System.out.println("Igrese la cantidad con la que va a pagar:");
                            pago = leer.nextFloat();
                            contador -= pago;
                            if (pago > contador) {
                                System.out.println("Su cambio es: " + (contador * -1));
                            }
                        }
                        contador=0;
                    }else{
                        System.out.println("No existe deuda");
                    }
                    System.out.println("Su cuenta quedo pagada,");
                    break;
                }
                case 7:{
                    System.out.println("Hasta luego");
                    archivo.almacenaProductos(lista);
                    break;
                }

                default:{
                    System.out.println("La opcion ingresada no es valida");
                    break;
                }
            }
        }while(opc!=7);
    }
}