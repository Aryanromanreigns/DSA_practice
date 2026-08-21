class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        int n = arr.size();
        if(n <= 2)return false;
        int i = 0 , j = n-1;

        while(i < j){
            if(arr[i] < arr[i+1] && arr[j] < arr[j-1]){
                i++;
                j--;
            }
            else if(arr[i] < arr[i+1]){
                i++;
            }
            else if(arr[j] < arr[j-1]){
                j--;
            }
            else{
                return false;
            }
        }
        if(i == n-1 || j == 0)return false;
        return true;
        
    }
};