public class ReverseBits {
    public int reverseBits(int n){
        int result = 0;

        //Input: n = 43261596
        //
        //Output: 964176192

        //Input: n = 2147483644
        //
        //Output: 1073741822
        for(int i=0; i<32; i++){
            result = result << 1;
            result = result | (n&1);
            n = n >> 1;
        }
        return result;
    }
}
