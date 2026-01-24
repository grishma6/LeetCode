public class MinimumNumberOfSwaps {
    public int minimumswaps(String s){
        //You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets '[' and n / 2 closing brackets ']'.
        //
        //A string is called balanced if and only if:
        //
        //It is the empty string, or
        //It can be written as AB, where both A and B are balanced strings, or
        //It can be written as [C], where C is a balanced string.
        //You may swap the brackets at any two indices any number of times.
        //
        //Return the minimum number of swaps to make s balanced.


        //balance = how many [ are available
        //
        //When balance goes negative → too many ]
        //
        //One swap brings a future [ to this position
        //
        //So now we have one unmatched [
        //
        //That’s why balance must be 1, not 0
        int balance = 0;
        int swaps = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '['){
                balance++;
            }else{
                balance--;
            }

            if(balance<0){
                swaps++;
                balance = 1;
            }
        }
        return swaps;
    }
}
