package _231013_Hangman;

import java.util.Scanner;

public class Hangman {

    // Instancevariables
    private String word;
    private Character guess = '?'; // init with an empty char

    private Scanner scanner; // declaration; reservierung des Speichers (RAM)

    private boolean isRunning = true; // default is false
    private int guessCounter; // default is 0

    private String guessWord  = ""; // for user output

    private String usedCharacter = "";

    public Hangman(String word){
        this.word = word.toUpperCase();
        this.scanner = new Scanner(System.in); // beschreiben des RAM
        for(int i = 0; i < word.length(); i++){
            guessWord += "_";
        }
    }

    private void userInput(){
        System.out.println("Please insert one character:");
        guess = Character.toUpperCase(scanner.next().charAt(0)); // attention: return type is char
        guessCounter++;
    }

    public void start(){
        // 0.) first output
        System.out.println("-- THIS IS HANGMAN --");
        System.out.println(guessWord);
        System.out.println("");

        while(isRunning) {
            if(guessCounter > 10){
                System.out.println("You lose ...");
                break;
            }
            // 1.) user input
            System.out.println("The Guessword: " + guessWord);
            userInput();

            if(usedCharacter.contains("" + guess)){
                System.out.println("Character is already used");
            } else {
                usedCharacter += guess;
                // 2.) calculation / logic
                if (word.contains("" + guess)) {
                    System.out.println("Contains");
                    guessWord = "";
                    for (int i = 0; i < word.length(); i++) {
                        char charInWord = word.charAt(i);
                        if(usedCharacter.indexOf(charInWord) >= 0){
                        //if (word.charAt(i) == guess) {
                            guessWord += charInWord;
                        } else {
                            guessWord += '_';
                        }
                    }
                } else {
                    System.out.println("No character " + guess + " in word");
                }
            }
            // 3.) Missing code is for HAK students
        }
    }

    // fuer die Ausgabe und kann dann geloescht werden
    public void debug(){
        System.out.println("-------- DEBUG --------");
        System.out.println(word);
        System.out.println("guess char " + guess);
    }
}
