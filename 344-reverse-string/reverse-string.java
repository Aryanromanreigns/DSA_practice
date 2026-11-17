class Solution {
    public void func(char[] s , int st , int end){
        if(st >= end)return ;
        char temp = s[st];
        s[st] = s[end];
        s[end] = temp;

        func(s , st+1 , end-1);
    }
    public void reverseString(char[] s) {
        int n = s.length;
        func(s, 0 , n-1);
        
    }
}