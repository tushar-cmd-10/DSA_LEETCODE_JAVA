class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size()) return false;  
        for(int i=0;i<words.size();i++){
            String st = words.get(i);
            if(st.charAt(0)!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}