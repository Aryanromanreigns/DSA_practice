class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        intervals.push_back(newInterval);
        sort(intervals.begin() , intervals.end());

        vector<vector<int>>ans;

        int st = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1 ; i < intervals.size() ; i++){
            if(intervals[i][0] <= end){
                end = max(end , intervals[i][1]);
            }
            else{
                ans.push_back({st , end});
                st = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.push_back({st , end});
        return ans;



        
    }
};