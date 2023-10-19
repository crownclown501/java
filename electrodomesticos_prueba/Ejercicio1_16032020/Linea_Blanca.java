package Ejercicio1_16032020;
import 
import java.util.Scanner;
class Linea_Blanca {
    
    public static void main(String[] args) 
    {
            Scanner leer = new Scanner(System.in);
            Electrodomesticos []electrodomesticos = new Electrodomesticos[5];
            int opcion,opcion1,opcion2;
            
            electrodomesticos[0] = new Electrodomesticos(8, true, 7000);
            electrodomesticos[1] = new Electrodomesticos(2.5, 200, 105, true, 90000);
            electrodomesticos[2] = new Electrodomesticos(20, true, 23000);
            electrodomesticos[3] = new Electrodomesticos(3, 230, 245, true, 95000);
            electrodomesticos[4] = new Electrodomesticos(2, 120, 200, false, 50000);
            
            System.out.println("usted tiene de opciones 5 electrodomesticos de los cuales\n 3 son refrigeradores y 2 son lavadoras");
            System.out.println("\n1)lavadora\n2)refrigerador\n");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("1)lavar\n2)detenerlavado\n3)enjuagar\n4)terminar\n");
                opcion1 = leer.nextInt();
                    switch (opcion1) {
                        case 1:
                            electrodomesticos[0].iniciarLavado();
                            electrodomesticos[2].iniciarLavado();
                            break;
                            case 2:
                            electrodomesticos[0].detenerCiclo();
                            electrodomesticos[2].detenerCiclo();
                            break;
                            case 3:
                            electrodomesticos[0].enjuagar();
                            electrodomesticos[2].enjuagar();
                            break;
                            case 4:
                            electrodomesticos[0].terminar();
                            electrodomesticos[2].terminar();
                            break;
                            electrodomesticos[0].imprimirDatos();
                            electrodomesticos[2].imprimirDatos();
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1)abrir_puerta\n2)cerrar_puerta\n3)encenderLampara\n4)apagar_lampara\n5)cambiartemperatura\n");
                    opcion2 = leer.nextInt();
                    switch (opcion2) {
                        case 1:
                            electrodomesticos[1].abrirPuerta();
                            electrodomesticos[3].abrirPuerta();
                            electrodomesticos[4].abrirPuerta();
                            break;
                            case 2:
                            electrodomesticos[1].cerrarPuerta();
                            electrodomesticos[3].cerrarPuerta();
                            electrodomesticos[4].cerrarPuerta();
                            break;
                            case 3:
                            electrodomesticos[1].encenderLampara();
                            electrodomesticos[3].encenderLampara();
                            electrodomesticos[4].encenderLampara();
                            break;
                            case 4:
                            electrodomesticos[1].apagarLampara();
                            electrodomesticos[3].apagarLampara();
                            electrodomesticos[4].apagarLampara();
                            break;
                            case 5:
                            electrodomesticos[1].cambiarTemperatura(8);
                            electrodomesticos[3].cambiarTemperatura(8);
                            electrodomesticos[4].cambiarTemperatura(8);
                            break;
                            electrodomesticos[1].imprimirDatos;
                            electrodomesticos[3].imprimirDatos();
                            electrodomesticos[4].imprimirDatos();
                        break;
                        default:
                            break;
                    }
                    
                    break;
                default:
                    break;
            }
    }
        
}

    

    

