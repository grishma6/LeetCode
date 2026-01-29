import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] interSection(int[] nums1, int[] nums2){
        //Input: nums1 = [1,2,2,1], nums2 = [2,2]
        //Output: [2,2]

        //Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        //Output: [4,9]
        //Explanation: [9,4] is also accepted.


        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] result = new int[list.size()];

        for(int k=0; k<list.size(); k++){
            result[k] = list.get(k);
        }
        return result;
    }
}
