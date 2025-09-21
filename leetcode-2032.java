class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(int ele : nums1){
            set1.add(ele);
        }
        for(int ele : nums2){
            set2.add(ele);
        }
        for(int ele : nums3){
            set3.add(ele);
        }
        for(int ele : nums1){
            if(set2.contains(ele) || set3.contains(ele)){
                 if(!list.contains(ele)){
                list.add(ele);
                 }
            }
        }
        for(int ele : nums2){
            if(set1.contains(ele) || set3.contains(ele)){
                 if(!list.contains(ele)){
                list.add(ele);
                 }
            }
        }
        for(int ele : nums3){
            if(set1.contains(ele) || set2.contains(ele)){
                if(!list.contains(ele)){
                list.add(ele);
                }
            }
        }
        return list;
    }
}