class Solution {
public:
    static bool cmp(pair<int ,int>&a , pair<int , int>&b){
        if(a.first == b.first){
            return a.second > b.second;
        }
        return a.first < b.first;
    }
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        vector<pair<int , int>>arr;
        int n = profit.size();
        for(int i = 0 ; i < n; i++){
            arr.push_back({ difficulty[i] , profit[i]});
        }

        sort(arr.begin() , arr.end() , cmp);
        sort(worker.begin() , worker.end());

        int m = worker.size();

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxi = 0;
        while(i < m){
            while(j < n && worker[i] >= arr[j].first){
                maxi = max(maxi , arr[j].second);
                j++;
            }
            sum += maxi;
            i++;

            
        }
        return sum;
        
    }
};