public class MaximumSumCircularSubArray {
    public int maximumSumCircularSubArray(int[] nums){
        int currSum = 0;
        int currMin = 0;
        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int n = nums.length;


        for(int i=0; i<n; i++){
            //Total Sum
            totalSum += nums[i];

            //Max Sum
            currSum = Math.max(currSum,0);
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);

            //Min Sum
            currMin = Math.min(currMin, 0);
            currMin += nums[i];
            minSum = Math.min(minSum, currMin);
        }
        if(maxSum<0) return maxSum;
        return Math.max(maxSum, totalSum-minSum);
    }
}
