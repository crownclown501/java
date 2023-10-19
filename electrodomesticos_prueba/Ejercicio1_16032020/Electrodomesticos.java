package Ejercicio1_16032020;

/*
Se desea construir un programa en Java que permita insertar datos de cinco electrodomésticos en un arreglo.
Existen dos tipos de electrodoméstico: refrigeradores y lavadoras. Todos los electrodomésticos tiene asociado 
un costo y un código, el cual es único, esto es, no debe haber otro electrodoméstico con el mismo código. 
El código de los refrigeradores siempre es un número par y el de las lavadores un número impar. 
En cuanto a los refrigeradores, se debe especificar el tamaño del refrigerador en metros y la capacidad en litros, 
además se debe especificar la cantidad de energía que consume y si es de dos puertas o de una puerta. 
En cuanto a las lavadoras, se debe especificar la capacidad en kilos, además si es de rodillo o no.
Un refrigerador tiene como operaciones: abrir puerta, cerrar puerta, cambiar temperatura, 
encender lámpara y apagar lámpara. Una lavadora puede iniciar lavado, detener ciclo, enjuagar y terminar.
El programa en java deberá mostrar los datos de los electrodomésticos y realizar los llamados a las 
operaciones de cada electrodoméstico. Se deben utilizar clase o clases abstractas, herencia, 
variables estáticas y sobrecarga de constructores.
*/
class Electrodomesticos {
    private boolean esLavadora, esRefrigerador, esDeDosPuertas, esDeRodillo;
    private double costo, capacidad, tamano, consumo, temperatura;
    private String estadoLavadora;
    private int id;

    private static int idLavadora = 1;
    private static int idRefrigerador = 2;

    public Electrodomesticos(double capacidad, boolean esDeRodillo, double costo) {
        this.esLavadora = true;
        this.capacidad = capacidad;
        this.esDeRodillo = esDeRodillo;
        this.costo = costo;

        id = idLavadora;
        idLavadora += 2;
    }

    
    public Electrodomesticos(double tamano, double capacidad, double consumo, boolean esDeDosPuertas, double costo) {
        this.esRefrigerador = true;
        this.tamano = tamano;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.esDeDosPuertas = esDeDosPuertas;
        this.costo = costo;

        id = idRefrigerador;
        idRefrigerador += 2;
    }

    public void abrirPuerta() {
        if (!esRefrigerador)
            return;
        System.out.println("La puerta del refrigerador con ID " + id + " se ha abierto");
    }

    public void cerrarPuerta() {
        if (!esRefrigerador)
            return;
        System.out.println("La puerta del refrigerador con ID " + id + " se ha cerrado");
    }

    public void encenderLampara() {
        if (!esRefrigerador)
            return;
        System.out.println("La lámpara del refrigerador con ID " + id + " se ha encendido");
    }

    public void apagarLampara() {
        if (!esRefrigerador)
            return;
        System.out.println("La lámpara del refrigerador con ID " + id + " se ha apagado");
    }

    public void cambiarTemperatura(double temperatura) {
        if (!esRefrigerador)
            return;
        this.temperatura = temperatura;
        System.out.println("La temperatura del refrigerador con ID " + id + " se cambió a " + temperatura);
    }

    public void iniciarLavado() {
        if (!esLavadora)
            return;
        System.out.println("[Lavadora " + id + "] Lavado iniciado");
        estadoLavadora = "Lavado iniciado";
    }

    public void detenerCiclo() {
        if (!esLavadora)
            return;
        System.out.println("[Lavadora " + id + "] Ciclo detenido");
        estadoLavadora = "Ciclo detenido";
    }

    public void enjuagar() {
        if (!esLavadora)
            return;
        System.out.println("[Lavadora " + id + "] Enjuagar");
        estadoLavadora = "Enjuagando";
    }

    public void terminar() {
        if (!esLavadora)
            return;
        System.out.println("[Lavadora " + id + "] Terminar");
        estadoLavadora = "Terminado";
    }

    public void imprimirDatos() {
        if (esLavadora) {
            imprimirDatosLavadora();
        } else {
            imprimirDatosRefrigerador();
        }
    }

    private void imprimirDatosLavadora() {
        String esDeRodilloEsp;

        if (esDeRodillo) {
            esDeRodilloEsp = "Si";
        } else {
            esDeRodilloEsp = "No";
        }

        System.out.println("ID: " + id);
        System.out.println("Capacidad: " + capacidad + " kg");
        System.out.println("Es de rodillo: " + esDeRodilloEsp);
        System.out.println("Costo: $" + costo);
        System.out.println("Estado: " + estadoLavadora);
    }

    private void imprimirDatosRefrigerador() {
        int numeroPuertas;

        if (esDeDosPuertas) {
            numeroPuertas = 2;
        } else {
            numeroPuertas = 1;
        }

        System.out.println("ID: " + id);
        System.out.println("Tamaño:" + tamano);
        System.out.println("Capacidad: " + capacidad + " lts");
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Consumo: " + consumo + " Wh");
        System.out.println("Temperatura: " + temperatura + "°");
        System.out.println("Costo: $" + costo);
    }
}