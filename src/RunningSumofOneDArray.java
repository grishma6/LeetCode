public class RunningSumofOneDArray {
    public int[] runningSum(int[] nums){
        int sum = 0;
        int n = nums.length;
        int result[] = new int[n];

        for(int i=0; i<n; i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
