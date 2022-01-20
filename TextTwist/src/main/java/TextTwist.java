import java.util.ArrayList;
import java.util.Scanner;

public class TextTwist {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ScrambleWords scrambleWords = new ScrambleWords();

        System.out.println("Input the unscrambled word below.");
        String unscrambledWord = scanner.nextLine();
        String scram = scrambleWords.shuffle(unscrambledWord);
        System.out.println("Input valid words from the following scrambled word: " + scram + "\n");
        System.out.println("Valid words are: \nBetween 3 and 6 characters long. \nOnly contain the letters" +
                " in the scrambled word. \nContains lesser or equal number of the available characters " +
                "(ie if there are two n's, then each valid guess only contains two or less n's)");

        boolean guessing = true;
        String guess;
        ArrayList<String> guesses = new ArrayList<>();
        while(guessing){
            guess = scanner.nextLine();
            guesses.add(guess);
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
