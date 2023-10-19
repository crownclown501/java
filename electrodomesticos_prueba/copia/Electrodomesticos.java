package copia;

public class Electrodomesticos {
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
