class Nodo{

    public int info1;
    public int info2;
    public int info3;
    public Nodo liga;
    
    public Nodo(int sig, int ant, int cos) {
        info1 = sig;
        info2 = ant;
        info3 = cos;
        liga = null;
    }
}
    
public class listaord {
    
    private Nodo primero;
    private Nodo ultimo;

    public listaord() {
        primero = null;
        ultimo = null;
    }

    public void insertar(int siguiente, int anterior, int costo) {
        Nodo temp = new Nodo(siguiente, anterior, costo);
        if (primero == null) {
            primero = temp;
            ultimo = temp;
        } else if (temp.info3 <= primero.info3) {
            temp.liga = primero;
            primero = temp;
        } else if (temp.info3 >= ultimo.info3) {
            ultimo.liga = temp;
            ultimo = temp;
        } else {
            Nodo ant = null;
            Nodo pos = primero;
            while (pos.info3 <= temp.info3) {
                ant = pos;
                pos = pos.liga;
            }
            ant.liga = temp;
            temp.liga = pos;
        }
    }

    public int eliminar(int valor) {
        Nodo ant = null;
        Nodo pos = primero;

        if (primero.info1 == valor) {
                primero = primero.liga;
            return(2);
        }
        while (pos.info1 != valor ) {
            ant = pos;
            pos = pos.liga;
            if (pos == null) {
                return(3);
            }
        }
        ant.liga = pos.liga;
        return(1);
    }

    public void recorrer() {
        Nodo aux = primero;
        System.out.println("Lista ligada ordenada: ");
        while (aux != null) {
            System.out.print("|"+aux.info3+ "-"+aux.info2+aux.info1+ "| ->");
            aux = aux.liga;
        }
        System.out.println();
    }
    
    public int regresa1(){
        int z = primero.info1;
        return(z);  
    }
    
    public int regresa2(){
        int z = primero.info2;
        return(z);  
    }
    
    public int regresaprimordial(){
        int z = primero.info3;
        return(z);
    }
    
    public void quitar(){
        primero = primero.liga;
    } 
} 

