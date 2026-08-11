class Solution {
public:
    int leastInterval(vector<char>& tasks, int n) {
        int m = tasks.size();
        priority_queue<pair<int , char>>pq;
        unordered_map<char , int>mpp;
        for(int i = 0 ; i < m ; i++){
            mpp[tasks[i]]++;
        }
        for(auto it : mpp){
            char first = it.first;
            int second = it.second;
            pq.push({second , first});
        }

        int cnt = 0;
        while(!pq.empty()){
            int k = n + 1;
            vector<pair<int , char>>arr;

            while(k > 0 && !pq.empty()){
                pair<int , char>top = pq.top();
                pq.pop();

                cnt++;
                top.first--;
                k--;

                if(top.first > 0)arr.push_back(top);

            }

            for(int i = 0 ; i < arr.size() ; i++){
                pq.push(arr[i]);
            }
            if(!pq.empty()){
                cnt += k;
            }
           
        }

        return cnt;


        
    }
};