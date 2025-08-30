class Solution {
    public static void reverse(String[]words,int size){
        int  i=0;
        int j =size-1;
        while(i<j){
            String temp =words[i];
            words[i]=words[j];
            words[j]=temp;
            i++;
            j--;
                    }

    }
    public String reverseWords(String s) {
        int n =s.length();
        String words[]= new String[n];
        int index=0;
        String currentword="";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                currentword=currentword + ch;

            }
            else {
                 if (!currentword.equals("")) {
            words[index] = currentword;
                currentword="";
                index ++;
                 }

            }
        }
         if (!currentword.equals("")) {
            words[index] = currentword;
            index++;
         }
          reverse(words, index);

        String ans = "";
        for (int i = 0; i < index; i++) {
            ans += words[i];
            if (i != index - 1) {
                ans += " ";
            }
        }
        return ans ;
    }
}