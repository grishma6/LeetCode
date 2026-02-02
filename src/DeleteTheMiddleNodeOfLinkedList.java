public class DeleteTheMiddleNodeOfLinkedList {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //Input: head = [1,3,4,7,1,2,6]
    //Output: [1,3,4,1,2,6]
    //Explanation:
    //The above figure represents the given linked list. The indices of the nodes are written below.
    //Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
    //We return the new list after removing this node.

    //Input: head = [1,2,3,4]
    //Output: [1,2,4]
    //Explanation:
    //The above figure represents the given linked list.
    //For n = 4, node 2 with value 3 is the middle node, which is marked in red.

    //Input: head = [2,1]
    //Output: [2]
    //Explanation:
    //The above figure represents the given linked list.
    //For n = 2, node 1 with value 1 is the middle node, which is marked in red.
    //Node 0 with value 2 is the only node remaining after removing node 1.
    public ListNode deleteTheMiddleNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
