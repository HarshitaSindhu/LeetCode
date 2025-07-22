class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int zero = 0;
        Deque<Integer> q = new LinkedList<>();
        int answer =0;

        while(i<n){
            q.addLast(nums[i]);
            if(nums[i]==0){
                zero++;
            }
            while(q.size()>0&& zero>k){
                if(q.peekFirst()==0){
                    zero--;
                }
                q.removeFirst();
            }
            answer = Math.max(answer , (int)q.size());
            i++;
        }
        return answer;
    }
}