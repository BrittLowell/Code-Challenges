import java.util.HashMap;

public class CreateMap {
    HashMap<Character,Integer> charFrequencies = new HashMap<>();

    public HashMap<Character,Integer> repeatedCharacters(String word){

        for (char ch : word.toCharArray()) {
            charFrequencies.put(ch, charFrequencies.getOrDefault(ch, 0) + 1);
        }
        return charFrequencies;
    }

}
