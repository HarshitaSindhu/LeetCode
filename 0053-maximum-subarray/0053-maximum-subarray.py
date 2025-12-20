class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentSum = 0
        result = nums[0]
        for i in range(len(nums)):
            currentSum += nums[i]
            result=max(currentSum , result)
            if currentSum <0:
                currentSum = 0
        return result         