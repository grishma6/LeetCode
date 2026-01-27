public class MoveZeros {
    public void moveZeros(int[] nums){
        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]

        //Input: nums = [0]
        //Output: [0]

        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }

        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    }
}
