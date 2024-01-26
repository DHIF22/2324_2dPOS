package _240123_abstract_and_interface;

// abstracted class:
// * all extend classes MUST implement the abstract methodes
// * no one can construct an object from an abstract class
// * the abstract class can have implemented methodes, instance varaibles, ...

public abstract class BaseGame {
    // abstract: you have to do!
    public abstract void init();
    public abstract void startGame();
    public abstract void endGame();

    // DesignPattern: MethodeTemplatePattern
    public void play(){
        init();
        startGame();
        endGame();
    }
}
