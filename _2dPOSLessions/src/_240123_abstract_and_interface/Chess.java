package _240123_abstract_and_interface;

public class Chess extends BaseGame{
    private final static String TAG = "Chess";

    @Override
    public void init(){
        System.out.println(TAG + ":init called");
    }

    @Override
    public void startGame(){
        System.out.println(TAG + ":startGame called");
    }

    @Override
    public void endGame(){
        System.out.println(TAG + ":endGame called");
    }
}
