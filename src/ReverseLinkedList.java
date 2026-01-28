public class ReverseLinkedList {
    public ListNode reverseList(ListNode head){
        //Input: head = [1,2,3,4,5]
        //Output: [5,4,3,2,1]

        //Input: head = [1,2]
        //Output: [2,1]

        //Input: head = []
        //Output: []

        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;

    }
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
}
