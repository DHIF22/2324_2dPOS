package _240209_arraylist;

import java.util.ArrayList;
import java.util.List;

public class HowToUseArrayList {
    public static void main(String[] args) {
        // Whats a arrayList?
        // Its a dynamical array.
        // Look at:
        // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

        ArrayList<String> explictList = new ArrayList<>();

        // this is my way!
        List<String> myList = new ArrayList<>();

        for(int i = 0; i < 100_000; ++i) {
            myList.add(String.format("Number_%d", i));
        }

        //System.out.println(myList);
        System.out.println("Statistic:");
        System.out.println(String.format("  size: %d", myList.size()));
        System.out.println(String.format("  first element: %s", myList.get(0)));
        System.out.println(String.format("  last element: %s", myList.get(myList.size()-1)));

        myList.remove(myList.size()-1); // remove one entry
        System.out.println(String.format("  last element: %s", myList.get(myList.size()-1)));

        for(String element : myList){ // iteration
            System.out.println("Hello this is " + element);
        }

        int index = myList.indexOf("Number_99998");
        System.out.println("Index of : " + index);

        // some example - please don't do that!
        //for(int i = 0; i < 10; ++i){
        //    i -= 1;
        //}
    }
}
