class Solution {
public:
    struct cmp{
    bool operator()(pair<int ,int>&a , pair<int , int>&b){
        if(a.second == b.second){
            return a.first < b.first;
        }
        return a.second < b.second;
    }
    };
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int , int>mpp;
        for(int i = 0 ; i < n ; i++){
            mpp[nums[i]]++;
        }

        priority_queue<pair<int , int> , vector<pair<int , int >> , cmp>pq;

        for(auto it : mpp){
            int key = it.first;
            int value = it.second;

            pq.push({key , value});
        }

        vector<int>ans;

        while(k != 0){
            int val = pq.top().first;
            ans.push_back(val);
            pq.pop();
            k--;
        }

        return ans;


        
    }
};