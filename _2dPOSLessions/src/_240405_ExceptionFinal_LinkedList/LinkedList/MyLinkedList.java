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
    }

    public void append(Node node){
        if(head.getNext() == null){
            head.setNext(node);
        }
    }

    public int size(){
        // your turn!
        return counter;
    }

    public void insert(Node node){
        // your turn!
        if(head == null){
            head = node;
        } else {
            Node currentNode = head;
            int valueToInsert = node.getData().id;

            // find teh right node
            while(currentNode.getNext() != null){
                if(currentNode.getNext().getData().id > valueToInsert){
                    currentNode = currentNode.getNext();
                    continue;
                }
            }
            node.setNext(currentNode.getNext());
            currentNode.setNext(node);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MyLinkedList\n");
        Node currentNode = head;
        boolean isRunning = true;
        while(isRunning){
            sb.append(currentNode.getData().id + " " + currentNode.getData().name + "\n" );

            if(currentNode.getNext() == null){
                isRunning = false;
            } else {
                currentNode = currentNode.getNext();
            }
        }

        return sb.toString();
    }
}
