class Solution {
    public String truncateSentence(String s, int k) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = s.split(" ");
        for(int i=0;i<k;i++){
            list.add(arr[i]);
        }
        String[] nums = new String[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        String res = String.join(" ",nums);
        return res;
    }
}