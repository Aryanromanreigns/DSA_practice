class Solution {
public:
    static bool cmp(string &a , string &b){
        return a+b > b+a;
    }
    string largestNumber(vector<int>& nums) {
        int n = nums.size();
        vector<string>arr;
        for(int i = 0 ; i < n ; i++){
            arr.push_back(to_string(nums[i]));
        }
        sort(arr.begin() , arr.end() , cmp);

        string ans = "";

        for(int i = 0 ; i < arr.size() ; i++){
            ans += arr[i];
        }
        if(ans[0] == '0')return "0";
        return ans;




        
    }
};