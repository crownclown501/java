class Node{
    public Node liga;
    public int value;
    public Node(int data)
    {
        value = data;
        liga=null;
    }
}

public class arreglo_a_listaenlazada 
{
    public int Array[]={2,5,1,9,3};
    private Node raiz;
    public arreglo_a_listaenlazada()
    {
        raiz=null;
    }

    public void setnode(int data) 
    {
        Node temp = new Node(data);
        if (raiz == null) {
            raiz = temp;
        } else {
            temp.liga=raiz;
            raiz = temp;
        }
    }

    public void readforward()
    {
        Node aux=raiz;
	    System.out.println("Lista Ligada Ordenada: ");
	    while(aux!=null)// 2 ,5 , 8 ,9, 10, 15, 20 , aux= null 
	    {
   			System.out.print(aux.value+" ");
   			aux=aux.liga;//aux+=1;   // null
		}
    }
    public static void main(String[] args) {
        arreglo_a_listaenlazada L = new arreglo_a_listaenlazada();
        for (int i = 0; i < L.Array.length; i++) {
            L.setnode(L.Array[i]);
        }
        L.readforward();
        System.out.println();
    }
}