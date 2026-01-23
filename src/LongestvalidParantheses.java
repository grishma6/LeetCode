import java.util.Stack;

public class LongestvalidParantheses {
    public int longestValidParantheses(String s){
        //Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.
        //
        //
        //
        //Example 1:
        //
        //Input: s = "(()"
        //Output: 2
        //Explanation: The longest valid parentheses substring is "()".
        //Example 2:
        //
        //Input: s = ")()())"
        //Output: 4
        //Explanation: The longest valid parentheses substring is "()()".
        //Example 3:
        //
        //Input: s = ""
        //Output: 0
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxLen = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            }else{
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}
