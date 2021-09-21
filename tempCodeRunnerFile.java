import java.io.IOException;

class NodoD {
    public int info;
    public NodoD next;
    public NodoD last; // [2]->[5] array[i]+=1 temp.next raiz.next

    public NodoD(int dato) {
        info = dato;
        next = null;
        last = null;
    }
}

public class ListaligadaCD {
    private NodoD raiz;
    private NodoD fin;
    public ListaligadaCD() 
    {
    	raiz=null;  
    	fin=null;	
    }
    public void InsertarOrden(int data) {
        NodoD temp = new NodoD(data);
        temp.next=null;
        temp.last=null; // 1 10 12 4
        if (raiz == null) {
            
            raiz = temp;
            fin = temp; 
        } else if (temp.info <= raiz.info) { // 0 <= 1
            NodoD aux2=raiz;
            raiz.last = temp;
            fin.next=temp;
            raiz = temp;
            raiz.next=aux2;
            raiz.last=fin;
        } else if (temp.info >= fin.info) { // se guarda el dato mayor y conectamos fin. con raiz.last
            NodoD auxD=fin; 
            fin.next=temp;  
            raiz.last=temp;     
            fin=temp; 
            fin.next=raiz;
            fin.last=auxD;
        }else if (temp.info>=raiz.info) {
            NodoD anterior1D = null;
            NodoD posterior1D = raiz;
            while (posterior1D.info<=temp.info) {
                anterior1D=posterior1D;
                posterior1D=posterior1D.next;//4
            }
            anterior1D.next=temp;
            temp.last=anterior1D;
            posterior1D.last=temp;
            temp.next=posterior1D;
            } 
    }

    public void recorrer_hacia_adelante() throws IOException 
    { 
        System.out.println("Lista nextda Ordenada: ");
        if (raiz!=null) 
        {
            NodoD aux = raiz;
            while (aux.info != raiz.last.info) 
            {
                System.out.print(aux.info + " ");
                aux = aux.next;
            }
            System.out.print(aux.info+" ");
        }
    }
    public void recorrer_hacia_atras() throws IOException 
    { 
        System.out.println("Lista nextda Ordenada: ");
        if (raiz!=null) 
        {
            NodoD aux = raiz;
            
            while (aux.last != raiz) //1!=
            {
                System.out.print(aux.info + " ");
                aux = aux.last;
            }
            
            System.out.print(aux.info+" ");
        }
    }
        public void Eliminar(int dato){
        
        if (raiz.info==dato && fin.info==dato) {
            raiz=fin=null;
            System.out.println("Lista vacia");
        }
        NodoD actual;
        NodoD anterior;
        actual = raiz;
        anterior = fin;
        do{
            if(actual.info==dato){//r   a
                if(actual==raiz){//{8}=={8}    
                    raiz = raiz.next;  //{null}->{8}
                    fin.next = raiz;   //<-{34}->{8}->
                    raiz.last = fin;    //<-{34}-><-{8}->
                }else if(actual==fin){  // {34}=={34}
                    fin=anterior.next;//fin=34  y anterior=34  then fin=34?
                    raiz.last=fin;//
                    fin.next=raiz;//
                }else{
                    anterior.next=actual.next;//fin.next=raiz.next
                    actual.next.last=anterior;
                }
            }
            anterior = actual;
            actual = actual.next;
        }while(actual!=raiz);
    }

    public static void main(String[] args) throws IOException {
        ListaligadaCD dobleXD = new ListaligadaCD();
        System.out.println("Datos:\n");
        dobleXD.InsertarOrden(1);
        dobleXD.InsertarOrden(20);
        dobleXD.InsertarOrden(20);
        dobleXD.InsertarOrden(1);
        dobleXD.InsertarOrden(1);
        dobleXD.InsertarOrden(89);
        System.out.println("Recorriendo de raiz hacia delante");
        dobleXD.recorrer_hacia_adelante();
        System.out.println("\n");
        System.out.println("Recorriendo de raiz hacia atras");
        dobleXD.recorrer_hacia_atras();
        System.out.println("\n");
        dobleXD.Eliminar(1);    
        System.out.println("Recorriendo de raiz hacia delante");
        dobleXD.recorrer_hacia_adelante();
        System.out.println("\n");
        System.out.println("Recorriendo de raiz hacia atras");
        dobleXD.recorrer_hacia_atras();
        System.out.println();
        dobleXD.InsertarOrden(-3);
        System.out.println("Recorriendo de raiz hacia delante");
        dobleXD.recorrer_hacia_adelante();
        System.out.println("\n");
        System.out.println("Recorriendo de raiz hacia atras");
        dobleXD.recorrer_hacia_atras();
        System.out.println("\n");        
 
    }
}