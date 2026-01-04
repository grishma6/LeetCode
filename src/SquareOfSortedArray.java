import java.util.Arrays;

public class SquareOfSortedArray {
    public int[] sortedArray(int[] nums){
        int n = nums.length;
        int result[] = new int[n];

        for(int i=0; i<n; i++){
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}
