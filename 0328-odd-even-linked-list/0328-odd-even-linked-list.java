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
    public ListNode oddEvenList(ListNode head) {
        ListNode dum1= new ListNode(0);
        ListNode dum2= new ListNode(0);
        ListNode d1 = dum1;
        ListNode d2 = dum2;
        ListNode t = head;
        int cnt = 1;
        while(t!= null){
            if(cnt%2!=0){
                ListNode s = new ListNode(t.val);
                dum1.next = s;
                dum1 = s;
            }else{
                ListNode s = new ListNode(t.val);
                dum2.next = s;
                dum2 = s;
            }
            cnt++;
            t = t.next;
        }
        dum1.next = d2.next;
        return d1.next;
    }
}