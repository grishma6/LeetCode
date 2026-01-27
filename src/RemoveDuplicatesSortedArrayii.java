public class RemoveDuplicatesSortedArrayii {
    public int removeDuplicates(int[] nums){
        //Input: nums = [0,0,1,1,1,1,2,3,3]
        //Output: 7, nums = [0,0,1,1,2,3,3,_,_]

        //Input: nums = [1,1,1,2,2,3]
        //Output: 5, nums = [1,1,2,2,3,_]
        if(nums.length<=2) return nums.length;

        int k = 2;

        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
