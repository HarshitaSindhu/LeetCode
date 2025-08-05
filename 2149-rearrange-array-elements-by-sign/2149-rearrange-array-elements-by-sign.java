class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        int i =0;
        while(i<n){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
            i++;
        }
       

       int p =0;
       int q= 0;

       for(int j= 0;j<n;j++){
        if(j%2==0){
            nums[j] = pos.get(p);
            p++;
        }
        else{
            nums[j]= neg.get(q);
            q++;
        }
       }
       return nums;
    }
}