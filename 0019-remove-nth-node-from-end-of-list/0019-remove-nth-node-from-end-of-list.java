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

        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int res = len-n;
        if(len == n){
            return head.next;
        }
       
        temp = head;
        
        while(temp!=null){
            res--;
            if(res==0) break;

            temp = temp.next;
        }
        temp.next = temp.next.next;
        

        return head;
    }
}