public class LongestPalindromicSubString {
    public String longestPalindromicSubString(String s){
        //Given a string s, return the longest palindromic substring in s.
        if(s == null || s.length() == 0) return "";

        String result = "";

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sub = s.substring(i,j+1);

                if(isPalindrome(sub) && sub.length() > result.length()){
                    result = sub;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left<right){
        if (str.charAt(left) != str.charAt(right)){
            return false;
        }
        left ++;
        right --;
    }
    return true;
}
}
