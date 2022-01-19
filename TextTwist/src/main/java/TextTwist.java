import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TextTwist {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ScrambleWords scrambleWords = new ScrambleWords();
        Validation validation = new Validation();

        String unscrambledWord = scanner.nextLine();
        String scram = scrambleWords.shuffle(unscrambledWord);
        System.out.println("Input valid words from the following scrambled word: " + scram);

        boolean guessing = true;
        String guess;
        ArrayList<String> guesses = new ArrayList<>();
        while(guessing){
            guess = scanner.nextLine();

            if(validation.validWord(unscrambledWord,guess)){
                guesses.add(guess);
            } else{
                System.out.println("Invalid guess! Please guess again using only the characters in the" +
                        "following word: " + scram);
                continue;
            }
            System.out.println("Would you like to make another guess? Y/N");
            String answer = scanner.nextLine();
            if(answer.equals("n") || answer.equals("N")){
                guessing = false;
            } else{
                System.out.println("Scrambled word: " + scram);
            }
        }
        Score score = new Score();
        System.out.println("Total points: " + score.calcScore(guesses,unscrambledWord));
    }
}
