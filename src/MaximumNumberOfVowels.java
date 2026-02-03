public class MaximumNumberOfVowels {
    public int maximumNumberOfVowels(String s, int k){
        //Input: s = "abciiidef", k = 3
        //Output: 3
        //Explanation: The substring "iii" contains 3 vowel letters.

        //Input: s = "aeiou", k = 2
        //Output: 2
        //Explanation: Any substring of length 2 contains 2 vowels.

        //Input: s = "leetcode", k = 3
        //Output: 2
        //Explanation: "lee", "eet" and "ode" contain 2 vowels.
        int current = 0;

        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))) current++;
        }

        int max = current;

        for(int i=1; i<=s.length()-k; i++){
            if(isVowel(s.charAt(i-1))) current--;
            if(isVowel(s.charAt(i+k-1))) current++;
            if(current > max) max = current;
        }
        return max;
    }

    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
