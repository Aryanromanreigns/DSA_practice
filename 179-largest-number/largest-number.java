class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        String s[] = new String [n];

        for(int i = 0 ; i < n ; i++){
            s[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(s , (a , b) -> {
            return (b + a).compareTo(a + b);
        });

        String ans = "";

        for(int i = 0 ; i < s.length; i++){
            ans += s[i];
        }

        if(ans.charAt(0) == '0')return "0";
        else{
            return ans;
        }





        
    }
}