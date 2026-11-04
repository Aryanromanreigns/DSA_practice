class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxi = 0;
        int low = 0;
        int high = 0;

        HashMap<Character , Integer>mpp = new HashMap<>();

        for(high = 0 ; high < n ; high++){
            mpp.put(s.charAt(high),mpp.getOrDefault(s.charAt(high),0)+1);

            while(mpp.get(s.charAt(high)) > 1){
                mpp.put(s.charAt(low) , mpp.get(s.charAt(low))-1);

                if(mpp.get(s.charAt(low)) == 0){
                    mpp.remove(s.charAt(low));
                }
                low++;
            }

            maxi = Math.max(high - low + 1 , maxi);

        }
        return maxi;
        
    }
}