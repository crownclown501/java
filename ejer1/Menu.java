package ejer1;

import java.util.Scanner;

class Menu {
    private Scanner scanner;
    int opcion;
    public Menu() {
        scanner = new Scanner(System.in);
    }


    public void iniciar() {
        vistaPrincipal();

        scanner.close();
        System.out.println("Fin del programa");
    }

    private void vistaPrincipal() {
        
        System.out.print("Ingrese la longitud de un lado del cuadrado: ");
        double longitud = scanner.nextDouble();
        scanner.nextLine();
        Cuadrado cuadrado = new Cuadrado(longitud);
        
        System.out.println("Area: " + cuadrado.area());
        System.out.println("Perimetro" + cuadrado.perimetro());
        System.out.println("\n1)isoceles\n2)equilatero");
        switch (opcion) {
            case 1:
            System.out.print("Ingrese la base: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Ingrese lado: ");
            
            Triangulo_isoceles triso = new Triangulo_isoceles(base, altura);
            System.out.println("Triangulo: " + triso.area());
            System.out.println("Perimetro" + triso.perimetro());
            break;

            case 2:
            System.out.print("Ingrese la base: ");
            double base1 = scanner.nextDouble();
            System.out.print("Ingrese la altura:");
            double altura1 = scanner.nextDouble();
            triangulo_equilatero trieq = new triangulo_equilatero(base1,altura1);
            System.out.println("Triangulo: " + trieq.area());
            System.out.println("Perimetro" + trieq.perimetro());
            break;
        
            default:
                break;
        }
    }
    
}

