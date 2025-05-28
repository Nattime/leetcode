package Q_0000_0999;

import com.resources.ListNode;

/**
 * 2. Add Two Numbers
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        int over = 0;
        ListNode ret = new ListNode(0);
        ListNode traverse = ret;

        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                int sum = l1.val + l2.val + over;
                over = sum / 10;
                traverse.next = new ListNode(sum % 10);
                l1 = l1.next;
                l2 = l2.next;
            }else{
                if(l1 == null){
                    int sum = l2.val + over;
                    l2.val = sum % 10;
                    over = sum / 10;
                    traverse.next = l2;
                    l2 = l2.next;
                }else if(l2 == null){
                    int sum = l1.val + over;
                    l1.val = sum % 10;
                    over = sum / 10;
                    traverse.next = l1;
                    l1 = l1.next;
                }
            }
            traverse = traverse.next;
        }
        if(over == 1){
            traverse.next = new ListNode(1);
        }

        return ret.next;
    }
}
