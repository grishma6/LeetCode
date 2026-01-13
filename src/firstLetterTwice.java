import java.util.HashSet;

public class firstLetterTwice {
    public char repeatedCharcter(String s){
        HashSet<Character> map = new HashSet<>();

        for(char c : s.toCharArray()){
            if(map.contains(c)){
                return c;
            }
            map.add(c);
        }
        return ' ';
    }
}
