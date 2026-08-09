class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        int n = points.size();
        vector<int>arr;
        priority_queue<pair<int , pair<int,int>>>pq;
        for(int i = 0 ; i < n ; i++){
            int first = points[i][0];
            int second = points[i][1];

            int val = first*first + second*second;

            pq.push({val , {first , second}});


            if(pq.size() > k){
                pq.pop();
            }



        }
        vector<vector<int>>ans;
        while(!pq.empty()){
            ans.push_back({pq.top().second.first , pq.top().second.second});
            pq.pop();
        }
        return ans;
        
    }
};