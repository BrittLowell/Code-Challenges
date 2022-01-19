import java.util.ArrayList;
import java.util.Collections;

public class ScrambleWords {

    public String shuffle(String word){
        ArrayList<Character> chars = new ArrayList<>(word.length());
        for ( char c : word.toCharArray() ) {
            chars.add(c);
        }
        Collections.shuffle(chars);
        char[] shuffled = new char[chars.size()];
        for ( int i = 0; i < shuffled.length; i++ ) {
            shuffled[i] = chars.get(i);
        }
        return new String(shuffled);
    }
}
