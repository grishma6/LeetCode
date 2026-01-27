public class sqrtx {
    public int sqrtx(int x){
        //Input: x = 4
        //Output: 2

        //Input: x = 8
        //Output: 2

        if(x == 0) return 0;

        int low = 0;
        int high = x;
        int ans = 0;

        while(low<=high){
            int mid = low+(high-low)/2;

            if((long) mid*mid <= x){
                ans = mid;
                low = mid+1;
            }else high = mid - 1;
        }
        return ans;
    }
}
