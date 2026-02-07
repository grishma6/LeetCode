public class AddDigits {
    public int addDigits(int num){
        //Input: num = 38
        //Output: 2
        //Explanation: The process is
        //38 --> 3 + 8 --> 11
        //11 --> 1 + 1 --> 2
        //Since 2 has only one digit, return it.

        //Input: num = 0
        //Output: 0
        while(num>=10){
            int sum = 0;

            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num = sum;
        }
        return num;
    }
}
