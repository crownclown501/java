class lista_enlazada {
    Node head;
    int total;
    lista_enlazada(){
        this.head=null;
        this.total=0;
    }
    public class Node 
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data = data;
            this.next= null;
        }
    }
    public void add(int data)
    {
        Node new_Node= new Node (data);
        new_Node = null;
        if (this.head == null) {
            head= new_Node;
        } else {
            Node last = getLastNode();
            last.next = new_Node;
        }
        this.total++;
    }
    public Node getLastNode() {
        if (this.head ==null)
        return null;
        Node last = this.head;
        Node control = this.head;
        while (control!=null) {
            last = control;
            control=last.next;
        }
        return last;
    }
    public Node getNodeAtNode(int position)
    {
        if (this.head == null || (this.total-1)<position) 
            return null;
        Node control = this.head;
        int x=0;
        while (control!=null) {
            if (x==position) break;
            x++;
            control= control.next;
        }
        return control;
    }
    public void attach (Node node, int data)
    {
        if (this.head==null || node == null )
        return;
        Node new_Node = node ;
        Node  previousNode=node ;
        Node next_Node = node.next;
        previousNode.next =new_Node;
        new_Node.next=next_Node;
        this.total++;
    }
    public void deleteerase(Node node)
    {
        if (this.head==null || node == null )
        return;
        Node control = this.head;
        Node temp=null;
        if (node==head) {//quitamos el nodo incial 
            temp=this.head;
            this.head=this.head.next;
            temp=null;
        }else{ //se quita otro nodo
            while (control.next!=node) {
                control=control.next;
            }
            temp=control.next;
            control.next=temp.next;
            temp=null;
        }
        this.total--;
    }
    public Node printNode(){
        Node node = this.head;
        while (node!= null) {
            System.out.println("["+node.data+"]");
            node = node.next;
        }
        return node;
    }
}
