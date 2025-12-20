class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice = prices[0]
        maxPrice=0
        for i in range(len(prices)):
            minPrice= min(prices[i] , minPrice )
            maxPrice= max(maxPrice , prices[i]- minPrice)
        return maxPrice    
        