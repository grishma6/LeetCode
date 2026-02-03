public class MaximumAverageSubArray {
    public double maximumAverageSubArray(int[] nums, int k){
        //Input: nums = [1,12,-5,-6,50,3], k = 4
        //Output: 12.75000
        //Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

        //Input: nums = [5], k = 1
        //Output: 5.00000
        int current = 0;
        int w = k;

        for(int i=0; i<w;i++){
            current += nums[i];
        }

        int max = current;

        for(int i=1; i<=nums.length-w; i++){
            current = current - nums[i-1] + nums[i+w-1];

            if(current > max){
                max = current;
            }
        }
        return (double)max/w;
    }
}
