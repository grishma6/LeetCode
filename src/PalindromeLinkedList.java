import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        //Input: head = [1,2,2,1]
        //Output: true

        //Input: head = [1,2]
        //Output: false
        public Boolean palindromeLinkedList(ListNode head){
            List<Integer> list = new ArrayList<>();
            while(head != null){
                list.add(head.val);
                head = head.next;
            }

            int left = 0;
            int right = list.size() - 1;

            while(left<right){
                if(!list.get(left).equals(list.get(right))){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
