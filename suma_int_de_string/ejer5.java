package suma_int_de_string;
import java.util.Scanner;
    // regex change letters
    // split and then suma
class ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        String cadena = scanner.nextLine();

        String[] cadenas = cadena.replaceAll("\\D", " ").split(" ");

        for (int i = 0; i < cadenas.length; i++) {
            try {
                suma += Integer.parseInt(cadenas[i]);
            } catch (NumberFormatException a) {
            }
        }
        System.out.println("Total: " + suma);
    }
}