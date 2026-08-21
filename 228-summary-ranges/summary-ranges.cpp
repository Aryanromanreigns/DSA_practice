class Solution {
public:
    vector<string> summaryRanges(vector<int>& arr) {
        int n = arr.size();
        vector<string>ans;
        if(n == 0)return ans;
        int start = arr[0];


        for(int i = 1 ; i < n; i++){
            if(arr[i] != arr[i-1]+1){
                if(start == arr[i-1]){
                    ans.push_back(to_string(start));
                }else{
                    ans.push_back(to_string(start) + "->" + to_string(arr[i-1]));
                }
                start = arr[i];
            }

        }

        if(start == arr[n-1]){
            ans.push_back(to_string(arr[n-1]));
        }else{
            ans.push_back(to_string(start)+ "->"+ to_string(arr[n-1]));
        }

        return ans;

        
        
    }
};