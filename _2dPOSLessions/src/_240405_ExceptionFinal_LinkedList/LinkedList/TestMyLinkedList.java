package _240405_ExceptionFinal_LinkedList.LinkedList;


public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        Node node = new Node(new Data(1, "Takeshi"));
        linkedList.append(node);
        linkedList.append(new Node(new Data(3, "Marvel")));
        linkedList.append(new Node(new Data(2, "KingfuPanda")));

        System.out.println(linkedList.toString());

    }
}
