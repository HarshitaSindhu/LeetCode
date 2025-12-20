class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        k=k%n
        result = [0] * n
        for i in range(0 , len(nums)):
            newIndex = (i+k)%n
            result[newIndex] = nums[i]


        for j  in range(len(nums)):
            nums[j] = result[j]
        