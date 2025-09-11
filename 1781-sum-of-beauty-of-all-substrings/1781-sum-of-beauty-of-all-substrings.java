class Solution {
    
  public int minfreq(int[] fre){
    int minCount = Integer.MAX_VALUE;
        for(int i =0;i<26;i++){
            if(fre[i]!=0){
            minCount = Math.min(minCount, fre[i]);
        }
        }
        return minCount;
  }

  public int maxfreq(int[] fre){
    int maxCount = 0;
    for(int i =0 ;i<26;i++){
       maxCount = Math.max(maxCount ,fre[i] );

    }
    return maxCount;
  }

    public int beautySum(String s) {
        int n = s.length();
        int sum = 0; 
        for(int i = 0;i<n;i++){
          int[] fre = new int[26];
          for(int j = i;j<n;j++){
            fre[(s.charAt(j))-'a']++;
            int beauty = maxfreq(fre)- minfreq(fre);
          
          sum+= beauty;
        }
        }
        return sum;
    }
}