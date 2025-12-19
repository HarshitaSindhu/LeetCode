class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxCount = 0
        count = 0
        for i in nums:
            if i ==1:
                count +=1
                maxCount = max(maxCount , count)
            else:
                count= 0            
        return maxCount        