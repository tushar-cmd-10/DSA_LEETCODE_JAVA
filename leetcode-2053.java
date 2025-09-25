class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String ele  : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        }
        int count =0;
        for(String ele : arr){
            if(map.containsKey(ele) && map.get(ele)==1){
               if(count==k-1){
                return ele;
               }
               else{
                count++;
               }
            }
        }
        return "" ;
       
    }
}