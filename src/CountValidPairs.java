import java.util.List;

public class CountValidPairs {
    public int countPairs(List<Integer> nums, int target){
        //Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

        int count = 0;

        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i)+nums.get(j) < target){
                    count ++;
                }
            }
        }
        return count;
    }
}
