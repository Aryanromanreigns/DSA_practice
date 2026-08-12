class Solution {
public:
    void func(string &digits , unordered_map<char , string>&mpp , vector<string>&ans ,
    int i , string s){
        int n = digits.size();
        if(i == n){
            ans.push_back(s);
            return ;
        }

        string letter = mpp[digits[i]];
        for(int ind = 0 ; ind < letter.size() ; ind++){
            s += letter[ind];
            func(digits , mpp , ans , i+1 , s);
            s.pop_back();
        }


    }

    vector<string> letterCombinations(string digits) {
        unordered_map<char , string>mpp;
        mpp['2'] = "abc";
        mpp['3'] = "def";
        mpp['4'] = "ghi";
        mpp['5'] = "jkl";
        mpp['6'] =  "mno";
        mpp['7'] = "pqrs";
        mpp['8'] = "tuv";
        mpp['9'] = "wxyz";

        vector<string>ans;
        string s;

        func(digits , mpp , ans , 0 ,s);

        return ans;
        
    }
};