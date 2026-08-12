class Solution {
public:
    void func(string s , vector<string>&ans , int ind , string str){
        int n = s.size();

        if(ind == n){
            ans.push_back(str);
            return ;
        }
        if(isalpha(s[ind])){
        func(s , ans , ind+1 , str + (char)toupper(s[ind]));
        func(s , ans , ind+1 , str + (char)tolower(s[ind]));

        }
        else
        func(s , ans , ind+1 , str+s[ind]);

        
    }
    vector<string> letterCasePermutation(string s) {
        vector<string>ans;
        string str;
        func(s , ans , 0 , str);
        return ans;
        
        
    }
};