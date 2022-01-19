/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                return findNode(slow, head);
            }
            
        }
        return null;
    }
    
    public ListNode findNode(ListNode slow, ListNode head)
    {
        while(head!= slow)
        {
            slow = slow.next;
            head = head.next;
        }
        
        return head;
    }
}