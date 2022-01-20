import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class Validation {
    public boolean validWord(String guess, String unscrambledWord){
        if(guess.length() > 6 || guess.length() < 3){
            return false;
        }
        //create another hashmap (guessMap) that contains the frequency of characters in the guesses
        //check if each of the keys in guessMap exists in the unfilteredWordMap
        //check if the values in the guessMap are <= the values in the unfilteredWordMap
        CreateMap createMap = new CreateMap();
        HashMap<Character,Integer> unscrambleMap = createMap.repeatedCharacters(unscrambledWord);
        HashMap<Character,Integer> guessMap = createMap.repeatedCharacters(guess);
        boolean valid = false;

        for (Character key: guessMap.keySet()) {
            valid = unscrambleMap.containsKey(key) && unscrambleMap.get(key) >= guessMap.get(key);
        }

        return valid;
    }

}
