import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums){
        //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }
        for(int i=0; i<=nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
