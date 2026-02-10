public class MaximumSubArray {
    public int maximumSubArray(int[] nums){
        //Kadane's Algorithm
        int currSum = 0;
        int maxSum = nums[0];
        int n = nums.length;

        for(int i=0; i<nums.length; i++){
            currSum = Math.max(currSum, 0);
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
