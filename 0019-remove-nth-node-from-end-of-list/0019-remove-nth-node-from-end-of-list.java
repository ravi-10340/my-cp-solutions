/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next == null)) return null; 

        // int len = 0;
        // ListNode temp = head;
        // while(temp!=null){
        //     len++;
        //     temp = temp.next;
        // }
        // int res = len-n;
        // if(len == n){
        //     return head.next;
        // }
       
        // temp = head;
        
        // while(temp!=null){
        //     res--;
        //     if(res==0) break;

        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        
        ListNode dum = new ListNode(0,head);
        ListNode slow = dum;
        ListNode fast = dum;
        while(n-- >=0){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return dum.next;
    }
}