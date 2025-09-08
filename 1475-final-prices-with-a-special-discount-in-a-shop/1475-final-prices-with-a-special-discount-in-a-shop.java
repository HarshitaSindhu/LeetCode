class Solution {
    public int[] finalPrices(int[] prices) {
      
        int answer[] = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            answer[i] = prices[i]; // Default value before checking discounts
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    answer[i] = prices[i] - prices[j];
                    break;
                }
                else {
                    answer[i] = prices[i];
                }
            }
        }
        return answer;
    }
}





        
        