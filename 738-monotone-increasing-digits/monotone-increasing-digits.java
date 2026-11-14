class Solution {
    public int monotoneIncreasingDigits(int n) {
        String s = Integer.toString(n);
        int nn = s.length();
        int k = nn;

        char[] arr = s.toCharArray();

        for(int i = nn-1 ; i > 0 ; i--){
            if(arr[i-1] > arr[i]){
                arr[i-1]--;
                k = i-1;
            }
        }

        for(int i = k+1 ; i < nn ; i++){
            arr[i] = '9';
        }

        String ans = new String(arr);
        int answer = Integer.parseInt(ans);

        return answer;



    }
}