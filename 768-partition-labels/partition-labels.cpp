class Solution {
public:
    vector<int> partitionLabels(string s) {
        int n = s.size();
        unordered_map<char , int>mpp;
        for(int i = 0 ; i < n ; i++){
            mpp[s[i]] = i;
        }

        vector<int>ans;
        int maxi = mpp[s[0]];
        int low = 0;
        for(int i = 0 ; i < n; i++){
            maxi = max(maxi , mpp[s[i]]);
            if(i == maxi){
                ans.push_back(i - low + 1);
                low = i+1;
            }




        }
        return ans;
        
    }
};