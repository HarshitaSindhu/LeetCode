class Solution {
      public static boolean isPossible(long mid,int []arr,int k ,int n){
        int count =1;
        long time =0;
        for(int i=0;i<n;i++){
            if(time+arr[i]>mid){
                count ++;
                time=arr[i];
            }
            else {
                time +=arr[i];
            }
        }
        return (count <= k);
    }
    public int splitArray(int[] nums, int k) {
         int n= nums.length;
        long sum =0;
        long maxValue=0;
        for(int i =0;i<n;i++){
            sum +=nums[i];
            maxValue=Math.max(maxValue,nums[i]);
          
        }
          long start = maxValue;
            long end = sum;
            long answer = end;
            while(start<=end){
                long mid=(start+end)/2;
                if(isPossible(mid,nums,k,n)==true)
                {
                  answer =mid;
                  end = mid -1;
                    
                }
                else 
                {
                    start=mid+1;
                }
            }
            return (int)answer;
    }
}