import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        //LIFO ->> Last in First Out
        //stores objects into sort of "verticalTower"
        //push() to add to the top
        //pop() to remove from the top
        //uses of stack
        //1.undo/redo function in text editor
        //2.moving backward/foward through browser history
        //3.backtracking algorithms(maze,file directories)
        //4.calling functions(call stack)


        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Grishma");
        stack.push("Golla");
        stack.push("Janu");
        stack.push("love");

        //System.out.println(stack);

        //stack.pop();

        //System.out.println(stack);

        //String myWord =  stack.pop();
        //System.out.println(myWord);
        //System.out.println(stack);

        //want to see top word without removing it
        System.out.println(stack.peek());

        //to search a word
        System.out.println(stack.search("Janu"));
    }
}
