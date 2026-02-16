public class LongestRepeatingCharacterReplacement {
    public int longestRepeatingCharacter(String s, int k){
        //Input: s = "ABAB", k = 2
        //Output: 4
        //Explanation: Replace the two 'A's with two 'B's or vice versa.

        //Input: s = "AABABBA", k = 1
        //Output: 4
        //Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
        //The substring "BBBB" has the longest repeating letters, which is 4.
        //There may exists other ways to achieve this answer too.
        int length = 0;
        int maxCount = 0;
        int l = 0;
        int[] count = new int[26];

        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            count[c-'A']++;
            maxCount = Math.max(maxCount, count[c-'A']);


            if(r-l+1-maxCount>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            length = Math.max(length, r-l+1);
        }
        return length;
    }
}
