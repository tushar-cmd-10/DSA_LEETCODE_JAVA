class Solution {
    public int scoreOfString(String s) {
        int i=0,j=1;
        int sum = 0;
        while(j<s.length()){
            int n = (int) s.charAt(i);
            int m = (int) s.charAt(j);
            sum += Math.abs(m-n);
            i++;
            j++;
        }
        return sum;
    }
}