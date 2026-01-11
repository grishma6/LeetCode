public class DetectCapital {
    public boolean detectCapitalUse(String word){
        if(word.equals(word.toUpperCase())){
            return true;
        }
        return false;
    }
}
