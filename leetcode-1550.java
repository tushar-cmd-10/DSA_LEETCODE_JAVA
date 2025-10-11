class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3) return false;
        if(arr[0]%2==1){
            if(arr[1]%2==1 && arr[2]%2==1) return true;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]%2==1){
                if(arr[i-1]%2==1 && arr[i+1]%2==1){
                    return true;
                }
            }
        }
        return false;
    }
}