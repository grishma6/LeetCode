public class DeleteNodeLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public void deleteNodeLinkedList(ListNode node){
            //copy the value of next node into the current node
            node.val = node.next.val;

            //skip the next node
            node.next = node.next.next;
        }
    }
}
