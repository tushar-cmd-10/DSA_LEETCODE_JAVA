class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
       ArrayList<Integer> list = new ArrayList<>();
       Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            set.add(nums[i]);
        }
       for(int ele: set){
        if(list.size()<k){
            list.add(ele);
        }
       }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]= list.get(i);
        }
        return arr;
    }
}