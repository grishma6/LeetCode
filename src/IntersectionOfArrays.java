import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {
    public int[] intersectionOfArrays(int[] nums1, int[] nums2){
        //Input: nums1 = [1,2,2,1], nums2 = [2,2]
        //Output: [2]

        //Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        //Output: [9,4]
        //Explanation: [4,9] is also accepted.
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);

                while(i+1<nums1.length && nums1[i]==nums1[i+1]) i++;
                while(j+1<nums2.length && nums2[j]==nums2[j+1]) j++;

                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int[] result = new int[list.size()];

        for(int k=0; k<list.size(); k++){
            result[k]=list.get(k);
        }
        return result;
    }
}
