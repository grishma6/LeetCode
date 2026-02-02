public class RemoveLinkedListElements {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
            this.next=null;
        }
        //Input: head = [1,2,6,3,4,5,6], val = 6
        //Output: [1,2,3,4,5]

        //Input: head = [], val = 1
        //Output: []

        //Input: head = [7,7,7,7], val = 7
        //Output: []
        public ListNode removeLinkedList(ListNode head, int val){
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode current = dummy;

            while(current.next != null){
                if(current.next.val == val){
                    current.next = current.next.next;
                }else{
                    current = current.next;
                }
            }
            return dummy.next;
        }
    }
}
