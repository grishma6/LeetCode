public class NumberOfOneBits {
    public int numberOfOneBits(int n){
        //Input: n = 11
        //
        //Output: 3
        //
        //Explanation:
        //
        //The input binary string 1011 has a total of three set bits.

        //Input: n = 128
        //
        //Output: 1
        //
        //Explanation:
        //
        //The input binary string 10000000 has a total of one set bit.

        //Input: n = 2147483645
        //
        //Output: 30
        //
        //Explanation:
        //
        //The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
        int count = 0;

        while(n != 0){
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
