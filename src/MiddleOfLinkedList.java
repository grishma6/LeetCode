public class MiddleOfLinkedList {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        //Input: head = [1,2,3,4,5]
        //Output: [3,4,5]
        //Explanation: The middle node of the list is node 3.

        //Input: head = [1,2,3,4,5,6]
        //Output: [4,5,6]
        //Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
        public ListNode middleOfLinkedList(ListNode head){
            if(head == null || head.next == null){
                return head;
            }

            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
