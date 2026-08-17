class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int n = s.size();
        int m = p.size();

        unordered_map<char , int>need;
        for(int i = 0 ; i <m; i++){
            need[p[i]]++;
        }

        unordered_map<char , int>window;
        int left = 0;
        int right = 0;
        vector<int>ans;

        while(right < n){
            window[s[right]]++;

            if(right - left + 1 > p.size()){
                window[s[left]]--;

                if(window[s[left]] == 0){
                    window.erase(s[left]);
                }
                left++;
            }

            if(right - left + 1 == p.size()){
                if(window == need){
                    ans.push_back(left);
                }
            }
            right++;
        }
        return ans;


        
    }
};