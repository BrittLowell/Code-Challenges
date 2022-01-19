import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validation {
    public boolean validWord(String unscrambledWord, String word){
        boolean valid = false;
        char c;
        ArrayList<Character> charList = new ArrayList<>(unscrambledWord.length());
        for(int i = 0;i<unscrambledWord.length();i++){
            c = unscrambledWord.charAt(i);
            if(charList.contains(c)){
                continue;
            }
            Pattern p = Pattern.compile(Character.toString(c));
            if(p.matcher(word).groupCount() <= p.matcher(unscrambledWord).groupCount()){
                valid = p.matcher(word).matches();
            } else{
                return false;
            }
            charList.add(c);
        }
        return valid;
    }
}
