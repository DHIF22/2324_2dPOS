package _240419_FunctionalInterface_Lambda._01;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceOne {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();

        toLowerCase.format("heLLo world");
        toLowerCase.format("heLLo woRld");

        //your turn:
        // generate an upperCase class from interface StringFormatter

        ToUpperCase toUpperCase = new ToUpperCase();
        toUpperCase.format("heLLo world");
        toUpperCase.format("heLLo woRld");

        // Take 2
        System.out.println("----- Take 2 -----");
        StringFormatter take2_toUpperCase = new ToUpperCase();
        StringFormatter take2_toLowerCase = new ToLowerCase();
        take2_toLowerCase.format("hello World");
        take2_toUpperCase.format("HelloWorld");

        List<StringFormatter> stringFormatters = new ArrayList<>();
        stringFormatters.add(take2_toLowerCase);
        stringFormatters.add(take2_toUpperCase);
        String swifty = "Hello Taylor Swift";
        for(StringFormatter s : stringFormatters){
            s.format(swifty);
        }

        // Take 3
        System.out.println("----- Take 3 -----");
        // this is lambda expression
        // (s) : parameter of method
        // -> : lambda operator
        // System.ou ... : thats what the method has todo!
        StringFormatter take3_toUpperCase = (s) -> System.out.println(s.toUpperCase());
        take3_toUpperCase.format("Hello Taylor");

        // your turn: Stringformatter which remove the spaces from string
        // as lambda expression
        StringFormatter take3_removeSpaces = (s) -> System.out.println(s.replace(" ", ""));
        take3_removeSpaces.format(swifty);

    }

}
