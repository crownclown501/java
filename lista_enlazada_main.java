
public class lista_enlazada_main {
    public static void main(String[] args) {
        lista_enlazada list = new lista_enlazada();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
       list.printNode();
        list.attach(list.getNodeAtNode(1), 30);
        list.printNode();
        list.deleteerase(list.getNodeAtNode(4));
        list.printNode();
    }
}
