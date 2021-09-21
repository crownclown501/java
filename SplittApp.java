public class SplittApp {

    public static void main(String... javierMS) {
        String cadena = "1000000.315|+|5.8|/|(|6.0|+|1|-|8|*|2.0|)"; // tu cadena con el separador "|"
        String[] extraccion = cadena.split("|",13); // metodo split con el separador + el limite en int
    
        for(String elemento : extraccion){ // impresion de la extraccion por medio de un for mejorado o for each
            System.out.println(elemento);   
        }
    
    }
}