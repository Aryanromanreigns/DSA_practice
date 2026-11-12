class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length;
        int m = word2.length;

        

        String first = "";
        String second = "";

        for(int i = 0 ; i < n ; i++){
            first += word1[i];
        }
        for(int i = 0 ; i < m ; i++){
            second += word2[i];
        }

        int nn = first.length();
        int mm = second.length();

        if(nn != mm)return false;
        int i = 0;
        int j = 0;

        while(i < nn && j < mm){
            if(first.charAt(i) != second.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
        
    }
}