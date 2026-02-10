public class LongestContinuousIncreasingSequence {
    public int longestContinuousIncreasingSequence(int[] nums){
        int count = 1;
        int maxCount = 1;
        int n = nums.length;

        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 1;
            }
        }
        return maxCount;
    }
}
