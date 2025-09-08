class Solution {
    public static String result(String a){
     Stack<Character> st = new Stack<>();
     for(int i = 0;i<a.length();i++){
        if(a.charAt(i)=='#'){
           if(!st.isEmpty()){
                st.pop();;
             }
        }
        else{
            st.push(a.charAt(i));
        }
     }
     StringBuilder s = new StringBuilder("");
     while(!st.isEmpty()){
        char ch = st.pop();
        s.append(ch);
     }
     return s.toString();
    }
    public boolean backspaceCompare(String s, String t) {
     String sS = result(s);
     String tT = result(t);
     
     if(sS.length()!= tT.length()){
        return false;
     }

     for(int i = 0;i<sS.length();i++){
        if(sS.charAt(i)!= tT.charAt(i)){
            return false;
        }
     }   
     return true;
    }
}