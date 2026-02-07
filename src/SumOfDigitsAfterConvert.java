public class SumOfDigitsAfterConvert {
    public int sumOfDigits(String s, int k){
        //Input: s = "iiii", k = 1
        //
        //Output: 36
        //
        //Explanation:
        //
        //The operations are as follows:
        //- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
        //- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
        //Thus the resulting integer is 36.

        //Input: s = "leetcode", k = 2
        //
        //Output: 6
        //
        //Explanation:
        //
        //The operations are as follows:
        //- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
        //- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
        //- Transform #2: 33 ➝ 3 + 3 ➝ 6
        //Thus the resulting integer is 6.
        int sum = 0;

        for(char c : s.toCharArray()){
            int val = c - 'a'+1;
            while(val>0){
                sum+=val%10;
                val/=10;
            }
        }


        for(int i=1; i<k; i++){
            int nextSum = 0;
            while(sum>0){
                nextSum+=sum%10;
                sum/=10;
            }
            sum = nextSum;
        }
        return sum;
    }
}
