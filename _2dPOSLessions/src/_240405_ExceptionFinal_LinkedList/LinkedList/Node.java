package _240405_ExceptionFinal_LinkedList.LinkedList;

public class Node {
    private Data data;
    private Node next = null;

    public Node(Data data){
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
