public class PerfectNumber {
    public boolean perfectNumber(int num){
        //Input: num = 28
        //Output: true
        //Explanation: 28 = 1 + 2 + 4 + 7 + 14
        //1, 2, 4, 7, and 14 are all divisors of 28.

        //Input: num = 7
        //Output: false
        if(num <=1 ) return false;

        int sum = 1;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                sum+=i;

                if(i != num/i){
                    sum += num/i;
                }
            }
        }
        return num == sum;
    }
}
