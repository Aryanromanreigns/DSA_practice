class Solution {
public:
    struct cmp{
     bool operator()(pair<int , char>&a , pair<int , char>&b){
        if(a.first == b.first){
            return a.second < b.second;
        }
        return a.first < b.first;
     }
    };
    string reorganizeString(string s) {
        int n = s.size();
        string ans ;
        unordered_map<char , int>mpp;
        for(int i = 0 ; i < n ; i++){
            mpp[s[i]]++;
        }

        priority_queue<pair<int , char> , vector<pair<int , char >> , cmp>pq;
        for(auto it : mpp){
            pq.push({it.second , it.first});
        }

        char prev = '#';
        while(!pq.empty()){
            int cnt = pq.top().first;
            char val = pq.top().second;
            pq.pop();

            if(ans.empty() || ans.back() !=val){
                ans += val;
                cnt--;
                if(cnt > 0){
                    pq.push({cnt , val});
                }
            }
            else{
                if(pq.empty())return "";
                auto pp = pq.top();
                pq.pop();
                ans += pp.second;
                pp.first--;
                if(pp.first > 0){
                    pq.push(pp);
                }

                pq.push({cnt , val});
            }




        }
        return ans;
        
    }
};