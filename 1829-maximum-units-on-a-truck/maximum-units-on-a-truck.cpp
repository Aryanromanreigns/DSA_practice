class Solution {
public:
    static bool cmp(vector<int>&a , vector<int>&b){
        if(a[1] == b[1]){
            return a[0] > b[0];
        }
        return a[1] > b[1];
    }
    int maximumUnits(vector<vector<int>>& arr, int k) {
        int n = arr.size();
        sort(arr.begin() , arr.end() , cmp);

        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            int sizee = arr[i][0];
            int qu = arr[i][1];

            if(k >= sizee){
                k -= sizee;

                sum += sizee*qu;

            }
            else{
                while(sizee != k){
                    sizee--;
                }
                k -= sizee;
                sum += sizee*qu;
            }
            if(k == 0 )break;
        }
        return sum;

        
    }
};