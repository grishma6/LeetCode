public class FindAllDigitGameCanBeWon {
    public boolean finaAll(int[] nums){
        //Input: nums = [1,2,3,4,10]
        //
        //Output: false
        //
        //Explanation:
        //
        //Alice cannot win by choosing either single-digit or double-digit numbers.

        //Input: nums = [1,2,3,4,5,14]
        //
        //Output: true
        //
        //Explanation:
        //
        //Alice can win by choosing single-digit numbers which have a sum equal to 15.
        int single = 0;
        int dble = 0;

        for(int x : nums){
            if(x<10) single+=x;
            else dble+=x;
        }
        return single!=dble;
    }
}
