class Cola1 {

    public String A[];
    public int atras;
    public int frente;
    public int tamano;

    public Cola1(int t) {
        tamano = t;
        atras = 0;
        frente = 0;
        A = new String[t];
    }

    public void insertar(String dato) {
        A[atras] = dato;
        atras++;
    }

    public String extraer() {
        return (A[frente++]);
    }

    public int vacia() {
        if (frente == atras) {
            return 1;
        } else {
            return 0;
        }
    }

    public int llena() {
        if (atras == tamano) {
            return 1;
        } else {
            return 0;
        }
    }

    public void mostrar() {
        for (int i = frente; i < atras; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

class Pila1 {

    public String A[];
    public int tope;
    public int tamano;

    public Pila1(int t) {
        tamano = t;
        tope = 0;
        A = new String[t];
    }

    public void push(String dato) {
        A[tope] = dato;
        tope++;
    }

    public String pop() {
        tope--;
        return (A[tope]);
    }

    public int vacia() {
        if (tope == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int llena() {
        if (tope == tamano) {
            return 1;
        } else {
            return 0;
        }
    }

    public void mostrar() {
        for (int i = 0; i < tope; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

public class notacionpost {
    public static Cola1 Cola1entrada;
    public static Cola1 Cola1salida;
    public static Pila1 Pila1operacion;
    public static Pila1 Pila1evualuacion;
    public static String ud;

    public static void sacarDatosCola1Entrada() {
        int c = Cola1entrada.vacia();
        int p;
        if (c == 0) {
            do {
                String e;
                String d = Cola1entrada.extraer();
                if ((d != "+") && (d != "-") && (d != "*") && (d != "/") && (d != "=")) {
                    Cola1salida.insertar(d);
                } else {
                    p = Pila1operacion.vacia();
                    if (p == 1) {
                        Pila1operacion.push(d);
                        ud = d;
                    } else {
                        switch (d) {
                            case "+":
                            case "-":
                                if (ud == "=") {
                                    Pila1operacion.push(d);
                                    ud = d;
                                } else if (ud != "=") {
                                    while (ud != "=") {
                                        e = Pila1operacion.pop();
                                        Cola1salida.insertar(e);
                                        ud = Pila1operacion.pop();
                                        Pila1operacion.push(ud);
                                    }
                                    Pila1operacion.push(d);
                                    ud = d;
                                }
                                break;
                            case "/":
                            case "*":
                                if (ud == "=" || ud == "-" || ud == "+") {
                                    Pila1operacion.push(d);
                                    ud = d;
                                } else {
                                    while (ud == "/" || ud == "*") {
                                        e = Pila1operacion.pop();
                                        Cola1salida.insertar(e);
                                        ud = Pila1operacion.pop();
                                        Pila1operacion.push(ud);

                                    }
                                    Pila1operacion.push(d);
                                    ud = d;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
                c = Cola1entrada.vacia();

            } while (c != 1);
            if (Pila1operacion.vacia() != 1) {
                while (Pila1operacion.vacia() != 1) {
                    String s = Pila1operacion.pop();
                    Cola1salida.insertar(s);
                }
            }
        }
    }

    public static void sacarDatosCola1Salida() {
        int c = Cola1salida.vacia();
        if (c == 0) {
            do {
                String d = Cola1salida.extraer();
                if ((d != "+") && (d != "-") && (d != "*") && (d != "/") && (d != "=")) {
                    Pila1evualuacion.push(d);
                } else {
                    int dato1;
                    int dato2;
                    int dato3;
                    String dato4;
                    switch (d) {
                        case "+":
                            dato1 = Integer.parseInt(Pila1evualuacion.pop());
                            dato2 = Integer.parseInt(Pila1evualuacion.pop());
                            dato3 = dato2 + dato1;
                            dato4= String.valueOf(dato3);
                            Pila1evualuacion.push(dato4);
                            break;
                        case "-":
                            dato1 = Integer.parseInt(Pila1evualuacion.pop());
                            dato2 = Integer.parseInt(Pila1evualuacion.pop());
                            dato3 = dato2-dato1;
                            dato4= String.valueOf(dato3);
                            Pila1evualuacion.push(dato4);
                            break;
                        case "*":
                            dato1 = Integer.parseInt(Pila1evualuacion.pop());
                            dato2 = Integer.parseInt(Pila1evualuacion.pop());
                            dato3 = dato2*dato1;
                            dato4= String.valueOf(dato3);
                            Pila1evualuacion.push(dato4);
                            break;
                        case "/":
                            dato1 = Integer.parseInt(Pila1evualuacion.pop());
                            dato2 = Integer.parseInt(Pila1evualuacion.pop());
                            dato3 = dato2/dato1;
                            dato4= String.valueOf(dato3);
                            Pila1evualuacion.push(dato4);
                            break;
                        case "=":
                            dato1 =Integer.parseInt(Pila1evualuacion.pop());
                            Pila1evualuacion.push("=");
                            dato4= String.valueOf(dato1);
                            Pila1evualuacion.push(dato4);
                            break;
                    }
                }
                c = Cola1salida.vacia();

            } while (c != 1);
        }
    }

    public static void main(String[] args) {
        Cola1entrada = new Cola1(15);
        Cola1salida = new Cola1(15);
        Pila1operacion = new Pila1(15);
        Pila1evualuacion = new Pila1(15);
        Cola1entrada.insertar("X");
        Cola1entrada.insertar("=");
        Cola1entrada.insertar("3");
        Cola1entrada.insertar("*");
        Cola1entrada.insertar("4");
        Cola1entrada.insertar("+");
        Cola1entrada.insertar("8");
        Cola1entrada.insertar("/");
        Cola1entrada.insertar("2");
        Cola1entrada.insertar("-");
        Cola1entrada.insertar("1");
        Cola1entrada.mostrar();
        System.out.println();
        sacarDatosCola1Entrada();
        Cola1salida.mostrar();
        sacarDatosCola1Salida();
        System.out.println();
        Pila1evualuacion.mostrar();
    }
}
