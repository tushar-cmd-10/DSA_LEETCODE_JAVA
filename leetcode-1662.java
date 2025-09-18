class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb =  new StringBuilder();
        StringBuilder sc = new StringBuilder();
        for(String ele : word1){
            sb.append(ele);
        }
         for(String ele : word2){
            sc.append(ele);
        }
        if(sb.toString().equals(sc.toString())) return true;
        return false;
    }
}