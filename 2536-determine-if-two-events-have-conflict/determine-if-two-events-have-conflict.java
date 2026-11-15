class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String fone = event1[0];
        String  ftwo = event1[1];

        String  sone = event2[0];
        String  stwo = event2[1];

        if(ftwo.compareTo(sone) >= 0 && stwo.compareTo(fone) >= 0){
            return true;
        }
        return false;
        
    }
}