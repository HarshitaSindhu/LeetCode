class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        pos = []
        neg = []
        for i in nums:
            if i<0:
                neg.append(i)
            else:
                pos.append(i)    
        answer = [0]*n 
        p = 0
        q = 0
        for k in range(n):
            if k%2== 0:
                answer[k] = pos[p]
                p+=1
            else:
                answer[k] = neg[q]
                q+=1
        return answer               