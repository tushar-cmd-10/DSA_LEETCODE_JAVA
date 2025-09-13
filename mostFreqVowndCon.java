class Solution {
    public boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> con = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char ele: arr){
            if(isVowel(ele)){
                if(vow.containsKey(ele)){
                    int freq = vow.get(ele);
                    vow.put(ele,freq+1);
                }
                else{
                    vow.put(ele,1);
                }
            }
            else{
                if(con.containsKey(ele)){
                    int freq = con.get(ele);
                    con.put(ele,freq+1);
                }
                else{
                    con.put(ele,1);
                }
            }
        }
        int maxV = 0;
        for(char ele :arr ){
            if(vow.containsKey(ele)){
                if(vow.get(ele)>maxV){
                    maxV = vow.get(ele);
                }
            }
        }
        int maxC = 0;
        for(char ele : arr ){
            if(con.containsKey(ele)){
                if(con.get(ele)>maxC){
                    maxC = con.get(ele);
                }
            }
        }
        return maxV +maxC;
    }
}