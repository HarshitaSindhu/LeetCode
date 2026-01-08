class Solution:
    def check(self, nums: List[int]) -> bool:
        n = len(nums)
        count = 0
        for i in range(len(nums)):
            if nums[i]>nums[(i+1)%n]:
                count+=1

        if count>1:
            return False

        return True
