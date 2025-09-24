class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int col = strs[0].length();
        int row = strs.length;
        for(int cols=0;cols<col;cols++){
            int j=1;
            for(int i=0;i<row-1;i++){
                int m = (int) strs[i].charAt(cols);
                int n = (int) strs[j].charAt(cols);
                if(m>n){
                    count++;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}