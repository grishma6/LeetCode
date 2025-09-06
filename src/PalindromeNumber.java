import java.util.Scanner;

class Solution {
    Boolean isPalindrome(int x){
        int temp = x;
        int reverse = 0;
        int digit;

        if(x<0) return false;
        while(temp != 0){
            digit = temp % 10;
            reverse = reverse*10+digit;
            temp = temp/10;
        }
        return reverse == x;
    }
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    Solution sol = new Solution();
    boolean result = sol.isPalindrome(num);

    System.out.println(result);
    scanner.close();
}
    }

