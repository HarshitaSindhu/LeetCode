class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
       n=len(nums)
       k=k%n
       result = [0]*n
       for i in range(len(nums)):
        newindex=(k+i)%n
        result[newindex]=nums[i]
      
       for i in range(len(nums)):
        nums[i] = result[i]

        