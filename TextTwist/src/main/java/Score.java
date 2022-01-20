import java.util.ArrayList;
import java.util.HashMap;

public class Score {
    Validation validation = new Validation();

//TODO:Add comments to code and then submit coding challenge
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
