
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();
        int low = 0;
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) + 1);

            while (mpp.get(s.charAt(i)) > 1) {
                mpp.put(s.charAt(low), mpp.get(s.charAt(low)) - 1);

                if (mpp.get(s.charAt(low)) == 0) {
                    mpp.remove(s.charAt(low));
                }

                low++;
            }

            maxi = Math.max(maxi, i - low + 1);
        }

        return maxi;
    }
}
