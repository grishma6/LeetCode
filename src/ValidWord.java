public class ValidWord {
    public boolean validWord(String word){
        //A word is considered valid if:
        //
        //It contains a minimum of 3 characters.
        //It contains only digits (0-9), and English letters (uppercase and lowercase).
        //It includes at least one vowel.
        //It includes at least one consonant.
        //You are given a string word.
        //
        //Return true if word is valid, otherwise, return false.
        //
        //Notes:
        //
        //'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
        //A consonant is an English letter that is not a vowel.


        if(word.length() < 3) return false;

        boolean vowel = false;
        boolean constant = false;

        for(char ch : word.toCharArray()){
            if(!(Character.isLetterOrDigit(ch))){
                return false;
            }
            if (Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel = true;
                }
                else{
                    constant = true;
                }
            }
        }
        return vowel&&constant;
    }
}
