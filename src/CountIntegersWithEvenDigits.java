public class CountIntegersWithEvenDigits {
    public int countIntegerWithDigits(int num){
        //Input: num = 4
        //Output: 2
        //Explanation:
        //The only integers less than or equal to 4 whose digit sums are even are 2 and 4.

        //Input: num = 30
        //Output: 14
        //Explanation:
        //The 14 integers less than or equal to 30 whose digit sums are even are
        //2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
        int count = 0;

        for(int i=1; i<=num; i++){
            int sum = 0;
            int temp = i;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }

            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}
