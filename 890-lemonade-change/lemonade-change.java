class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;

        int five = 0;
        int ten = 0;
        int twen = 0;

        for(int i = 0 ; i < n ; i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10 ){
                if(five >= 1){
                ten++;
                five--;
                }
                else{
                    return false;
                }
            }
            else{

                if(ten >= 1 && five >= 1){
                    ten--;
                    five--;
                    twen++;
                }
                else if(five >= 3 ){
                    five -= 3;
                    twen++;
                }else{
                    return false;
                }

            }
        }
        return true;
        
    }
}