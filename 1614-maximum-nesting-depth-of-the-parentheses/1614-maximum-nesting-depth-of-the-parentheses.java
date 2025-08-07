class Solution {
    public int maxDepth(String s) {
        int answer = 0;
        int count = 0;
        for(int i = 0;i< s.length();  i++){
            if(s.charAt(i)== '('){
                count++;
            }
            else if (s.charAt(i)==')'){
                count--;
            }
            answer =    Math.max(answer , count);
        }
        return answer;
    }
}