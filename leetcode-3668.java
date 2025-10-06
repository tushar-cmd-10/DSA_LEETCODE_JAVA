class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for(int ele: friends){
            set.add(ele);
        }
        int j=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                arr[j]=order[i];
                j++;
            }
        }
        return arr;
    }
}