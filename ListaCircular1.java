class NodoCd1 {
    public int info;    
    public NodoCd1 next;
    public NodoCd1 last;
                               
     public NodoCd1(int dato)    
     {
         info=dato;
         next=null;
                 last=null;
     }
}
public class ListaCircular1 {

    private NodoCd1 raiz;  

    public ListaCircular1() 
    {
    	raiz=null;  
    }
    public void InsertarOrden(int data) {
        NodoCd1 temp = new NodoCd1(data); // 0  10  5   2  11
        if (raiz == null) {
            temp.next = temp;
            temp.last = temp;
            raiz = temp;
        } else if (temp.info <= raiz.info) { // 0 <= 1
            NodoCd1 fin=raiz.last;
            temp.next = raiz; 
            temp.last=fin;
            raiz.last=temp;
            raiz = temp;
             
        } else if (temp.info >= raiz.info) { // 4>=12
          NodoCd1 fin=raiz.last;
          
            temp.next=raiz;
            temp.last = raiz.last;
            fin.next=temp;   // 12
            raiz.last=temp;
        } else {
            NodoCd1 anterior = null;
            NodoCd1 posterior = raiz;
            while (posterior.info <= temp.info) {
                anterior = posterior;
                posterior = posterior.next;
            }
            anterior.next = temp;
            temp.next = posterior;
        }
       
        
    }
    public void recorrer()
   {
	   System.out.println("Lista Ligada Ordenada: ");
	   if(raiz!=null){
                NodoCd1 aux=raiz.next;
               while(aux!=raiz) 
	   {
   			System.out.print(aux.info+" ");
   			aux=aux.next;
		}
		}
	}
    public static void main(String []args)
    {
    	ListaCircular1 L = new ListaCircular1();
    	System.out.println("datos antes de eliminar");
        L.InsertarOrden(0);
		L.InsertarOrden(10);
    	L.InsertarOrden(5);
    	L.InsertarOrden(2);
    	L.InsertarOrden(11);
    	L.InsertarOrden(20);
    	L.InsertarOrden(15);
    	L.InsertarOrden(9);
		L.InsertarOrden(18);
		L.InsertarOrden(35);
		L.InsertarOrden(29);
		L.InsertarOrden(7);
		L.InsertarOrden(75);
    	L.recorrer();
    }		
}