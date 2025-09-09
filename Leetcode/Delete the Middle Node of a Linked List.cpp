class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        ListNode* temp = head;
        ListNode* prev;
        int cnt=0,data;

        while(temp!=NULL){
            cnt++;
            temp = temp->next;
        }
        if(head == NULL || head->next ==NULL){
            return NULL;
        }
        if(cnt==1){
            delete temp;
            return head;
        }
        int mid = cnt/2;
        int p=0;
        ListNode* t = head;
        while(p<mid && t!= NULL){
            prev = t;
            t = t->next;
            p++;
        }

        prev->next = t->next;
        delete t;
        return head;
    }
};
