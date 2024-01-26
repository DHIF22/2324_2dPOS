package _231201_InnerClasses;

public class InnerClass {
    private int id;
    private double money;

    private MakeMoreMoney makeMoreMoney;

    // your turn: write the ctor for the class InnerClass
    public InnerClass(int id){
        this.id = id;
        this.money = 0.0;
        this.makeMoreMoney = new MakeMoreMoney("Income");
    }

    // your turn: setter / getter for id and money

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //
    public class MakeMoreMoney{
        private String name;
        private double rendite = 0.25;
        public MakeMoreMoney(String name){
            this.name = name;

            // access to the outer instance variables
            money = money * (1+rendite);
        }

        @Override
        public String toString() {
            return String.format("MakeMoreMoney: %s : %f", name, rendite);
        }
    }

    @Override
    public String toString() {
        return String.format("%d: %f ", id, money) + makeMoreMoney;
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass(12);
        System.out.println(innerClass);

        innerClass.setMoney(13);
        System.out.println(innerClass);
    }
}
