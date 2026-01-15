import java.util.HashMap;
public class singleNumberIII {
    public int[] SingleNumber(int[] nums){
        //Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
        //
        //You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

        HashMap<Integer, Integer> map = new HashMap<>();

        //counting frequency
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int[] ans = new int[2];
        int idx = 0;


        for(int n : map.keySet()){
            if(map.get(n)==1){
                ans[idx++] = n;
                if(idx == 2) break;
            }
        }
        return ans;
    }
}
