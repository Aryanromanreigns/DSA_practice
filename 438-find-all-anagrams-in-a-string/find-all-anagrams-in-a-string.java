class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        HashMap<Character , Integer>mpp = new HashMap<>();
        HashMap<Character , Integer>mpps = new HashMap<>();

        for(int i = 0 ; i < m ; i++){
            mpp.put(p.charAt(i) , mpp.getOrDefault(p.charAt(i),0)+1);
        }


        int left = 0;
        int right = 0;
        List<Integer>arr = new ArrayList<>();

        while(right < n){
            mpps.put(s.charAt(right) , mpps.getOrDefault(s.charAt(right),0)+1);

            if(right - left + 1 > m){
                mpps.put(s.charAt(left) , mpps.get(s.charAt(left))-1);

                if(mpps.get(s.charAt(left)) == 0){
                    mpps.remove(s.charAt(left));
                }
                left++;
            }

            if(right - left + 1 == m){
                if(mpps.equals(mpp)){
                    arr.add(left);
                }
            }

            right++;
        }
        return arr;

        
    }
}