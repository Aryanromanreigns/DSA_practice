class Solution {
public:
    bool canMakeArithmeticProgression(vector<int>& arr) {
        int n = arr.size();
        sort(arr.begin() , arr.end());
        int i = 0;
        int j = i+1;
        int fidiff = arr[j] - arr[i];
        // vector<int>ans;
        while(j < n){
            int diff = arr[j] - arr[i];
            if(diff != fidiff){
                return false;
            }
            i++;
            j++;
        }
        // int val = ans[0];
        // for(int i = 1 ; i < ans.size() ; i++){
        //     if(ans[i] != val){
        //         return false;
        //     }
        // }
        return true;
        
    }
};