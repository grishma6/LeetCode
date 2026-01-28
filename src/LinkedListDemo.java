import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");

        //LinkedList as Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");

        linkedList.add(3, " Z");
        linkedList.remove("E");

        //Searching for an element
        System.out.println(linkedList.indexOf("A"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        linkedList.addFirst("0");
        linkedList.addLast("Z");


        //linkedList.poll();

        System.out.println(linkedList);
    }
}
