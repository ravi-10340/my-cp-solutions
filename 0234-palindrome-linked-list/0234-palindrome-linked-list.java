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
    public boolean fun(String s){
        int i=0;
        int j =s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();
        ListNode temp = head;
        while(temp!=null){
            s.append(temp.val);
            temp = temp.next;
        }
        return fun(s.toString());
    }
}