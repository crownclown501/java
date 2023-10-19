package hospital2;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        int opcion,i,k,m,l,opcion1,opcion2,opcion3,opcion4,opcion5,opcion6;
        boolean bandera;
        int numeroDeMedico,a;
        bandera = false;
        Scanner leer = new Scanner(System.in);
        opcion=i=m=k=l=0;
        Empleado [] empleadosMedicos = new Empleado[100];
        Empleado [] empleadosEnfermeros = new Empleado[100];
        Empleado [] empleadosAdministrativos = new Empleado[100];
        Empleado [] empleadosIntendentes = new Empleado[100];
        while (opcion != 5) {
            System.out.println("Ingrese el numero de la opcion que desea realizar: ");
            System.out.println("1:Dar de alta al director");
            System.out.println("2:Dar de alta  trabajador");
            System.out.println("3:Modificar trabajador");
            System.out.println("4:Eliminar trabjador");
            System.out.println("5:Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:{
                    if(!bandera){
                        System.out.println("Ingreso a la opcion Dar de alta al director");
                        Director d1 = new Director(" ", 0, ' ', "", 0);
                        d1.leerDirector(d1);
                        d1.escritura();
                        System.out.println("\n");
                        bandera=true;
                    }else{
                        System.out.println("Solo se puede dar de alta una vez al director");
                    }
                    break;
                }
                case 2:{
                    if(bandera){
                        
                        System.out.println("Ingreso a la opcion Dar de alta  trabajador");
                        System.out.println("Ingrese el numero de la ocpion de empleado que desea dar de alta");
                        System.out.println("1:Medico(a)");
                        System.out.println("2:Enfermero(a)");
                        System.out.println("3:Administrativo(a)");
                        System.out.println("4:Intendente");
                        opcion1= leer.nextInt();
                        while(opcion1<1 || opcion1>4){
                            System.out.println("Ingreso a la opcion Dar de alta  trabajador");
                            System.out.println("Ingrese el numero de la ocpion de empleado que desea dar de alta");
                            System.out.println("1:Medico(a)");
                            System.out.println("2:Enfermero(a)");
                            System.out.println("3:Administrativo(a)");
                            System.out.println("4:Intendente");
                            opcion1= leer.nextInt();
                        }
                        switch(opcion1){
                            case 1:{
                                System.out.println("Ingreso a la opcion Medico(a)");
                                Medico m1= new Medico(" ",0,' ', " ",0, false,false,false,false,0);
                                m1.leerMedico(m1,i,empleadosMedicos);
                                empleadosMedicos[i]=(Empleado)m1;
                                i++;
                                m1.escritura();
                                m1.escrituta(m1);
                                System.out.println("\n");
                                break;
                            }
                            case 2:{
                                System.out.println("Ingreso a la opcion Enfermero(a)");
                                Enfermera e1= new Enfermera(" ",0,' ', " ",0, false,false,false,false,0);
                                e1.leerEnfermera(e1,k,empleadosEnfermeros);
                                empleadosEnfermeros[k]=(Empleado)e1;
                                k++;
                                e1.escritura();
                                e1.escrituta(e1);
                                System.out.println("\n");
                                break;
                            }
                            case 3:{
                                System.out.println("Ingreso a la opcion Intendente");
                                Intendente i1= new Intendente(" ",0,' ', " ",0, " ");
                                i1.leerIntendente(i1,l,empleadosIntendentes);
                                empleadosIntendentes[l]=(Empleado)i1;
                                l++;
                                i1.escritura();
                                i1.escritura(i1);
                                System.out.println("\n");
                                break;
                            }
                            case 4:{
                                System.out.println("Ingreso a la opcion Administrativo(a)");
                                Administrativo a1= new Administrativo(" ",0,' ', " ",0, false,false,0);
                                a1.leerAdministrativo(a1,m,empleadosAdministrativos);
                                empleadosAdministrativos[m]=(Empleado)a1;
                                m++;
                                a1.escritura();
                                a1.escritura(a1);
                                System.out.println("\n");
                                break;
                            }
                            default:{
                                System.out.println("El numero de opcion ingresado no es valido");
                                break;
                            }
                        } 
                    }else{
                        System.out.println("Primero debe dar de alta a un director para poder realizar cualquier otra operacion");
                    }
                    break;
                }
                case 3:{
                    
                    if (bandera)
                    {
                        System.out.println("Ingreso a la opcion Modificar trabajador");
                        System.out.println("Ingrese el numero de la opcion del empleado que desea modificar");
                        System.out.println("1:Intendente");
                        System.out.println("2:Medico(a)");
                        System.out.println("3:Enfermero(a)");
                        System.out.println("4:Administrativo(a)");
                        opcion2=leer.nextInt();
                        while(opcion2<1 || opcion2>4){
                            System.out.println("Ingreso a la opcion Modificar trabajador");
                            System.out.println("Ingrese el numero de la ocpion de empleado que desea dar de alta");
                            System.out.println("1:Intendente");
                            System.out.println("2:Medico(a)");
                            System.out.println("3:Enfermero(a)");
                            System.out.println("4:Administrativo(a)");
                            opcion2= leer.nextInt();
                        }
                    
                    switch(opcion2){
                        case 1:
                            
                        System.out.println("Ingreso a la opcion Intendente(a)");
                        System.out.println("Ingrese el numero del campo que desea modificar");
                        System.out.println("1:Nombre");
                        System.out.println("2:Edad");
                        System.out.println("3:Genero");
                        System.out.println("4:Direccion");
                        System.out.println("5:Salario");
                        System.out.println("6:Departamento");
                        opcion3= leer.nextInt();
                        switch(opcion3){
                            case 1:{
                                int numeroDeIntendente;
                                System.out.println("Ingreso a la opcion Nombre:");
                                System.out.println("Ingrese el numero del Intendente(a) que desea modificar");
                                numeroDeIntendente=leer.nextInt();
                                for(a=0;a<l;a++){
                                    Intendente i2=(Intendente) empleadosIntendentes[a];
                                    if(numeroDeIntendente==i2.numeroDeIntendente){
                                        String nuevoNombreIntendente;
                                        System.out.println("Ingrese el nuevo nombre del Intendente(a)");
                                        nuevoNombreIntendente=leer.nextLine();
                                        ((Intendente) empleadosIntendentes[a]).nombre=nuevoNombreIntendente;
                                        a=l;
                                    }
                                }
                                break;
                            }
                            case 2:{
                                int numeroDeIntendente;
                                System.out.println("Ingreso a la opcion Edad:");
                                System.out.println("Ingrese el numero del Intendente(a) que desea modificar");
                                numeroDeIntendente=leer.nextInt();
                                for(a=0;a<l;a++){
                                    Intendente i2=(Intendente) empleadosIntendentes[a];
                                    if(numeroDeIntendente==i2.numeroDeIntendente){
                                        int edad;
                                        System.out.println("Ingrese la nueva edad del Intendente(a)");
                                        edad=leer.nextInt();
                                        ((Intendente) empleadosIntendentes[a]).edad=edad;
                                        a=l;
                                    }
                                }
                                break;
                            }
                            case 3:{
                                int numeroDeIntendente;
                                System.out.println("Ingreso a la opcion Genero:");
                                System.out.println("Ingrese el numero del Intendente(a)  que desea modificar");
                                numeroDeIntendente=leer.nextInt();
                                for(a=0;a<k;a++){
                                    Intendente i2=(Intendente) empleadosIntendentes[a];
                                    if(numeroDeIntendente==i2.numeroDeIntendente){
                                        char genero;
                                        System.out.println("Ingrese el nuevo genero del intendente(a)");
                                        genero=leer.next().charAt(0);
                                        ((Intendente) empleadosIntendentes[a]).genero=genero;
                                        a=l;
                                    }
                                }
                                break;
                            }
                            case 4:{
                                int numeroDeIntendente;
                                System.out.println("Ingreso a la opcion Direccion:");
                                System.out.println("Ingrese el numero del Intendente(a) que desea modificar");
                                numeroDeIntendente=leer.nextInt();
                                for(a=0;a<l;a++){
                                    Intendente i2=(Intendente) empleadosIntendentes[a];
                                    if(numeroDeIntendente==i2.numeroDeIntendente){
                                        String direccion;
                                        System.out.println("Ingrese la nueva direccion del Intendente(a)");
                                        direccion=leer.nextLine();
                                        ((Intendente) empleadosIntendentes[a]).direccion=direccion;
                                        a=l;
                                    }
                                }
                                break;
                            }
                            case 5:{
                                int numeroDeIntendente;
                                System.out.println("Ingreso a la opcion Salario:");
                                System.out.println("Ingrese el numero del Intendente(a) que desea modificar");
                                numeroDeIntendente=leer.nextInt();
                                for(a=0;a<l;a++){
                                    Intendente i2=(Intendente) empleadosIntendentes[a];
                                    if(numeroDeIntendente==i2.numeroDeIntendente){
                                        float salario;
                                        System.out.println("Ingrese el nuevo salario del Intendente(a)");
                                        salario=leer.nextFloat();
                                        ((Intendente) empleadosIntendentes[a]).salario=salario;
                                        a=l;
                                    }
                                }
                                break;
                            }case 6:{
                                int numeroDeIntendente;
                                System.out.println("Ingreso a la opcion Departamento:");
                                System.out.println("Ingrese el numero del Intendente(a) que desea modificar");
                                numeroDeIntendente=leer.nextInt();
                                for(a=0;a<l;a++){
                                    Intendente i2=(Intendente) empleadosIntendentes[a];
                                    if(numeroDeIntendente==i2.numeroDeIntendente){
                                        
                                        System.out.println("Ingrese el numero del departamento al cual desea cabiar el Medico(a)");
                                        System.out.println("1:Oftalmologia");
                                        System.out.println("2:Ginecologia");
                                        System.out.println("3:Pediatria");
                                        System.out.println("4:Medicina general");
                                        opcion4=leer.nextInt();
                                        while(opcion4<1 || opcion4>4){
                                            System.out.println("Ingrese el numero del departamento al cual desea cabiar el Medico(a)");
                                            System.out.println("1:Oftalmologia");
                                            System.out.println("2:Ginecologia");
                                            System.out.println("3:Pediatria");
                                            System.out.println("4:Medicina general");
                                            opcion4=leer.nextInt();
                                        }
                                        switch(opcion4){
                                            case 1:{
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=true;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=false;
                                                break;
                                            }
                                            case 2:{
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=true;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=false;
                                                break;
                                            }
                                            case 3:{
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=true;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=false;
                                                break;
                                            }
                                            case 4:{
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=false;
                                                ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=true;
                                                break;
                                            }
                                            default:{
                                                System.out.println("La opcion ingresada no es valida");
                                                break;
                                            }
                                        }
                                        a=l;
                                    }
                                }
                                break;
                            }
                            default:{
                                System.out.println("La opcion ingresada no esvalida");
                            }
                        }
                        case 2:{
                            
                            
                                System.out.println("Ingreso a la opcion Medico(a)");
                                System.out.println("Ingrese el numero del campo que desea modificar");
                                System.out.println("1:Nombre");
                                System.out.println("2:Edad");
                                System.out.println("3:Genero");
                                System.out.println("4:Direccion");
                                System.out.println("5:Salario");
                                System.out.println("6:Departamento");
                                opcion3= leer.nextInt();
                                while (opcion3<1 || opcion3>4)
                                {
                                    System.out.println("Ingreso a la opcion Medico(a)");
                                    System.out.println("Ingrese el numero del campo que desea modificar");
                                    System.out.println("1:Nombre");
                                    System.out.println("2:Edad");
                                    System.out.println("3:Genero");
                                    System.out.println("4:Direccion");
                                    System.out.println("5:Salario");
                                    System.out.println("6:Departamento");
                                }
                            
                            
                            switch(opcion3){
                                case 1:
                                    
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Medico(a) del medico que desea modificar");
                                    numeroDeMedico=leer.nextInt();
                                    for(a=0;a<i;a++){
                                        Medico m2=(Medico) empleadosMedicos[a];
                                        if(numeroDeMedico==m2.numeroDeMedico){
                                            String nuevoNombreMedico;
                                            System.out.println("Ingrese el nuevo nombre del Medico(a)");
                                            nuevoNombreMedico=leer.nextLine();
                                            ((Medico) empleadosMedicos[a]).nombre=nuevoNombreMedico;
                                            a=i;
                                        }
                                    }
                                    break;
                                case 2:
                                    
                                    System.out.println("Ingreso a la opcion Edad:");
                                    System.out.println("Ingrese el numero de Medico(a) del medico que desea modificar");
                                    numeroDeMedico=leer.nextInt();
                                    for(a=0;a<i;a++){
                                        Medico m2=(Medico) empleadosMedicos[a];
                                        if(numeroDeMedico==m2.numeroDeMedico){
                                            int edad;
                                            System.out.println("Ingrese la nueva edad del Medico(a)");
                                            edad=leer.nextInt();
                                            ((Medico) empleadosMedicos[a]).edad=edad;
                                            a=i;
                                        }
                                    }
                                    break;
                                
                                case 3:{
                                    
                                    System.out.println("Ingreso a la opcion Genero:");
                                    System.out.println("Ingrese el numero de Medico(a) del medico que desea modificar");
                                    numeroDeMedico=leer.nextInt();
                                    for(a=0;a<i;a++){
                                        Medico m2=(Medico) empleadosMedicos[a];
                                        if(numeroDeMedico==m2.numeroDeMedico){
                                            char genero;
                                            System.out.println("Ingrese el nuevo genero del Medico(a)");
                                            genero=leer.next().charAt(0);
                                            ((Medico) empleadosMedicos[a]).genero=genero;
                                            a=i;
                                        }
                                    }
                                    break;
                                }
                                case 4:{
                                    
                                    System.out.println("Ingreso a la opcion Direccion:");
                                    System.out.println("Ingrese el numero de Medico(a) del medico que desea modificar");
                                    numeroDeMedico=leer.nextInt();
                                    for(a=0;a<i;a++){
                                        Medico m2=(Medico) empleadosMedicos[a];
                                        if(numeroDeMedico==m2.numeroDeMedico){
                                            String direccion;
                                            System.out.println("Ingrese la nueva direccion del Medico(a)");
                                            direccion=leer.nextLine();
                                            ((Medico) empleadosMedicos[a]).direccion=direccion;
                                            a=i;
                                        }
                                    }
                                    break;
                                }
                                case 5:{
                                    
                                    System.out.println("Ingreso a la opcion Salario:");
                                    System.out.println("Ingrese el numero de Medico(a) del medico que desea modificar");
                                    numeroDeMedico=leer.nextInt();
                                    for(a=0;a<i;a++){
                                        Medico m2=(Medico) empleadosMedicos[a];
                                        if(numeroDeMedico==m2.numeroDeMedico){
                                            float salario;
                                            System.out.println("Ingrese el nuevo salario del Medico(a)");
                                            salario=leer.nextFloat();
                                            ((Medico) empleadosMedicos[a]).salario=salario;
                                            a=i;
                                        }
                                    }
                                    break;
                                }case 6:{
                                    
                                    System.out.println("Ingreso a la opcion Departamento:");
                                    System.out.println("Ingrese el numero de Medico(a) del medico que desea modificar");
                                    numeroDeMedico=leer.nextInt();
                                    for(a=0;a<i;a++){
                                        Medico m2=(Medico) empleadosMedicos[a];
                                        if(numeroDeMedico==m2.numeroDeMedico){
                                            

                                            System.out.println("Ingrese el numero del departamento al cual desea cabiar el Medico(a)");
                                            System.out.println("1:Oftalmologia");
                                            System.out.println("2:Ginecologia");
                                            System.out.println("3:Pediatria");
                                            System.out.println("4:Medicina general");
                                            opcion4=leer.nextInt();
                                            while(opcion4<1 || opcion4>4){
                                                System.out.println("Ingrese el numero del departamento al cual desea cabiar el Medico(a)");
                                                System.out.println("1:Oftalmologia");
                                                System.out.println("2:Ginecologia");
                                                System.out.println("3:Pediatria");
                                                System.out.println("4:Medicina general");
                                                opcion4=leer.nextInt();
                                            }
                                            switch(opcion4){
                                                case 1:{
                                                    ((Medico) empleadosMedicos[a]).departamentoGinecologia=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoOftalmologia=true;
                                                    ((Medico) empleadosMedicos[a]).departamentoPediatria=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoMedicinaGeneral=false;
                                                    break;
                                                }
                                                case 2:{
                                                    ((Medico) empleadosMedicos[a]).departamentoGinecologia=true;
                                                    ((Medico) empleadosMedicos[a]).departamentoOftalmologia=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoPediatria=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoMedicinaGeneral=false;
                                                    break;
                                                }
                                                case 3:{
                                                    ((Medico) empleadosMedicos[a]).departamentoGinecologia=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoOftalmologia=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoPediatria=true;
                                                    ((Medico) empleadosMedicos[a]).departamentoMedicinaGeneral=false;
                                                    break;
                                                }
                                                case 4:{
                                                    ((Medico) empleadosMedicos[a]).departamentoGinecologia=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoOftalmologia=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoPediatria=false;
                                                    ((Medico) empleadosMedicos[a]).departamentoMedicinaGeneral=true;
                                                    break;
                                                }
                                                default:{
                                                    System.out.println("La opcion ingresada no es valida");
                                                    break;
                                                }
                                            }
                                            a=i;
                                        }
                                    }
                                    break;
                                }
                                default:{
                                    System.out.println("La opcion ingresada no esvalida");
                                    break;
                                }
                            }
                            break;
                        }
                        case 3:{
                            
                            System.out.println("Ingreso a la opcion Enfermero(a)");
                            System.out.println("Ingrese el numero del campo que desea modificar");
                            System.out.println("1:Nombre");
                            System.out.println("2:Edad");
                            System.out.println("3:Genero");
                            System.out.println("4:Direccion");
                            System.out.println("5:Salario");
                            System.out.println("6:Departamento");
                            opcion3= leer.nextInt();
                            switch(opcion3){
                                case 1:{
                                    int numeroDeEnfermera;
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Enfermero(a) del enfermero(a) que desea modificar");
                                    numeroDeEnfermera=leer.nextInt();
                                    for(a=0;a<k;a++){
                                        Enfermera e2=(Enfermera) empleadosEnfermeros[a];
                                        if(numeroDeEnfermera==e2.numeroDeEnfermera){
                                            String nuevoNombreEnfermera;
                                            System.out.println("Ingrese el nuevo nombre del Enfermero(a)");
                                            nuevoNombreEnfermera=leer.nextLine();
                                            ((Enfermera) empleadosEnfermeros[a]).nombre=nuevoNombreEnfermera;
                                            a=k;
                                        }
                                    }
                                    break;
                                }
                                case 2:{
                                    int numeroDeEnfermera;
                                    System.out.println("Ingreso a la opcion Edad:");
                                    System.out.println("Ingrese el numero de Enfermero(a) del enfermero(a) que desea modificar");
                                    numeroDeEnfermera=leer.nextInt();
                                    for(a=0;a<k;a++){
                                        Enfermera e2=(Enfermera) empleadosEnfermeros[a];
                                        if(numeroDeEnfermera==e2.numeroDeEnfermera){
                                            int edad;
                                            System.out.println("Ingrese la nueva edad del Enfermero(a)");
                                            edad=leer.nextInt();
                                            ((Enfermera) empleadosEnfermeros[a]).edad=edad;
                                            a=k;
                                        }
                                    }
                                    break;
                                }
                                case 3:{
                                    int numeroDeEnfermera;
                                    System.out.println("Ingreso a la opcion Genero:");
                                    System.out.println("Ingrese el numero de Enfermero(a) del enfermero(a) que desea modificar");
                                    numeroDeEnfermera=leer.nextInt();
                                    for(a=0;a<k;a++){
                                        Enfermera e2=(Enfermera) empleadosEnfermeros[a];
                                        if(numeroDeEnfermera==e2.numeroDeEnfermera){
                                            char genero;
                                            System.out.println("Ingrese el nuevo genero del Medico(a)");
                                            genero=leer.next().charAt(0);
                                            ((Enfermera) empleadosEnfermeros[a]).genero=genero;
                                            a=k;
                                        }
                                    }
                                    break;
                                }
                                case 4:{
                                    int numeroDeEnfermera;
                                    System.out.println("Ingreso a la opcion Direccion:");
                                    System.out.println("Ingrese el numero de Enfermero(a) del enfermero(a) que desea modificar");
                                    numeroDeEnfermera=leer.nextInt();
                                    for(a=0;a<k;a++){
                                        Enfermera e2=(Enfermera) empleadosEnfermeros[a];
                                        if(numeroDeEnfermera==e2.numeroDeEnfermera){
                                            String direccion;
                                            System.out.println("Ingrese la nueva direccion del Enfermero(a)");
                                            direccion=leer.nextLine();
                                            ((Enfermera) empleadosEnfermeros[a]).direccion=direccion;
                                            a=k;
                                        }
                                    }
                                    break;
                                }
                                case 5:{
                                    int numeroDeEnfermera;
                                    System.out.println("Ingreso a la opcion Salario:");
                                    System.out.println("Ingrese el numero de Enfermero(a) del enfermero(a) que desea modificar");
                                    numeroDeEnfermera=leer.nextInt();
                                    for(a=0;a<k;a++){
                                        Enfermera e2=(Enfermera) empleadosEnfermeros[a];
                                        if(numeroDeEnfermera==e2.numeroDeEnfermera){
                                            float salario;
                                            System.out.println("Ingrese el nuevo salario del Medico(a)");
                                            salario=leer.nextFloat();
                                            ((Enfermera) empleadosEnfermeros[a]).salario=salario;
                                            a=k;
                                        }
                                    }
                                    break;
                                }case 6:{
                                    int numeroDeEnfermera;
                                    System.out.println("Ingreso a la opcion Departamento:");
                                    System.out.println("Ingrese el numero de Enfermero(a) del enfermero(a) que desea modificar");
                                    numeroDeEnfermera=leer.nextInt();
                                    for(a=0;a<k;a++){
                                        Enfermera e2=(Enfermera) empleadosEnfermeros[a];
                                        if(numeroDeEnfermera==e2.numeroDeEnfermera){
                                            
                                            System.out.println("Ingrese el numero del departamento al cual desea cabiar el Medico(a)");
                                            System.out.println("1:Oftalmologia");
                                            System.out.println("2:Ginecologia");
                                            System.out.println("3:Pediatria");
                                            System.out.println("4:Medicina general");
                                            opcion4=leer.nextInt();
                                            while(opcion4<1 || opcion4>4){
                                                System.out.println("Ingrese el numero del departamento al cual desea cabiar el Medico(a)");
                                                System.out.println("1:Oftalmologia");
                                                System.out.println("2:Ginecologia");
                                                System.out.println("3:Pediatria");
                                                System.out.println("4:Medicina general");
                                                opcion4=leer.nextInt();
                                            }
                                            switch(opcion4){
                                                case 1:{
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=true;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=false;
                                                    break;
                                                }
                                                case 2:{
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=true;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=false;
                                                    break;
                                                }
                                                case 3:{
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=true;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=false;
                                                    break;
                                                }
                                                case 4:{
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoGinecologia=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoOftalmologia=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoPediatria=false;
                                                    ((Enfermera) empleadosEnfermeros[a]).departamentoMedicinaGeneral=true;
                                                    break;
                                                }
                                                default:{
                                                    System.out.println("La opcion ingresada no es valida");
                                                    break;
                                                }
                                            }
                                            a=k;
                                        }
                                    }
                                    break;
                                }
                                default:{
                                    System.out.println("La opcion ingresada no esvalida");
                                }
                            }
                            break;
                        }
                        case 4:{
                            
                            System.out.println("Ingreso a la opcion Administrativo(a)");
                            System.out.println("Ingrese el numero del campo que desea modificar");
                            System.out.println("1:Nombre");
                            System.out.println("2:Edad");
                            System.out.println("3:Genero");
                            System.out.println("4:Direccion");
                            System.out.println("5:Salario");
                            System.out.println("6:Departamento");
                            opcion3= leer.nextInt();
                            switch(opcion3){
                                case 1:{
                                    int numeroDeAdministrativo;
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Administrativo(a) del administrativo(a) que desea modificar");
                                    numeroDeAdministrativo=leer.nextInt();
                                    for(a=0;a<m;a++){
                                        Administrativo a2=(Administrativo) empleadosAdministrativos[a];
                                        if(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                                            String nuevoNombreAdministrativo;
                                            System.out.println("Ingrese el nuevo nombre del Administrativo(a)");
                                            nuevoNombreAdministrativo=leer.nextLine();
                                            ((Enfermera) empleadosEnfermeros[a]).nombre=nuevoNombreAdministrativo;
                                            a=m;
                                        }
                                    }
                                    break;
                                }
                                case 2:{
                                    int numeroDeAdministrativo;
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Administrativo(a) del administrativo(a) que desea modificar");
                                    numeroDeAdministrativo=leer.nextInt();
                                    for(a=0;a<m;a++){
                                        Administrativo a2=(Administrativo) empleadosAdministrativos[a];
                                        if(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                                            int edad;
                                            System.out.println("Ingrese la nueva edad del Administrativo(a)");
                                            edad=leer.nextInt();
                                            ((Administrativo) empleadosAdministrativos[a]).edad=edad;
                                            a=m;
                                        }
                                    }
                                    break;
                                }
                                case 3:{
                                    int numeroDeAdministrativo;
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Administrativo(a) del administrativo(a) que desea modificar");
                                    numeroDeAdministrativo=leer.nextInt();
                                    for(a=0;a<m;a++){
                                        Administrativo a2=(Administrativo) empleadosAdministrativos[a];
                                        if(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                                            char genero;
                                            System.out.println("Ingrese el nuevo genero del Administrativo(a)");
                                            genero=leer.next().charAt(0);
                                            ((Administrativo) empleadosAdministrativos[a]).genero=genero;
                                            a=m;
                                        }
                                    }
                                    break;
                                }
                                case 4:{
                                    int numeroDeAdministrativo;
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Administrativo(a) del administrativo(a) que desea modificar");
                                    numeroDeAdministrativo=leer.nextInt();
                                    for(a=0;a<m;a++){
                                        Administrativo a2=(Administrativo) empleadosAdministrativos[a];
                                        if(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                                            String direccion;
                                            System.out.println("Ingrese la nueva direccion del Medico(a)");
                                            direccion=leer.nextLine();
                                            ((Administrativo) empleadosAdministrativos[a]).direccion=direccion;
                                            a=m;
                                        }
                                    }
                                    break;
                                }
                                case 5:{
                                    int numeroDeAdministrativo;
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Administrativo(a) del administrativo(a) que desea modificar");
                                    numeroDeAdministrativo=leer.nextInt();
                                    for(a=0;a<m;a++){
                                        Administrativo a2=(Administrativo) empleadosAdministrativos[a];
                                        if(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                                            float salario;
                                            System.out.println("Ingrese el nuevo salario del Medico(a)");
                                            salario=leer.nextFloat();
                                            ((Administrativo) empleadosAdministrativos[a]).salario=salario;
                                            a=m;
                                        }
                                    }
                                    break;
                                }case 6:{
                                    int numeroDeAdministrativo;
                                    System.out.println("Ingreso a la opcion Nombre:");
                                    System.out.println("Ingrese el numero de Administrativo(a) del administrativo(a) que desea modificar");
                                    numeroDeAdministrativo=leer.nextInt();
                                    for(a=0;a<m;a++){
                                        Administrativo a2=(Administrativo) empleadosAdministrativos[a];
                                        if(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                                            
                                            System.out.println("Ingrese el tipo de contrato al cual desea cabiar el Administrativo(a)");
                                            System.out.println("1:Sindicalizado");
                                            System.out.println("2:De confianza");
                                            opcion4=leer.nextInt();
                                            while(opcion4<1 || opcion4>2){
                                                System.out.println("Ingrese el tipo de contrato al cual desea cabiar el Administrativo(a)");
                                                System.out.println("1:Sindicalizado");
                                                System.out.println("2:Personal de confianza");
                                                opcion4=leer.nextInt();
                                            }
                                            switch(opcion4){
                                                case 1:{
                                                    ((Administrativo) empleadosAdministrativos[a]).sindicalizado=true;
                                                    ((Administrativo) empleadosAdministrativos[a]).personalDeConfianza=false;
                                                    break;
                                                }
                                                case 2:{
                                                    ((Administrativo) empleadosAdministrativos[a]).sindicalizado=false;
                                                    ((Administrativo) empleadosAdministrativos[a]).personalDeConfianza=true;
                                                    break;
                                                }
                                                default:{
                                                    System.out.println("La opcion ingresada no es valida");
                                                    break;
                                                }
                                            }
                                            a=m;
                                        }
                                    }
                                    break;
                                }
                                default:{
                                    System.out.println("La opcion ingresada no esvalida");
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("La opcion ingresada no esvalida");
                            break;
                        }
                    }
                    }
                
                 
                        break;}
                    
                case 5:
                    
                    if (bandera)
                    {
                        System.out.println("Ingreso a la opcion Eliminar trabjador");
                        System.out.println("Ingreso a la opcion Modificar trabajador");
                        System.out.println("Ingrese el numero de la opcion del empleado que desea modificar");
                        System.out.println("1:Intendente");
                        System.out.println("2:Medico(a)");
                        System.out.println("3:Enfermero(a)");
                        System.out.println("4:Administrativo(a)");
                        opcion5=leer.nextInt();
                        while(opcion5<1 || opcion5>4){
                            System.out.println("Ingreso a la opcion Eliminar trabjador");
                            System.out.println("Ingrese el numero de la ocpion de empleado que desea dar de alta");
                            System.out.println("1:Intendente");
                            System.out.println("2:Medico(a)");
                            System.out.println("3:Enfermero(a)");
                            System.out.println("4:Administrativo(a)");
                            opcion5= leer.nextInt();
                        }
                        switch (opcion5) {
                            case 1:
                                int numeroDeIntendente;
                                    System.out.println("Ingreso a la opcion borra intendente:");
                                    System.out.println("Ingrese el numero de Intendente(a) del intendente(a) que desea modificar");
                                    numeroDeIntendente=leer.nextInt();
                                    for(a=0;a<l;a++){
                                        Intendente i2=(Intendente) empleadosIntendentes[a];
                                        if(numeroDeIntendente==i2.numeroDeIntendente){
                                           i2.nombre=" ";
                                           i2.edad=0;
                                           i2.genero=' ';

                                        }
                                    }
                                break;

                            case 2:
                                    System.out.println("Ingreso a la opcion borra intendente:");
                                    System.out.println("Ingrese el numero de Intendente(a) del intendente(a) que desea modificar");
                                    numeroDeMedico=leer.nextInt();
                                    for(a=0;a<i;a++){
                                        Medico m2=(Medico) empleadosMedicos[a];
                                        if(numeroDeMedico==m2.numeroDeMedico){
                                           m2.nombre=" ";
                                           m2.edad=0;
                                           m2.genero=' ';

                                        }
                                    }   
                                break;
                            
                            case 3:
                            int numeroDeEnfermera;
                                System.out.println("Ingreso a la opcion borra intendente:");
                                System.out.println("Ingrese el numero de Intendente(a) del intendente(a) que desea modificar");
                                numeroDeEnfermera=leer.nextInt();
                                for(a=0;a<k;a++){
                                    Enfermera e2=(Enfermera) empleadosEnfermeros[a];
                                    if(numeroDeEnfermera==e2.numeroDeEnfermera){
                                        e2.nombre=" ";
                                        e2.edad=0;
                                        e2.genero=' ';
                                        
                                    }
                                }   
                            break;
                            case 4:
                            int numeroDeAdministrativo;
                                System.out.println("Ingreso a la opcion borra intendente:");
                                System.out.println("Ingrese el numero de Intendente(a) del intendente(a) que desea modificar");
                                numeroDeAdministrativo=leer.nextInt();
                                for(a=0;a<m;a++){
                                    Administrativo a2=(Administrativo) empleadosAdministrativos[a];
                                    if(numeroDeAdministrativo==a2.numeroDeAdministrativo){
                                        a2.nombre=" ";
                                        a2.edad=0;
                                        a2.genero=' ';
                                        
                                    }
                                }   
                            break;

                            default:
                                break;
                        }
                        
                                    
                                    
                    }break;
                
                case 6:
                    System.out.println("Ingreso a la opcion Salir");
                    System.out.println("Hasta luego");
                    break;
                
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
                    
            }
        }leer.close();
    }
}
