package _240202_interface;

public class C implements A
        , B{
    @Override
    public void m() {
        System.out.println("Hello from m");
    }

    public static void main(String[] args) {
        B a = new C();
        a.m();
    }
}
