class Solution {
public:
    struct cmp{
        bool operator()(pair<int , int>&a , pair<int ,int>&b){
            if(a.first == b.first){
                return a.second < b.second;
            }
            return a.first < b.first;
        }
    };
    string reorganizeString(string s) {
        int n = s.size();
        unordered_map<char , int>mpp;
        priority_queue<pair<int , int > , vector<pair<int , int >> , cmp>pq;

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
            auto top = pq.top();
            int freq = top.first;
            char ch = top.second;
            pq.pop();

            if(ans.empty() || ans.back() != ch){
                ans += ch;
                freq--;
                if(freq > 0){
                    pq.push({freq , ch});
                }

            }
            else{
                if(pq.empty()){
                    return "";
                }
                auto pp = pq.top();
                pq.pop();
                ans += pp.second;
                pp.first--;

                if(pp.first > 0){
                    pq.push(pp);
                }
                pq.push({freq , ch});

            }
        }

        return ans;


        
    }
};