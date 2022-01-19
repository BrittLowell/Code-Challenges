import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TextTwist {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ScrambleWords scrambleWords = new ScrambleWords();

        String unscrambledWord = scanner.nextLine();
        scrambleWords.shuffle(unscrambledWord);


        System.out.println("Form 6 letter words from the following scrambled word: ");
    }
}
