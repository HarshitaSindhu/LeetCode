class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
         int i = 0;
        while(i<n){
            if(nums[i]<0){
                neg.add(nums[i]);
                i++;
            }
            else{
                pos.add(nums[i]);
                i++;
            }
        }
       int p= 0;
       int q = 0;
       for(int k =0;k<n;k++ ){
        if(k%2==0){
            nums[k] = pos.get(p);
            p++;
        }
        else{
            nums[k]= neg.get(q);
            q++;
        }
       }
       return nums;
    }
}