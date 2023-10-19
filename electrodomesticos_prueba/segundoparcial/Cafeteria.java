package segundoparcial;
import java.io.*;

public class Cafeteria 
{
    private static long id;
    static int tamp=10,tamc=10;
            
        static int j=1000;
        static int x=0;
        static boolean flag = false;
        static int opcion1;
        int opcion2;
        static Cliente[] clientes = new Cliente [tamc];
        static Compu[] compus = new Compu [tamp];
        static Dueño dueño=new Dueño(id);
    public static void main (String[] args) throws IOException
    {
    	
        

        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    	    if(!flag){
                System.out.println("Ingreso a la opcion Dar de alta al Administrador");
                
                dueño = new Dueño(id);
                dueño.setId(id);
                
                System.out.println("\n");
                flag=true;
            }else{
                System.out.println("Solo se puede dar de alta una vez al director");
                flag=false;
            }
            
        do
        {
            
            
            System.out.println("************* Menu Principal ***************");
            System.out.println("1) Dar de alta cliente\n2) Dar alta equipo\n3) Mostrar usuario\n4) Mostrar computadora\n5) Asignar computadora\n6) Cobrar\n7) Salir");
            System.out.println("Elija una opcion:  ");
            opcion1=Integer.parseInt(teclado.readLine());
            
            switch(opcion1)
            {
                case 1:
                    if (x>=j)
                    {
                        System.out.println("ya no puede registrar mas clientes\n");
                    }
                    else
                    {
                        
                        clientes[x]=new Cliente();
                        clientes[x].Dar_Alta(j);
                        clientes[x].Mostrar_datos();
                        x++;
                        
                    }
                    break;
                case 2: 
                    break;

                case 3:  
                try {
                    for (int i = 0; i < clientes.length; i++) {
                        clientes[i].Mostrar_datos();
                        if (clientes[i].equals(null)) {
                            System.err.println("ya no hay mas datos");;
                        }
                    }
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }//fin del try-catch
            
                    
                case 4: 
                    break;
                
                case 5: 
                    break;

                case 6: 
                    break;
                
                default:
                 break;
            }//fin del switch principal
            
            
    	}while(opcion1!=7);
    }//fin del main
}//fin de la clase Cafeteria


