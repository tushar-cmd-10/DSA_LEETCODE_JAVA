class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans = new String[names.length];
        for(int i=0;i<heights.length;i++){
            ans[i]= map.get(heights[ans.length-1-i]);
        }
    return ans;
    }
}