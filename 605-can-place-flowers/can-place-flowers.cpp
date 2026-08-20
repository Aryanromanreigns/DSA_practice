class Solution {
public:
    bool canPlaceFlowers(vector<int>& arr, int n) {
        int m = arr.size();
        if(n == 0)return true;

        if(m == 1){
            if(arr[0] == 0){
                n--;
                if(n == 0)return true;
                return false;
            }
            return false;
        }
        if(arr[0] == 0 && arr[1] == 0){
            arr[0] = 1;
            n--;
            if(n == 0)return true;
        }
        int i = 1;
        for(i = 1 ; i < m-1 ; i++)
        {
            if(arr[i] == 0 && arr[i-1] == 0 && arr[i+1] == 0 ){
                arr[i] = 1;
                n--;
                i++;
            }
            if(n == 0)return true;

        }
        if(n > 0){
            if(arr[m-2] == 0 && arr[m-1] == 0){
                arr[m-1] = 1;
                n--;
            }
        }
        if(n==0)return true;
        return false;

        
    }
};