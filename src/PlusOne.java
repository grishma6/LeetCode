public class PlusOne {
    public int[] plusOne(int[] digits){
        //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
        //
        //Increment the large integer by one and return the resulting array of digits.

        //Start adding from the last digit
        //
        //If the digit is not 9, add 1 and stop
        //
        //If the digit is 9, turn it into 0 and carry to the left
        //
        //If all digits were 9, create a new array with one extra space

        for(int i = digits.length-1; i>=0; i++){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
