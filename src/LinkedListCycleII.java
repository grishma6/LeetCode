public class LinkedListCycleII {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    //Input: head = [3,2,0,-4], pos = 1
    //Output: tail connects to node index 1
    //Explanation: There is a cycle in the linked list, where tail connects to the second node.

    //Input: head = [1,2], pos = 0
    //Output: tail connects to node index 0
    //Explanation: There is a cycle in the linked list, where tail connects to the first node.

    //Input: head = [1], pos = -1
    //Output: no cycle
    //Explanation: There is no cycle in the linked list.
        public ListNode linkedListCycle(ListNode head){
            if(head == null || head.next == null){
                return null;
            }

            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    ListNode entry = head;
                    while (entry != slow) {
                        entry = entry.next;
                        slow = slow.next;
                    }
                    return entry;
                }
            }
            return null;
        }
    }

