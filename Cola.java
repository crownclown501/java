
public class Cola {

    public int Array[];
    public int tam;
    public int last;
    public int first;

    public Cola(int t){
        tam=t;
        last=0;
        first=0;
        Array = new int[t];
    }
    public void insertar(){
        System.out.print("ingrese datos\n");
        for(int i=0;i<Array.length;i++)
        {
            int numeroAleatorio1 = (int)(Math.random()*25+1);
            Array[i]=numeroAleatorio1;
            last++;
        }
    }
    public int extraer(){
        return(Array[first++]);
    }
     public int vacia()
    {
      if(first==last){
          return 1;
      }
      else{
          return 0;
      }
    }
    public int llena()
    {
      if(last==tam){
          return 1;
      }
      else{
          return 0;
      }
    }
    public void mostrar()
    {
        for(int i=first; i<last; i++){
            System.out.print(Array[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Cola colita=new Cola(4);
        colita.insertar();
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