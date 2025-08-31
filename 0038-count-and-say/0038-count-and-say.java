class Solution {
    public String countAndSay(int n) {
     if(n==1){
        return "1";
     }   

     String prev = countAndSay(n-1);
     int count = 1;
     char prevChar = prev.charAt(0);
     StringBuilder sb = new StringBuilder();


     for(int i = 1;i<prev.length();i++){
        char ch = prev.charAt(i);
        if(ch== prevChar ){
            count++;
        }
        else{
            sb.append(count).append(prevChar);
            count = 1;
            prevChar = ch;     
               }
     }

      sb.append(count).append(prevChar);
        
        return sb.toString();

    }



}