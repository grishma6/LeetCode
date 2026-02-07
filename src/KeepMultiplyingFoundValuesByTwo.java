public class KeepMultiplyingFoundValuesByTwo {
    public int keepMultiplying(int[] nums, int original){
        //Input: nums = [5,3,6,1,12], original = 3
        //Output: 24
        //Explanation:
        //- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
        //- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
        //- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
        //- 24 is not found in nums. Thus, 24 is returned.

        //Input: nums = [2,7,9], original = 4
        //Output: 4
        //Explanation:
        //- 4 is not found in nums. Thus, 4 is returned.
        boolean found = true;

        while(found){
            found = false;

            for(int i=0; i<nums.length; i++){
                if(nums[i] == original){
                    original = 2*original;
                    found = true;
                    break;
                }
            }
        }
        return original;
    }
}
