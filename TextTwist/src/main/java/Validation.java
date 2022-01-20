import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class Validation {
    public boolean validWord(String word){
        if(word.length() > 6 || word.length() < 3){
            return false;
        }
        //create another hashmap (guessMap) that contains the frequency of characters in the guesses
        //check if each of the keys in guessMap exists in the unfilteredWordMap
        //check if the values in the guessMap are <= the values in the unfilteredWordMap

        return false;//TODO: Replace this return statement with the actual return statement
    }

}
