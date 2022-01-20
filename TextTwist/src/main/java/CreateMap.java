import java.util.HashMap;

public class CreateMap {

    //Class used to create the HashMaps used in this challenge.
    public HashMap<Character,Integer> repeatedCharacters(String word){
        HashMap<Character,Integer> charFrequencies = new HashMap<>();
        for (char ch : word.toCharArray()) {
            charFrequencies.put(ch, charFrequencies.getOrDefault(ch, 0) + 1);
        }
        return charFrequencies;
    }

}
