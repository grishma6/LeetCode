public class MaximumProductSubArray {
    public int maximumProductSubArray(int[] nums){
        //Input: nums = [2,3,-2,4]
        //Output: 6
        //Explanation: [2,3] has the largest product 6.

        //Input: nums = [-2,0,-1]
        //Output: 0
        //Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
        int result = nums[0];
        int minProd = nums[0];
        int maxProd = nums[0];

        for(int i=1; i<nums.length; i++){
            int current = nums[i];

            int temp = Math.max(current, Math.max(current*maxProd, current*minProd));
            minProd = Math.min(current, Math.min(current*maxProd, current*minProd));

            maxProd = temp;

            result = Math.max(result, maxProd);
        }
        return result;
    }
}
