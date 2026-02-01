public class LinkedListCycle {
    //Input: head = [3,2,0,-4], pos = 1
    //Output: true
    //Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

    //Input: head = [1,2], pos = 0
    //Output: true
    //Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

    //Input: head = [1], pos = -1
    //Output: false
    //Explanation: There is no cycle in the linked list.
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }

        ListNode first = head;
        ListNode last = head;

        while(last != null && last.next != null){
            first = first.next; //updating values 1 step
            last = last.next.next;//updating values 2 steps

            if(first == last){
                return true;
            }
        }
        return false;
    }
}
