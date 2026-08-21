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

        int sum = 0;

        int i = 0;
        while(i < n){
            if(k >= arr[i][0]){
                sum += arr[i][0] * arr[i][1];
                k = k - arr[i][0];

            }
            else{
                sum += k*arr[i][1];
                k = 0;
            }

            i++;
            if(k == 0)break;
        }
        return sum;

        
    }
};