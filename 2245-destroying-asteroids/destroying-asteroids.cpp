class Solution {
public:
    bool asteroidsDestroyed(int mass, vector<int>& arr) {
        int n = arr.size();
        sort(arr.begin(), arr.end());
        // int i = 0;
        // while(i < n){
        //     if(mass >= arr[i]){
        //         mass += arr[i];
        //         i++;
        //     }
        //     else{
        //         return false;
        //     }
            
        // }
        // return true;

        long long sum = mass;
        for(int i = 0 ; i < n ; i++){
            if(sum >= arr[i]){
                sum += arr[i];
            }
            else{
                return false;
            }
        }
        return true;
        
    }
};