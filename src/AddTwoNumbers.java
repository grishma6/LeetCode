public class AddTwoNumbers {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        //Input: l1 = [2,4,3], l2 = [5,6,4]
        //Output: [7,0,8]
        //Explanation: 342 + 465 = 807.

        //Input: l1 = [0], l2 = [0]
        //Output: [0]

        //Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        //Output: [8,9,9,9,0,0,0,1]
        public ListNode addTwoNumbers(ListNode l1, ListNode l2){
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            int carry = 0;

            while(l1 != null || l2 != null || carry != 0){
                int sum = carry;

                if(l1 != null){
                    sum += l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum += l2.val;
                    l2 = l2.next;
                }

                carry = sum/10;
                current.next = new ListNode(sum%10);
                current = current.next;
            }
            return dummy.next;
        }
    }
}
