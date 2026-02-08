public class InsertionSortList {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }

        public ListNode insertionSortList(ListNode head){
            ListNode dummy = new ListNode(0);
            ListNode current = head;

            while(current!=null){
                ListNode next = current.next;
                ListNode node = dummy;

                while(node.next!=null && node.next.val < current.val){
                    node = node.next;
                }
                current.next = node.next;
                node.next = current;

                current = next;
            }
            return dummy.next;
        }
    }
}
