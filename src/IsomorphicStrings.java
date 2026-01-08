public class IsomorphicStrings {
    public boolean isIsomorphicStrings(String s, String t){
        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
