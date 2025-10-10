class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            int count =0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=ele && ele>nums[i]){
                    count++;
                }
            }
            map.put(ele,count);
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]= map.get(nums[i]);
        }
        return arr;
    }
}