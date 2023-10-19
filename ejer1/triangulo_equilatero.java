package ejer1;

public class triangulo_equilatero {
    double lado,altura1,base1;

    public triangulo_equilatero(double base1,double altura1) {
        this.base1 = base1;
        this.altura1 = altura1;
    }

    public double area() {
        return (base1 * altura1) / 2;
    }

    public double perimetro() {
        
        return 3 * altura1;
    }
    
}
