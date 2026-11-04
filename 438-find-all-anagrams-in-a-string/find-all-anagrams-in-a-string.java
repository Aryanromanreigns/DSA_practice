class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        if(n < m) return new ArrayList<>();

        HashMap<Character , Integer>mpp = new HashMap<>();

        for(int i = 0 ; i < m ; i++){
            mpp.put(p.charAt(i), mpp.getOrDefault(p.charAt(i),0)+1);
        }

        List<Integer>ans = new ArrayList<>();
        int low = 0;
        int high = 0;
        int cnt = 0;
        int k = m;

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(mpp.containsKey(ch)){
                mpp.put(ch , mpp.get(ch)-1);
                if(mpp.get(ch) == 0){
                cnt++;
                }
            }
            if(i - low + 1 == k){
                if(cnt == mpp.size()){
                    ans.add(low);
                }
                char left = s.charAt(low);
                if(mpp.containsKey(left)){
                    if(mpp.get(left) == 0){
                        cnt--;
                    }
                    mpp.put(left , mpp.get(left)+1);
                }
                low++;
            }
        }
        return ans;






        
    }
}