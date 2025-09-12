/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int c1 = 0;
        int c2 = 0;

        ListNode* temp1 = headA;
        ListNode* temp2 = headB;
        ListNode* dum1;
        ListNode* dum2;

        while(temp1!= NULL){
            c1++;
            temp1 = temp1->next;
        }
        while(temp2!= NULL){
            c2++;
            temp2 = temp2->next;
        }
        int diff = abs(c1 - c2);
         ListNode* p1 = headA;
        ListNode* p2 = headB;

        if (c1 > c2) {
            while (diff--) p1 = p1->next;
        } else {
            while (diff--) p2 = p2->next;
        }


        while (p1 && p2) {
            if (p1 == p2) return p1; 
            p1 = p1->next;
            p2 = p2->next;
        }
        return NULL;
    }
};
