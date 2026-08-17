class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int m = flowerbed.size();
        if(n == 0)return true;
        if(m == 1) {
            if(flowerbed[0] == 0) n--;
            return n == 0;
        }
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
            if(n == 0)return true;
        }
        for(int i = 1 ; i < m-1 ; i++){
            if(flowerbed[i] == 0 && flowerbed[i-1] == 0 &&
                 flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                n--;
                i++;
                if(n == 0)return true;

            }
        }
        if(flowerbed[m-1] == 0 && flowerbed[m-2] == 0){
            flowerbed[m-1] = 1;
            n--;
             if(n == 0)return true;
        }
  
            return false;

        
    }
};