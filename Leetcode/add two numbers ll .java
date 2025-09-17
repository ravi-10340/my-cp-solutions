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
    public ListNode reverse(ListNode l1){
        ListNode prev = null;
        ListNode curr = l1;
        ListNode ford = l1;
        while(curr!=null){
            ford = curr.next;
            curr.next  = prev;
            prev = curr;
            curr =ford;
        }
        return prev;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        ListNode res = new ListNode(0);
        ListNode r = res;
        int carry =0,sum =0;
        while(r1!=null && r2!=null){
            sum = r1.val+ r2.val + carry;
            carry = sum/10;
            ListNode o=  new ListNode(sum%10);
            res.next =  o;
            res= o;
            r1 = r1.next;
            r2 = r2.next;
        }
        while(r1!=null){
            sum = r1.val+ carry;
            carry = sum/10;
            ListNode o=  new ListNode(sum%10);
            res.next =  o;
            res= o;
            r1 = r1.next;
        }
        while(r2!=null){
            sum = r2.val+ carry;
            carry = sum/10;
            ListNode o=  new ListNode(sum%10);
            res.next =  o;
            res= o;
            r2  = r2.next;
        }
        if (carry > 0) {
            res.next = new ListNode(carry);
        }
        ListNode e = reverse(r.next);
        return e;


    }
}
