import java.util.Stack;

public class MinimumAddToParantheses {
    public int minimumAddToParantheses(String s){
        //A parentheses string is valid if and only if:
        //
        //It is the empty string,
        //It can be written as AB (A concatenated with B), where A and B are valid strings, or
        //It can be written as (A), where A is a valid string.
        //You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
        //
        //For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
        //Return the minimum number of moves required to make s valid.


        //add = 1   // added '('
        //open = 1  // need ')'
        Stack<Integer> stack = new Stack<Integer>();

        int add = 0;
        int open = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                open++;
            }else{
                if(open == 0){
                    open--;
                }else add++;
            }
        }
        return add+open;
    }
}
