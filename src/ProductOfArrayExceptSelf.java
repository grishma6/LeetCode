public class ProductOfArrayExceptSelf {
    public int[] productOfArrayExceptSelf(int[] nums){
        //Input: nums = [1,2,3,4]
        //Output: [24,12,8,6]

        //Input: nums = [-1,1,0,-3,3]
        //Output: [0,0,9,0,0]
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for(int i=1; i<n; i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i=n-1; i>=0; i--){
            result[i]=result[i]*right;
            right*=nums[i];
        }
        return result;
    }
}
