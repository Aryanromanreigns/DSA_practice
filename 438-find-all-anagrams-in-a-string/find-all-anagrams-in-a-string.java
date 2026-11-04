class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()) return ans;

        HashMap<Character, Integer> mpp = new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        int low = 0;
        int high = 0;
        int k = p.length();
        int cnt = 0;

        while(high < s.length()){

            char ch = s.charAt(high);

            if(mpp.containsKey(ch)){
                mpp.put(ch, mpp.get(ch) - 1);

                if(mpp.get(ch) == 0){
                    cnt++;
                }
            }

            if(high - low + 1 == k){

                if(cnt == mpp.size()){
                    ans.add(low);
                }

                char left = s.charAt(low);

                if(mpp.containsKey(left)){

                    if(mpp.get(left) == 0){
                        cnt--;
                    }

                    mpp.put(left, mpp.get(left) + 1);
                }

                low++;
            }

            high++;
        }

        return ans;
    }
}