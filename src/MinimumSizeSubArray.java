public class MinimumSizeSubArray {
    public int minimumSizeSubArray(int[] nums, int target){
        //Input: target = 7, nums = [2,3,1,2,4,3]
        //Output: 2
        //Explanation: The subarray [4,3] has the minimal length under the problem constraint

        //Input: target = 4, nums = [1,4,4]
        //Output: 1

        //Input: target = 11, nums = [1,1,1,1,1,1,1,1]
        //Output: 0
        int left = 0;
        int current = 0;
        int minValue = Integer.MAX_VALUE;

        for(int right = 0; right<nums.length; right++){
            current+=nums[right];

            while(current>=target){
                minValue = Math.min(minValue, right-left+1);
                current-=nums[left];
                left++;
            }
        }
        return minValue == Integer.MAX_VALUE ? 0 : minValue;
    }
}
