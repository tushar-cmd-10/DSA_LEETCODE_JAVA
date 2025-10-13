class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        ArrayList<String> list = new ArrayList<>();
        int i=0,j=1;
        while(j<arr.length-1){
            if(arr[i].equals(first) && arr[j].equals(second)){
                list.add(arr[j+1]);
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        String[] nums = new String[list.size()];
        for(int x=0;x<list.size();x++){
            nums[x] = list.get(x);
        }
        return nums;
    }
}