import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine){
        //Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
        //
        //Each letter in magazine can only be used once in ransomNote.

        // HashMap to store frequency of each character in magazine
        // Key   -> character
        // Value -> how many times that character appears
        HashMap<Character, Integer> map = new HashMap<>();

        // STEP 1: Count each character in magazine
        for(char c : magazine.toCharArray()){
            // getOrDefault(c, 0) means:
            // - if c exists in map, get its current count
            // - if c does NOT exist, assume count = 0
            // then add 1 because we found c one more time
            map.put(c, map.getOrDefault(c,0)+1);
        }
        // STEP 2: Try to build ransomNote using magazine characters
        for(char c : ransomNote.toCharArray()){
            // If character does NOT exist in magazine
            // OR if it exists but all copies are already used (count == 0)
            if(!map.containsKey(c) || map.get(c) == 0){
                return false;// cannot construct ransom note
            }
            // Use one occurrence of the character
            // Decrease the available count by 1
            //Here, adding would be wrong, because:
            //
            //You’re not getting new characters
            //
            //You’re consuming what already exists
            map.put(c, map.get(c)-1);
        }
        // If all characters were successfully used
        return true;
    }
}
