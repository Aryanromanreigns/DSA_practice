class Solution {
    public boolean lemonadeChange(int[] bills) {
        Integer n = bills.length;
        Integer cfive = 0 , cten = 0 , ctwo = 0;

        for(Integer i = 0 ; i < n ; i++){
            if(bills[i] == 5){
                cfive++;
            }
            else if(bills[i] == 10){
                if(cfive == 0)return false;
                else{
                    cfive--;
                    cten++;
                }
            }
            else{
                if(cten > 0 && cfive > 0){
                    ctwo++;
                    cten--;
                    cfive--;
                }
                else if(cfive > 2){
                    cfive -= 3;
                    ctwo++;
                }
                else{
                    return false;
                }
            }

        }
        return true;
        
    }
}