public class FirstAndLastPosition {
    public int[] firstAndLastPosition(int[] nums, int target){
        //Input: nums = [5,7,7,8,8,10], target = 8
        //Output: [3,4]

        //Input: nums = [5,7,7,8,8,10], target = 6
        //Output: [-1,-1]

        //Input: nums = [], target = 0
        //Output: [-1,-1]


        int first = firstPosition(nums, target);
        if(first == -1) return new int[]{-1,-1};

        int last = lastPosition(nums, target);
        return new int[]{first, last};
    }

    public int firstPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int middle = low+(high-low)/2;
            if(nums[middle] == target) {
                ans = middle;
                high=middle-1;
            }
            else if(nums[middle] < target) low=middle+1;
            else high=middle-1;
        }
        return ans;
    }

    public int lastPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low<=high){
            int middle = low+(high-low)/2;

            if(nums[middle] == target){
                ans = middle;
                low = middle+1;
            }else if(nums[middle]<target){
                low = middle+1;
            }
            else
                high = middle-1;
        }
        return ans;
    }
}
