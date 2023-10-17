package _231006_StringApi;

public class StringApi {
    public static void main(String[] args) {
        String name = "Frank"; // stringpool
        String otherName = new String("Frank");
        String someOtherName = "Frank"; // point to the same memory as variable name
        // there is no other way to construct a string

        String arithmetic = name + otherName;
        System.out.println(arithmetic);
        String addedString = new String(name + " " + otherName);
        System.out.println(addedString);

        Teacher teacher = new Teacher("Prof Schreiber");
        System.out.println(teacher); // same as System.out.println(teacher.toString());
        String result = teacher.toString();

        String text = new String("This is a long story of a chess playing boy from Malta, " +
                "originally from Denmark, now living a Tobel");

        String replacedText = text.replace("long", "short");
        System.out.println(replacedText);
        // Your turn: Convert o to O
        System.out.println(replacedText.replace('o', 'O'));

        String subString = replacedText.substring(6);
        System.out.println(subString);
        subString = replacedText.substring(6, 12);
        System.out.println(subString);

        String mail = " earth@milkyway.com ";
        System.out.println(mail);
        String correctMail = mail.trim();
        System.out.println(correctMail);


    }
}
