import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evaluateReversePolishNotation(String[] tokens){
        //You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
        //
        //Evaluate the expression. Return an integer that represents the value of the expression.
        //
        //Note that:
        //
        //The valid operators are '+', '-', '*', and '/'.
        //Each operand may be an integer or another expression.
        //The division between two integers always truncates toward zero.
        //There will not be any division by zero.
        //The input represents a valid arithmetic expression in a reverse polish notation.
        //The answer and all the intermediate calculations can be represented in a 32-bit integer.
        Stack<Integer> stack = new Stack<Integer>();

        for(String t:tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){


                int b = stack.pop();
                int a = stack.pop();

                if(t.equals("+")) stack.push(a+b);
                else if(t.equals("-")) stack.push(a-b);
                else if(t.equals("*")) stack.push(a*b);
                else if(t.equals("/")) stack.push(a/b);

                }
            else{
                stack.push(Integer.parseInt(t));//It converts a String into an int.
            }
        }
        return stack.pop();
    }
}
