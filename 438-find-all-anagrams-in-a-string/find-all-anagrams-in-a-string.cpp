class Solution {
public:
    vector<int> findAnagrams(string s, string p) {

        int n = s.size();
        int m = p.size();

        unordered_map<char , int>mpp;
        unordered_map<char , int>mpps;

        for(int i = 0 ; i < m ; i++){
            mpp[p[i]]++;
        }

        int left = 0;
        int right = 0;

        vector<int>ans;

        while(right < n){
            mpps[s[right]]++;

            if(right - left + 1 > m){
                mpps[s[left]]--;

                if(mpps[s[left]] == 0){
                    mpps.erase(s[left]);
                }
                left++;
            }

            if(right - left + 1 == m){
                if(mpps == mpp){
                    ans.push_back(left);
                }
            }

            right++;


        }
        return ans;


        
    }
};