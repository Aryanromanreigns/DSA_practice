/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<int> nextLargerNodes(ListNode* head) {
        ListNode* temp = head;
        vector<int>ans;
        while(temp != NULL){
            ans.push_back(temp->val);
            temp = temp->next;
        }

        int n = ans.size();
        stack<int>st;
        vector<int>arr;
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.empty() && ans[i] >= st.top()){
                st.pop();
            }
            if(st.empty()){
                arr.push_back(0);
            }
            else{
                arr.push_back(st.top());
            }
            st.push(ans[i]);
        }

        reverse(arr.begin() , arr.end());
        return arr;

        
    }
};