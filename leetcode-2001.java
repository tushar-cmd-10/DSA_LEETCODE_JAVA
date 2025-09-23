class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count =0;
        for(String ele : operations){
            if(ele.indexOf('-')!=-1){
                count--;
            }
            else{
                count++;
            }
        }
        return count;
    }
}