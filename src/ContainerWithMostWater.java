public class ContainerWithMostWater {
    public int containerWithMostWater(int[] height){
        //Input: height = [1,8,6,2,5,4,8,3,7]
        //Output: 49
        //Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

        //Input: height = [1,1]
        //Output: 1
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left<right){
            int width = right-left;
            int h = Math.min(height[left], height[right]);
            int area = width*h;

            maxArea = Math.max(maxArea, area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
