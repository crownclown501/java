package hospital;
import java.util.Scanner;

public class menu {
    static enfermera[] nursed;
    static intendente[] intends;
    static administrativo[] adminds;
    static medico[] medic;
    static medico employes; 

    static int opcion,opcio1,opcion2,opcion3;
    static Scanner read = new Scanner(System.in);

    public abstract class nombresd 
    {
        String name;
        public nombresd() {
            
            System.out.println("ingrese nombre de trabajo,puede ser: medico,enfermera,intendente,administrativo:\n");
            name = read.nextLine();
        }
        
    } 
    
    public static void main(String[] args) 
    {

        /**
         * Aqui pienso poner para llenar lo de empleados
         * con un for y hasta que el usuario digite un -1
         * 
         */


        System.out.println("1)imprimir datos de los emplead@s\n2)Dar de Alta\n3)Dar de baja\n4)Modificar");
        opcion = read.nextInt();
        switch (opcion)
        {
            case 1:
                for (int i = 0; i < args.length; i++) 
                {
                    employes[i].imprimirDatos();
                }
                break;

                case 2:
                    System.out.println("ingrese area:\n1)medico\n2)enfermera\n3)intendente\4)administrador\n");
                    opcio1 = read.nextInt();
                    switch (opcio1) 
                    {
                        case 1:
                        
                            medic[i] = new medico();

                            break;
                            case 2:
                                
                                break;
                                case 3:
                                    break;
                                    case 4: 
                                        break;
                
                        default:
                            break;
                    }
                    break;
            
                    case 3:
                        System.out.println("ingrese area:\n1)medico\n2)enfermera\n3)intendente\4)administrador\n");
                        opcion2 = read.nextInt();
                        switch (opcion2) 
                        {
                            case 1:

                                break;
                                case 2:

                                    break;
                                    case 3:
                                        break;
                                        case 4: 
                                            break;
                    
                            default:
                                break;
                        }
                        break;

                        case 4:
                        System.out.println("ingrese area:\n1)medico\n2)enfermera\n3)intendente\4)administrador\n");
                        opcion3 = read.nextInt();
                        switch (opcion3) 
                        {
                            case 1:
    
                                break;
                                case 2:
    
                                    break;
                                    case 3:
                                        break;
                                        case 4: 
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
