class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(String ele : words1){
            if(map1.containsKey(ele)){
                int freq = map1.get(ele);
                map1.put(ele,freq+1);
            }
            else{
                map1.put(ele,1);
            }
        }
        for(String ele : words2){
            if(map2.containsKey(ele)){
                int freq = map2.get(ele);
                map2.put(ele,freq+1);
            }
            else{
                map2.put(ele,1);
            }
        }
        int count = 0;
        for(String ele : words2){
            if(map1.containsKey(ele) && map2.containsKey(ele) && map1.get(ele)==1 && map2.get(ele)==1 ){
                count++;
            }
        }
        
        return count;
    }
}