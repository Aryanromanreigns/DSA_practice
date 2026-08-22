class Solution {
public:
    vector<string> summaryRanges(vector<int>& arr) {
        int n = arr.size();
        if(n == 0) return {};
        vector<string>ans;
        int last = arr[0];
        int prev = last;
        for(int i = 1 ; i < n; i++){
            if(arr[i] != arr[i-1] +1){
                if(last == arr[i-1]){
                    ans.push_back(to_string(last));
                }
                else{
                    ans.push_back(to_string(last) + "->" + to_string(arr[i-1]));
                }
                last = arr[i];
            }
            

        }
        if(last == arr[n-1]){
            ans.push_back(to_string(last));

        }
        else{
            ans.push_back(to_string(last) + "->" + to_string(arr[n-1]));
        }
        return ans;
        
    }
};