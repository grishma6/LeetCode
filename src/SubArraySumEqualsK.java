import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subArraySumEqual(int[] nums, int k){
        //Input: nums = [1,1,1], k = 2
        //Output: 2

        //Input: nums = [1,2,3], k = 3
        //Output: 2
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;

        for(int n : nums){
            sum+=n;

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
