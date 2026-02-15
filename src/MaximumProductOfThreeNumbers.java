public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums){
        //Input: nums = [1,2,3]
        //Output: 6

        //Input: nums = [1,2,3,4]
        //Output: 24

        //Input: nums = [-1,-2,-3]
        //Output: -6
        int n = nums.length;

        int product1 = nums[n-1]*nums[n-2]*nums[n-3];

        int product2 = nums[0]*nums[1]*nums[n-1];

        return Math.max(product1, product2);
    }
}
