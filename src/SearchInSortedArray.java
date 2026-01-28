public class SearchInSortedArray {
    public int searchInSortedArray(int[] nums, int target){
        //Input: nums = [4,5,6,7,0,1,2], target = 0
        //Output: 4

        //Input: nums = [4,5,6,7,0,1,2], target = 3
        //Output: -1

        //Input: nums = [1], target = 0
        //Output: -1
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid] == target) return mid;

            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
