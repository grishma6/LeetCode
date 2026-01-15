import java.util.HashSet;

public class FindTheDuplicateNumber {
    public int findTheDuplicateNumber(int[] nums){
        //Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
        //
        //There is only one repeated number in nums, return this repeated number.
        //
        //You must solve the problem without modifying the array nums and using only constant extra space.

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            if(set.contains(n)){
                return n;
            }
            set.add(n); //Stores unique values only
        }
        return -1;
    }
}
