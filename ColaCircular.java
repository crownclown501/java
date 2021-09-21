public class ColaCircular 
{
    public int[] Array;
    public int tam;//tamaño
    public int first;//inicial
    public int last;//final o tope
    public int inserted; //ingresado
    public int last_operation; //ultima operacion
    public int helper;
    public ColaCircular(int t)
    {
        tam=t;
        Array = new int[t];
        first=0;
        last=0;
        inserted=0;
        last_operation=0;   
        helper=0;
    }
    public void insertar(int data) //data = dato insertado       
    {   //lasthelper=(first+inserted)%tam
        int check1=llena();
        if (check1==1) 
        {
            System.out.println("full");
        }else
        {      
            if(last==tam) 
            {
                last=0;
                inserted=tam-first;
            }
            Array[last]=data;
            last+=1;
            inserted+=1;
            
            last_operation=1;
        }
        
    }                        //posicion: 0 1 2 3 4 
    public int extraer()    //valores:  1 2 3 4 5 
    {   //(first+1)%tam
        int check2=vacia();
        //ingresar 
        helper=inserted;
        if (check2==1) 
        {
            System.out.println("full");
        } else 
        {
            if (first==tam) 
            {
            first=0;
            }
            last_operation=0;
            inserted=helper-1;
            System.out.print("\nvalue of inserted in extraer: "+inserted);
        }
        Array[first]=0;
        
        return first+=1;
    }
    public int vacia() 
    {
        if ((last == first) && (last_operation == 0))
        //0 is equivalent to empty 'cause when we have that last operation==0 we ar saying that the array is not full and 
        //that our array of 8 hasn't had 8 digits maybe has 7 or 6 or who knows how many digits it has but not 8
        { //1 2 3 4 5              12 2 3 4 5       0 0 0 0
            return 1;
        } else 
        {
            return 0;
        }
    }
    public int llena() 
    {
        if ((last == first) && (last_operation == 1))
        {
            return 1;
        } else 
        {
            return 0;
        }
    }
    public void mostrar() 
    {
        int y=vacia(),full=llena();
       
        /**this two variables are used to check the functions vacia and llena
         * 'cause we musn't change the prederminated type of both function,thw only
         * thing we could use was this one, but i prefer using booleans in this kind of things */ 
        if (first<last) 
        /**this one is simply used to print the original numbers */
        {
            for (int i = first; i < last; i++)
            /**i will start at zero until i it's equal to seven */
            { 
                System.out.println("Array["+i+"]: "+Array[i]);
            }
        }
        if (first>last || full==1) 
        /**this one is used when we have already erased the value on our started point
         * or when full it's comparable whith true,anyway we could say if it's true or not 
         * obviously if it's not anyone of this two things true then we go to the next if
         */
        {
            for (int i = first; i < Array.length; i++)
            /**i will start at the value where first is, until i it's equal to the lenght of my array */
            { 
                System.out.println("Array["+i+"]: "+Array[i]);
            }
                for (int i = 0; i < last; i++)
                /**i will start at zero until i it's equal to the value of last */
                { 
                    System.out.println("Array["+i+"]: "+Array[i]);
                } 
        }
        if (y==1) //we coul quit this one 'cause we make use of a similar one below this fuction
        //exactly in our main almost at the last lines
        {
            System.out.println("cola vacia\n");
        }
        System.out.print("\nvalue of inserted in insertar: "+inserted);
    }
    public static void main(String[] args) 
    {
        ColaCircular colita=new ColaCircular(8);
        colita.insertar(6);//1    0
        colita.insertar(3);//2     1
        colita.insertar(5);//3      2
        colita.insertar(1);//4       3
        colita.insertar(9);//5        4
        colita.insertar(17);//6        5
        colita.insertar(19);//7         6
        colita.insertar(-2);//8          7
        System.out.println("\ndatos");
        colita.mostrar();
        colita.extraer();//6
        colita.extraer();//3
        colita.extraer();//5
        colita.extraer();//1
        colita.extraer();//9
        System.out.println("\nDatos colita");
        colita.mostrar();
        System.out.println("\nnuevos datos");
        colita.insertar(12);
        colita.insertar(-1);
        colita.mostrar();
        int vacio=colita.vacia();
        int lleno=colita.llena();
        System.out.println("\nVacia = " + vacio);
        System.out.println("Llena  = " + lleno);
    }
}
