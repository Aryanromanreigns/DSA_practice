class Solution {
public:
    struct cmp{
        bool operator()(pair<int , int>&a , pair<int , int>&b){
            if(a.first == b.first){
                return a.second < b.second;
            }
            return a.first < b.first;
        }
    };
    string frequencySort(string s) {
        int n = s.size();
        unordered_map<char , int>mpp;
        priority_queue<pair<int , int> , vector<pair<int , int>> , cmp>pq;

        for(int i = 0 ; i < n ; i++){
            mpp[s[i]]++;
        }

        for(auto it : mpp){
            int cnt = it.second;
            int val = it.first;

            pq.push({cnt , val});
        }
        string ans;
        while(!pq.empty()){

            ans += string(pq.top().first , pq.top().second);
            pq.pop();
        }
        return ans;
        
    }
};