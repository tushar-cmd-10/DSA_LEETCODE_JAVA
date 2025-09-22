class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            } 
            else{
                map.put(ele,1);
            }
        }
        int max =0;
        for(int ele :nums){
            if(map.get(ele)>max){
                max=map.get(ele);
            }
        }
        int ans = 0;
        for(int ele: map.keySet()){
            if(map.get(ele)==max){
                ans = ans + map.get(ele);
            }
        }
        return ans;
    }
}