class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        m = {}
        n = len(nums)
        for i in range(n):
            complement = target -nums[i]
            if complement in m:
                return  [m[complement] , i]
            m[nums[i]]= i
        