package _240412_LinkedListExtends;

import _240405_ExceptionFinal_LinkedList.LinkedList.MyLinkedList;

public class MyLinkedListExtends {
    BaseNode head = null;

    public void append(BaseNode node){
        if(head == null){
            head = node;
        } else {
            BaseNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        BaseNode currentNode = head;
        while(currentNode != null){
            sb.append(currentNode.toString() + "\n");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyLinkedListExtends list = new MyLinkedListExtends();
        PersonNode p = new PersonNode();
        p.name = "DemoPerson";
        list.append(p);
        System.out.println(list);
        list.append(p);
        System.out.println(list);

    }
}
