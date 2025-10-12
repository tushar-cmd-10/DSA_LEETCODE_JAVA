class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String st = words[i];
            for(int j=0;j<st.length();j++){
                if(st.indexOf(x)!=-1){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}