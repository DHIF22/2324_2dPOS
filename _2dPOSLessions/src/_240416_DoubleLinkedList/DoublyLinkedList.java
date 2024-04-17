package _240416_DoubleLinkedList;

public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;

    void append(Person p){
        Node appendNode = new Node(p);
        if(head == null){
            head = tail = appendNode;
        } else {
            tail.next = appendNode;
            appendNode.prev = tail;
            tail = appendNode;
        }
    }

    void prepend(Person p){
        Node prependNode = new Node(p);
        if(head == null){
            head = tail = prependNode;
        } else {
            prependNode.next = head;
            head.prev = prependNode;
            head = prependNode;
        }
    }

    void printForward(){
        Node currentNode = head; // start at beginning
        while(currentNode != null){
            System.out.println(currentNode.data.name);
            currentNode = currentNode.next;
        }
    }

    void printBackward(){
        Node current = tail;
        while(current != null){
            System.out.println(current.data.name);
            current = current.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Person p = new Person();
        p.name = "Albert";

        doublyLinkedList.append(p);
        doublyLinkedList.printForward();

        System.out.println("---------------------");
        Person p1 = new Person();
        p1.name = "Edgar";
        doublyLinkedList.append(p1);
        doublyLinkedList.printForward();
        System.out.println("---------------------");
        doublyLinkedList.printBackward();
        System.out.println("---------------------");
        Person p2 = new Person();
        System.out.println("---------------------");
        p2.name = "Schnitzerl";
        doublyLinkedList.prepend(p2);
        doublyLinkedList.printForward();
    }
}
