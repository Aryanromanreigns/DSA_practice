class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);

        int i = 0;
        int last = n-1;
        int cnt = 0;

        while(i <= last){
            if(people[i] + people[last] <= limit){
                i++;
            }
            last--;
            cnt++;
        }
        return cnt;


        
    }
}