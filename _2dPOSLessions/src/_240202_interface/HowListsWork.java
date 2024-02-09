package _240202_interface;

import java.util.ArrayList;
import java.util.List;

public class HowListsWork {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(14);
        System.out.println(myList.size());

        /* your turn:
        add, delete, print and check some or all other methodes of
        interface List ...

         */
        for(Integer i : myList){ //
            System.out.println(i);
        }
    }
}
