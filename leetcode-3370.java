class Solution {
    public int smallestNumber(int n) { 
    for(int i=0;i<100;i++){
        int x = (int)Math.pow(2,i);
        if(x>n) return x-1;
        else if(x==n) return x*2-1;
    }
    return 0;
    }
}