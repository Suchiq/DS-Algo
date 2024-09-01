class Solution {

    public int maxProfit(int[] prices) {
        
      int buy = prices[0];
      int currentProfit = 0;
      int maxProfit = 0;
        
      for(int i = 1; i<=prices.length-1; i++){
          
          if(prices[i]<buy){
              buy = prices[i];
          }else{
              currentProfit = prices[i]-buy;
              if(currentProfit>maxProfit){
                  maxProfit = currentProfit;
              }
          }
      }  
        return maxProfit;
}
}