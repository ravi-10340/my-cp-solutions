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
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        ListNode temp = head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int x = (cnt/2) +1;

        ListNode t = head;
        int c = 0;
        while(t!=null){
            c += 1;
            if(c == x){
                break;
            }else{
                ListNode p = t.next;
                t.next = null;
                t = p;
            }

        }
        return t;
    }
}