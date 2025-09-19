class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(String ele : strs){
            boolean isInt = true;
            for(int i=0;i<ele.length();i++){
                if(Character.isLetter(ele.charAt(i))){
                    isInt = false;
                }
            }
            if(isInt){
                int m = Integer.parseInt(ele);
                if(m>max){
                    max=m;
                }
            }
            else{
                int n = ele.length();
                if(n>max){
                    max = n;
                }
            }
        }
        return max;
    }
}