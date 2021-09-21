

public class listas_ligadas {
    
    class Nodo
    {
        public int info;
        public Nodo liga;
        public Nodo(int dato)
        {
            info=dato;
            liga=null;
        }
        public Nodo() {
        }	
    }
   
       private Nodo raiz;
        public void lista_enlazada()
        {
            raiz=null; 
        }
        
        public void insertar(int valor)
        {
            Nodo temp=new Nodo(valor);
            if (raiz==null) raiz=temp;
            else {
                temp.liga=raiz;
                raiz=temp;
            }
            
        }	
            
        public void recorrer()
        {
            Nodo aux=raiz;
            System.out.println("Datos de la Lista:");
            while(aux!=null)
            {
                System.out.print(aux.info+" ");
                aux=aux.liga; 
            }	
             System.out.println();	
        }	 	
            
        public int eliminar()
        {
           int data = raiz.info;
           raiz=raiz.liga;
           return data;
        }

        public static void main(String []args)
        {
            listas_ligadas L = new listas_ligadas();
            L.insertar(8);
            L.insertar(5);
            L.insertar(12);
            L.insertar(7);
            L.recorrer();
            L.eliminar();
            L.recorrer();
        }		
        
    
}
