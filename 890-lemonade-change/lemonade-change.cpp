class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int n = bills.size();
        int cntfive = 0 , cntten = 0 , cnttwo = 0;
        int i = 0;

        while(i < n ){
            if(bills[i] == 5){
                cntfive++;
            }
            else if(bills[i] == 10 ){
                if(cntfive == 0)return false;
                cntten++;
                cntfive--;
            }
            else{
                

                if(cntfive > 0 && cntten > 0){
                    cntfive--;
                    cntten--;
                }
                else if(cntfive >= 3){
                    cntfive -= 3;
                }
                else{
                    return false;
                }
            }
            i++;
        }
        if(i == n)return true;
        return false;
        
    }
};