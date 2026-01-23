import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){
        //Queue is a FIFO data structure First In First Out(ex: a line of people)
        //A collection decided for holding elements prior to processing
        //Linear data structure

        //add = enqueue, offer()
        //remove = dequeue, poll()

        //Uses
        //1.keyboard buffer(letters should appear on the screen in the order they're pressed)
        //2.Printer Queue(print jobs should be completed in order)
        //3.used in LinkedLists, PriorityQueues, Breadth-First Search

        Queue<String> queue = new LinkedList<>();

        queue.offer("grishma");
        queue.offer("janu");
        queue.offer("golla");
        queue.offer("love");

        System.out.println(queue.peek()); // to see who is in first line of the queue

        //offer,poll,peek doesnot cause exceptions
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.isEmpty()); //1.if it is "empty" or not

        System.out.println(queue.size()); //2.to see the "size" of the queue

        System.out.println(queue.contains("janu")); //3.to see if it "contains" the name/queue or not


    }
}
