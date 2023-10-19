package ejer4;
import java.util.Scanner;

class Ejercicio4 {
    java.util.Scanner scanner;

    public Ejercicio4() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int suma = 0;
        String cadena = scanner.nextLine();

        String[] cadenas = cadena.split(" ");

        for (int i = 0; i < cadenas.length; i++) {
            try {
                suma += Integer.parseInt(cadenas[i]);
            } catch (NumberFormatException a) {
            }
        }
        System.out.println("Total: " + suma);
    }
}