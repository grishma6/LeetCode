import java.util.HashMap;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        //Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
        //
        //You must implement a solution with a linear runtime complexity and use only constant extra space.

        HashMap<Integer, Integer> map = new HashMap<>();

        //counting frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        // find number that appears once
        for(int n : map.keySet()){
            if(map.get(n) == 1){
                return n;
            }
        }
        return -1;
    }
}
