package segundoparcial;
import java.io.*;

public class Renta{
	int clave_computadora;
	Pelicula Peli;
	Cliente client;



    public Renta() {
    }

  public Renta( int clave_computadora,int d,int m,Pelicula apeli, Cliente acli)

  	{
  		this.clave_computadora=clave_computadora;
  		this.d=d;
  		this.m=m;
  		Peli=apeli;
  		client=acli;
    }

    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

    public int Verificar_cliente(int tam,Cliente cliente[])throws IOException{
    	System.out.println("Nombre del cliente:  ");
    	String nom=teclado.readLine();
    	int flag=0,i=0;

    	while(flag==0&&i<tam){
    	if((cliente[i].Nombre).equals(nom)){
    		flag=1;
    		client=cliente[i];
    		System.out.println ("clave"+ cliente[i].Clave);
    		System.out.println ("nombre"+ cliente[i].Nombre);
    		//this.nombre_cliente=nom;
    		//this.clave_cliente=cliente[i].Clave;
    	}
    		else
    			i++;
    	}


	return flag;
      //  return cli;
    }

    public int Verificar_pelicula(int tam,Pelicula pelicula[])throws IOException{
    	System.out.println("Nombre de la pelicula:  ");
    	String nom=teclado.readLine();int flag=0,i=0;

    	while(flag==0&&i<tam){
    	if((pelicula[i].nombre).equals(nom)){
    		flag=1;
    		Peli=pelicula[i];
    		//this.nombre_pelicula=nom;
    	}
    		else
    			i++;
    	}
    	return flag;
    }

    Renta Registrar_renta(int cli,int pel)throws IOException
    {//int i=0;

      if((cli==0)&&(pel==1))
    		System.out.println("El cliente no existe en el sistema");
    	if((cli==1)&&(pel==0))
    		System.out.println("La pelicula no esta disponible en la empresa");
    	if((cli==0)&&(pel==0))
    		System.out.println("La pelicula y el cliente no estan registrados en el sistema");

    	if((cli==1)&&(pel==1)){
    		System.out.println("Clave de renta\n: ");
    		clave_computadora=Integer.parseInt(teclado.readLine());
    		System.out.println("Fecha de prestamo\nDia: ");
    		d=Integer.parseInt(teclado.readLine());
    		System.out.println("Mes: ");
    		m=Integer.parseInt(teclado.readLine());

            num_renta++;
     	  	}
     	  	return new Renta (clave_computadora,d,m,Peli,client);
    }
    void Devolucion()throws IOException{
    	System.out.println("Cuantos dias tiene de atraso ? ");
    	int dia=Integer.parseInt(teclado.readLine());
    	if(dia==0)
    	 System.out.println("La devolucion se realizo sin recargos");
    	 else
    	 {
    	 	multa=dia*50;
    	 	System.out.println("Tiene un recargo de $"+multa);
    	 }
    }


    void MostrarDatos_Renta(Renta r[], int tamr){

    	for (int i=0;i<tamr;i++)
    	{

    	System.out.println("Clave:  "+r[i].clave_computadora);
    	System.out.println("Dia:  "+r[i].d);
    	System.out.println("Mes:  "+r[i].m);
    	System.out.println("Nombre de la Pelicula:"+r[i].Peli.nombre);
    	System.out.println("Clave del Cliente:  "+r[i].client.Clave);
    	System.out.println("Nombre del Cliente:"+r[i].client.Nombre);

    		 	}
    }

}

