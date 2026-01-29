import java.util.Arrays;

public class MinimumCommonValue {
    public int minimumCommonvalue(int[] nums1, int[] nums2){
        //Input: nums1 = [1,2,3], nums2 = [2,4]
        //Output: 2

        //Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
        //Output: 2

        Arrays.sort(nums1);
        Arrays.sort(nums1);

        int i = 0;
        int j = 0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
}
