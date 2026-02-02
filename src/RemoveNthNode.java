public class RemoveNthNode {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        //Input: head = [1,2,3,4,5], n = 2
        //Output: [1,2,3,5]

        //Input: head = [1], n = 1
        //Output: []

        //Input: head = [1,2], n = 1
        //Output: [1]
        public ListNode removeNthNode(ListNode head, int n){
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode slow = dummy;
            ListNode fast = dummy;

            for(int i=0;i<n;i++){
                fast = fast.next;
            }

            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return dummy.next;
        }
    }
}
