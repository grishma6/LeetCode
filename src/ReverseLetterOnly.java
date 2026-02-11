public class ReverseLetterOnly {
    public String reverseLetterOnly(String s){
        //Input: s = "ab-cd"
        //Output: "dc-ba"

        //Input: s = "a-bC-dEf-ghIj"
        //Output: "j-Ih-gfE-dCba"

        //Input: s = "Test1ng-Leet=code-Q!"
        //Output: "Qedo1ct-eeLg=ntse-T!"
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(!Character.isLetter(arr[left])){
                left++;
            }else if(!Character.isLetter(arr[right])){
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
