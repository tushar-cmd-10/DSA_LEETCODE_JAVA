class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char ele: allowed.toCharArray()){
            set.add(ele);
        }
        for(int i=0;i<words.length;i++){
            boolean isAllow = true;
            for(int j=0;j<words[i].length();j++){
                String s = words[i];
                char c = s.charAt(j);
                if(!set.contains(c)){
                    isAllow = false;
                }
            }
            if(isAllow) count++;
        }
        return count;
    }
}