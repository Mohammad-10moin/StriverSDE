package arrays.stock;

public class Solution_0ms {
    public static void main(String[] args) {
        int[] prices={3,3,5,0,0,3,1,4};
        int buy = prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            } else if ((prices[i]-buy)>profit) {
                profit=prices[i]-buy;
            }
        }
        System.out.println(profit);
    }
}
