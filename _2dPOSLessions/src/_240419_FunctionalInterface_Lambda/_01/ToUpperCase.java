package _240419_FunctionalInterface_Lambda._01;

public class ToUpperCase implements StringFormatter{
    @Override
    public void format(String s) {
        System.out.println(s.toUpperCase());
    }
}
