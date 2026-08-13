class Solution {
public:
    void func(string &a , string &b , int i , int j , int carry , string &ans){
        if(i < 0 && j < 0 ){
            if(carry){
                ans += carry + '0';
            }
            return;
        }

        int x = 0;
        int y = 0;

        if(i >= 0){
            x = a[i] - '0';
        }

        if(j >= 0){
            y = b[j] - '0';
        }

        int sum = x + y + carry;
        ans += sum % 10 + '0';

        func(a , b , i-1 , j-1 , sum/10 , ans);



    }
    string addStrings(string a, string b) {
        int n = a.size();
        int m = b.size();

        string ans;
        func(a , b , n-1 , m-1 , 0 ,ans);
        reverse(ans.begin() , ans.end());
        return ans;


        
    }
};