class Solution {

   public static  void reverse(String[] words , int size){
    int i = 0;
    int j = size-1;
    while(i<j){
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
        i++;
        j--;
    }
   }

    public String reverseWords(String s) {
        String currentWord = "";
        int n =   s.length();
        int index= 0;
        String[] words = new String[n];
       for(int i = 0;i<n;i++){
        if(s.charAt(i)!=' '){
         currentWord+=s.charAt(i);
        }
        else{
            if(!currentWord.equals("")){
              words[index] = currentWord;
              currentWord ="";
              index++;
            }
        }
       }
        if(!currentWord.equals("")){
              words[index] = currentWord;
              index++;
        }
        reverse(words , index);

      String ans = "";
      for(int i = 0;i<index;i++){
        ans+=words[i];
        if(i!=index-1){
            ans+=" ";
        }
      }
      return ans;
    }
}