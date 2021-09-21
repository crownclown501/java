//insertar,extraer,llena,vacia

public class Cola_Circular {
    public int[] Array;
    public int tam;
    public int last;
    public int first;
    public int last_operation;
  
    public Cola_Circular(int t)
    {
        tam=t;
        Array = new int[t];
        first=0;
        last=first;
        last_operation=0;
    }
    public void insertar(int data)
    {
        
        if((last==tam-1)&&(first!=0))
        {
            Array[last]=data;
        }

    }                        //posicion: 0 1 2 3 4 5
    public int extraer()    //valores:   1 2 3 4 5 6
    {
        if (first==-1) {
            System.out.println("vacia");
        }
        if(first==last)
        {
            first=-1;//decremento
            last=-1;//decremento{
           
        }
        if (first==tam) {
            first=0;
        }
        else
            first++;
            return 1;
    }
    public int vacia()  //aqui hay un error
    {
        if((first==-1)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public int llena() //aqui hay un error
    {
        if(first==last)
        {
        return 1;
        }
      else{
          return 0;
      }
    }
    public void mostrar()
    {
        int i;
        if(first<last)
        {
            for(i=first;i<last;i++)
            {
                System.out.println( Array[i]+" ");
            }
            if(first>last)
            {
            for(i=last;i<Array.length;i++)
                System.out.print(Array[i]+" ");
            for(i=0;i<last;i++)
                System.out.print(Array[i]+" ");
            }
        }
        
       
    }
    public static void main(String[] args) {
        Cola_Circular colita=new Cola_Circular(5);
        colita.insertar(4);
        colita.insertar(3);
        System.out.println("\ndatos");
        colita.mostrar();
        colita.extraer();
        System.out.println("\nDatos colita");
        colita.mostrar();
        int vacio=colita.vacia();
        int lleno=colita.llena();
        System.out.println("\nVacia = " + vacio);
        System.out.println("Llena  = " + lleno);
    }
}
