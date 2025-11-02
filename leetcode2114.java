class Solution {
    public int mostWordsFound(String[] sentences) {
        int count =1;
        int maxCount = 0;
        for(int i=0;i<sentences.length;i++){
            String s = sentences[i];
            count =1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    count++;
                }
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}