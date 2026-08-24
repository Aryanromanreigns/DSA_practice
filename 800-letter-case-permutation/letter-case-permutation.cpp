class Solution {
public:
    void func(int ind , string s , vector<string>&ans,
        string str)
    {
        if(ind == s.size()){
            ans.push_back(str);
            return;
        }

        if(isalpha(s[ind])){
            func(ind + 1 , s , ans , str + (char)toupper(s[ind]));
            func(ind + 1 , s , ans , str + (char)tolower(s[ind]));
        }
        else{
            func(ind + 1 , s , ans , str + s[ind]);
        }
        
    }
    vector<string> letterCasePermutation(string s) {
        int n = s.size();
        vector<string>ans;
        string str;
        func(0 , s , ans , str);
        return ans;
        
    }
};