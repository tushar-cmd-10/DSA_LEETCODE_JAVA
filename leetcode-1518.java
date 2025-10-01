class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int temp = numBottles;
       int count = numBottles;
       while(temp>=numExchange){
        int newBottles = temp/numExchange;
        count = count + newBottles;
        temp = temp % numExchange + newBottles ;
       }
       return count;
       
    }
}