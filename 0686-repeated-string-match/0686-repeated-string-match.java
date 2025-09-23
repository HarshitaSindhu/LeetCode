class Solution {
    public int repeatedStringMatch(String a, String b) {
        String repeated = a;
        int count = 1;
        while(repeated.length()<b.length()){
            repeated+=a;
            count++;
        } 
        if(repeated.contains(b)){
            return count;
        }

        repeated +=a;
        count++;
         if(repeated.contains(b)){
            return  count;
        }
        return -1;
    }
}