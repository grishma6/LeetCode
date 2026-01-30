public class FindTheDifference {
    public char findTheDifference(String s, String t){
        //Input: s = "abcd", t = "abcde"
        //Output: "e"
        //Explanation: 'e' is the letter that was added.

        //Input: s = "", t = "y"
        //Output: "y"
        char result = 0;

        for(char c : s.toCharArray()){
            result^=c;
        }
        for(char c : t.toCharArray()){
            result^=c;
        }

        return result;
    }
}
