public class CheckNAndItsDoubleExist {
    public boolean checkIf(int[] arr){
        //Input: arr = [10,2,5,3]
        //Output: true
        //Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

        //Input: arr = [3,1,7,11]
        //Output: false
        //Explanation: There is no i and j that satisfy the conditions.
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(i!=j && arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
