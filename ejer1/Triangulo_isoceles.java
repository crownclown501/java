package ejer1;

class Triangulo_isoceles extends Figura {
    double base, altura,lado;

    public Triangulo_isoceles(double base, double altura) {
        this.base = base;
        this.altura = altura;
        
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double perimetro() {
        
        return (2 * lado) + base;
    }

    @Override
    public double perimetro() {
        // TODO Auto-generated method stub
        return 0;
    }
}
