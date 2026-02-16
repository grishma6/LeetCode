import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    //Input: s = "abcabcbb"
    //Output: 3
    //Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

    //Input: s = "bbbbb"
    //Output: 1
    //Explanation: The answer is "b", with the length of 1.

    //Input: s = "pwwkew"
    //Output: 3
    //Explanation: The answer is "wke", with the length of 3.
    //Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    public int longestSubString(String s){
        int length = 0;
        int l = 0;

        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()){
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);

            length = Math.max(length, set.size());
        }
        return length;
    }
}
