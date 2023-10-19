package ejer1;

class Cuadrado extends Figura {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

   
    public double area() {
        return lado * lado;
    }

    public double perimetro(){
        return lado*4;
    }
}
