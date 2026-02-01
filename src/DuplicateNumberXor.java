import java.util.HashMap;

public class DuplicateNumberXor {
    public int duplicateNumberXor(int[] nums){
        //Input: nums = [1,2,1,3]
        //
        //Output: 1
        //
        //Explanation:
        //
        //The only number that appears twice in nums is 1.

        //Input: nums = [1,2,3]
        //
        //Output: 0
        //
        //Explanation:
        //
        //No number appears twice in nums.

        //Input: nums = [1,2,2,1]
        //
        //Output: 3
        //
        //Explanation:
        //
        //Numbers 1 and 2 appeared twice. 1 XOR 2 == 3.
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int n : map.keySet()){
            if(map.get(n) == 2) {
                result ^= n;
            }
        }
        return result;
    }
}
