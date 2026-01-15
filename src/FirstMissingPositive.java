import java.util.HashSet;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums){
        //Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
        //
        //You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

        //The first missing positive number is always in the range: 1 to n+1

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        for(int i = 1; i < nums.length+1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}
