class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums){
            set.add(ele);
        }
        int temp = original;
        int count =0;
        for(int ele: nums){
            if(set.contains(temp)){
                temp = temp*2;
            }
            else{
                break;
            }
        }
        return temp;
    }
}