import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target){
        //Input: nums = [-1,2,1,-4], target = 1
        //Output: 2
        //Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

        //Input: nums = [0,0,0], target = 1
        //Output: 0
        //Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
        Arrays.sort(nums);

        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(Math.abs(sum-target) < Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum == target){
                    return sum;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closest;
    }
}
