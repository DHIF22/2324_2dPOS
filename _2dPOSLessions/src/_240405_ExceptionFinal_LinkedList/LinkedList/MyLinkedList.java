package _240405_ExceptionFinal_LinkedList.LinkedList;

public class MyLinkedList {
    private Node head = null; // this is the only element in an empty list
    private int counter = 0;

    /*
    your turn:
    * implement insert methode. The nodes should be sorted by id
    * implement toString method
    * test some cases
     */

    public MyLinkedList() {
        System.out.println("Linked List started");
        head = new Node(null);
    }

    public void append(Node node){
        if(head.getNext() == null){
            head.setNext(node);
        } else {
            Node currentNode = head.getNext();
            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }

    public int size(){
        // your turn!
        return counter;
    }

    public void insert(Node node){
        // your turn!
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MyLinkedList\n");
        Node currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            sb.append(currentNode.getData().id + " " + currentNode.getData().name + "\n" );
        }

        return sb.toString();
    }
}
