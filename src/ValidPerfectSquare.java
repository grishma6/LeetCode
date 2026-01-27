public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num){
        //Input: num = 16
        //Output: true
        //Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

        //Input: num = 14
        //Output: false
        //Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

        if(num == 0) return false;

        long low = 1;
        long high = num;

        while(low<=high){
            long mid = low+(high-low)/2;
            long square = mid*mid;

            if(square == num) return true;
            else if (square < num) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
