import java.util.ArrayList;
import java.util.HashMap;

public class Score {
    Validation validation = new Validation();

    //    Create a function that takes in an array of already-guessed words, the unscrambled 6-letter word and
//    returns the total number of points the player scored in a particular round using the following rubric:
//
//            3-letter words are 1 pt
//            4-letter words are 2 pts
//            5-letter words are 3 pts
//            6-letter words are 4 pts + 50 pt bonus (for unscrambling the word)
//            Remember that invalid words (words that cannot be formed from the 6-letter unscrambled words)
//            count as 0 pts.
    public int calcScore(ArrayList<String> guesses, String unscrambledWord){
        int len;
        int total = 0;
        for (String guess : guesses) {
            if(validation.validWord(guess,unscrambledWord)){
                len = guess.length();
                System.out.println("Len: " + len + "; guess = " + guess);
            } else {
                len = 0;
            }

            if(len == 0){
                total += 0;
            } else if(len == 3){
                total += 1;
            } else if (len == 4) {
                total += 2;
            } else if (len == 5) {
                total += 3;
            } else {
                total += 54;
            }
        }
        return total;
    }

}
