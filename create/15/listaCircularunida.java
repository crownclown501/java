import java.io.IOException;

class NodoD {
    public int info;
    public NodoD next;
    public NodoD last;  
    public NodoD(int dato) {
        info = dato;
        next = null;
        last = null;
    }
}

public class listaCircularunida {
    private NodoD raiz;
    private NodoD fin;
    private NodoD raiz2;
    private NodoD fin2;
    public listaCircularunida() 
    {
        raiz=null;  
        fin=null; 
        raiz2= null;
        fin2=null;
    }
    public void InsertarOrdenlista1(int data) {
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

    public void InsertarOrdenlista2(int data) {
        NodoD temp2 = new NodoD(data);
        temp2.next=null;
        temp2.last=null; // 1 10 12 4
        if (raiz2 == null) {
            
            raiz2 = temp2;
            fin2 = temp2; 
        } else if (temp2.info <= raiz2.info) { // 0 <= 1
            NodoD aux1=raiz2;
            raiz2.last = temp2;
            fin2.next=temp2;
            raiz2 = temp2;
            raiz2.next=aux1;
            raiz2.last=fin2;
        } else if (temp2.info >= fin2.info) { // se guarda el dato mayor y conectamos fin. con raiz.last
            NodoD auxD=fin2; 
            fin2.next=temp2;  
            raiz2.last=temp2;     
            fin2=temp2; 
            fin2.next=raiz2;
            fin2.last=auxD;
        }else if (temp2.info>=raiz2.info) {
            NodoD anterior2D = null;
            NodoD posterior2D = raiz2;
            while (posterior2D.info<=temp2.info) {
                anterior2D=posterior2D;
                posterior2D=posterior2D.next;//4
            }
            anterior2D.next=temp2;
            temp2.last=anterior2D;
            posterior2D.last=temp2;
            temp2.next=posterior2D;
            } 
    }

    public void unir()
    {   
        while (raiz2!=fin2) {
            NodoD aux3=fin;
            fin.next=raiz2;
            raiz2.last=fin;
            fin=raiz2;
            fin.next=raiz;
            fin.last=aux3;
            raiz2=raiz2.next;
        }
        if (raiz2==fin2) {
            raiz.last = fin2;
            fin2.next=raiz;
        }  
        if (raiz!=null) 
        {
            NodoD aux = raiz;
            while (aux != raiz.last) 
            {
                System.out.print(aux.info + " ");
                aux = aux.next;
            }
            System.out.print(aux.info+" ");
        }
    }

    public void recorrer_hacia_adelante() throws IOException 
    { 
        System.out.println("Lista nextda Ordenada: ");
        if (raiz!=null) 
        {
            NodoD aux = raiz;
            while (aux != raiz.last) 
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

    public void recorrer_hacia_adelante2() throws IOException 
    { 
        System.out.println("Lista next Ordenada: ");
        if (raiz2!=null) 
        {
            NodoD aux1 = raiz2;
            while (aux1 != raiz2.last) 
            {
                System.out.print(aux1.info + " ");
                aux1 = aux1.next;
            }
            System.out.print(aux1.info+" ");
        }
    }

    public void recorrer_hacia_atras2() throws IOException 
    { 
        System.out.println("Lista next Ordenada: ");
        if (raiz2!=null) 
        {
            NodoD aux1 = raiz2;
            
            while (aux1.last != raiz2) //1!=
            {
                System.out.print(aux1.info + " ");
                aux1 = aux1.last;
            }
            
            System.out.print(aux1.info+" ");
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
        listaCircularunida dobleXD = new listaCircularunida();
        listaCircularunida dobleXD2 = new listaCircularunida();
        listaCircularunida unidas = new listaCircularunida();
        System.out.print("Datos:\n");
        dobleXD.InsertarOrdenlista1(1);
        dobleXD.InsertarOrdenlista1(20);
        dobleXD.InsertarOrdenlista1(20);
        dobleXD.InsertarOrdenlista1(1);
        dobleXD.InsertarOrdenlista1(1);
        dobleXD.InsertarOrdenlista1(89);
        System.out.println("lista 1:");
        System.out.println("Recorriendo de raiz hacia delante la lista 1:");
        dobleXD.recorrer_hacia_adelante();
        
        System.out.println("Recorriendo de raiz hacia atras");
        dobleXD.recorrer_hacia_atras();
        System.out.println("\n");
        System.out.println("lista 2:");
        dobleXD2.InsertarOrdenlista2(1);
        dobleXD2.InsertarOrdenlista2(20);
        dobleXD2.InsertarOrdenlista2(20);
        dobleXD2.InsertarOrdenlista2(1);
        dobleXD2.InsertarOrdenlista2(1);
        dobleXD2.InsertarOrdenlista2(89);
        System.out.println("Recorriendo de raiz hacia delante la lista 2:");
        dobleXD2.recorrer_hacia_adelante2();
        
        System.out.println("Recorriendo de raiz hacia atras");
        dobleXD2.recorrer_hacia_atras2();
        System.out.println("\n");

        System.out.print("\nlistas Unidas:\n");
        unidas.unir();
        System.out.println("\n");
        /*System.out.println("Recorriendo de raiz hacia delante");
        dobleXD.recorrer_hacia_adelante();
        System.out.println("\n");
        System.out.println("Recorriendo de raiz hacia atras");
        dobleXD.recorrer_hacia_atras();
        System.out.println();
        dobleXD.InsertarOrdenlista1(-3);
        System.out.println("Recorriendo de raiz hacia delante");
        dobleXD.recorrer_hacia_adelante();
        System.out.println("\n");
        System.out.println("Recorriendo de raiz hacia atras");
        dobleXD.recorrer_hacia_atras();
        System.out.println("\n");   */     
 
    }
}
