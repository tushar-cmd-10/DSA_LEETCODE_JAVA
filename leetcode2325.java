class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=0;i<key.length();i++){
            int num = 97+idx;
            char ch = (char) num;
            char k = key.charAt(i);
            if(k!=' ' && !map.containsKey(k)){
            map.put(k,ch); 
            idx++;
            }
        }
        for(char ele : message.toCharArray()){
            if(ele==' '){
                sb.append(' ');
            }
            else{
                sb.append(map.get(ele));
            }
        }
        return sb.toString();
    }
}   