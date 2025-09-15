class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count =0;
        for(String str : arr){
            boolean canType = true;
            for(char ch : brokenLetters.toCharArray()){
                if(str.indexOf(ch)!=-1){
                    canType = false;
                    break;
                }
            }
                if(canType){
                    count++;
                
            }
        }
        return count; 
    }
}