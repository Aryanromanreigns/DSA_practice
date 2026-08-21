class Solution {
public:
    static bool cmp(vector<int>& a, vector<int>& b) {
        if(a[0] == b[0])
            return a[1] > b[1];

        return a[0] < b[0];
    }

    int removeCoveredIntervals(vector<vector<int>>& arr) {
        sort(arr.begin(), arr.end(), cmp);

        int end = arr[0][1];

        // arr[0] is remaining
        int cnt = 1;

        for(int i = 1; i < arr.size(); i++) {

            if(end >= arr[i][1]) {
                // current interval is covered
                continue;
            }
            else {
                // current interval remains
                cnt++;
                end = arr[i][1];
            }
        }

        return cnt;
    }
};