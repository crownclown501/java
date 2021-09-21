package polaca;

public class Convertidor {
 
    public static String convertirApostfija(String infija){//se crea el metodo convertirApostfija y se le ingresa la operacion infija como argumento
    String postfija= "";
    PilaAA pila= new PilaAA(30);
     
    for (int i=0; i < infija.length(); i++){// se recorre la operacion infija para hacer la conversion. se detendra cuando haya recorrido cada 
    char letra= infija.charAt(i);         // elemento de la operacion infija 
    if (esOperador(letra)){
    if (letra== ')'){
     
    while(pila.getTope()!= '(') 
    postfija += pila.pop(); 
    if(pila.getTope()== '(')
    pila.pop();
    }
    if (pila.vacia()){
    if (letra!= ')')
    pila.push(letra);
    }
    else{
    if (letra!= ')'){
    int pe= prioridadExp(letra);
    int pp= prioridadPila((char)pila.getTope());
    if (pe > pp){
    pila.push(letra);
    } 
    else {
    postfija += pila.pop();
    pila.push(letra);
    }
    }
    }
    }
    else
    postfija += letra; 
    } 
    while (!pila.vacia()){
    postfija += pila.pop();
    }
    return postfija;
    } 
    
    public static int prioridadExp(char x){ //se le aasigna la prioridad a cada operador de la expresion
    if (x == '^') return 4;
    if (x == '*' || x == '/') return 2;
    if (x == '+' || x == '-') return 1;
    if (x == '(') return 5;
    if (x== ')') return 5;
    return 0;
    } 
    public static int prioridadPila(char x){ //se le asigna prioridad a cada operador de la pila 
    if (x == '^') return 3;
    if (x == '*' || x == '/') return 2;
    if (x == '+' || x == '-') return 1;
    if (x == '(') return 0;
    if (x== ')') return 0;
    return 0;
    } 
    public static boolean esOperador(char letra){
    if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^' || letra == '(' || letra == ')'){
    return true;         //se compara letra con cada uno de los operadores 
    }
    else
    return false;
    }
}
