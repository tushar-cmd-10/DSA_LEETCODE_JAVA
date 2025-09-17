class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n= nums2.length;
        int m = nums1.length;
        // if(n==m){

        // }
        if(n<=m){
            for(int ele : nums2){
                if(map.containsKey(ele)){
                    int freq = map.get(ele);
                    map.put(ele,freq+1);
                }
                else{
                    map.put(ele,1);
                }
            }
        for(int ele : nums1){
            if(map.containsKey(ele)){
                if(map.get(ele)>0){
                    list.add(ele);
                    map.put(ele,map.get(ele)-1);
                }
            }
        }

        }
        if(m<n){
            for(int ele : nums1){
                if(map.containsKey(ele)){
                    int freq = map.get(ele);
                    map.put(ele,freq+1);
                }
                else{
                    map.put(ele,1);
                }
            }
            for(int ele : nums2){
            if(map.containsKey(ele)){
                if(map.get(ele)>0){
                    list.add(ele);
                    map.put(ele,map.get(ele)-1);
                }
            }
        }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}