class Solution:
    def sortColors(self, nums: List[int]) -> None:
        countZero = 0
        countOne= 0
        countTwo = 0

        for i in nums:
            if i == 0:
                countZero+=1
            elif i==1:
                countOne +=1
            else:
                countTwo +=1
        j = 0

        for i in range(countZero):
            nums[j]=0
            j+=1 

        for i in range(countOne):
            nums[j]=1
            j+=1             
        for i in range(countTwo):
            nums[j]=2
            j+=1  