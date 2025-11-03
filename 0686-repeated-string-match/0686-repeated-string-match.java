class Solution {
    public int repeatedStringMatch(String a, String b) {
        String duplicate = a;
        int count = 1;
        while(duplicate.length()<b.length()){
           duplicate+=a;
           count++;
    }
        if(duplicate.contains(b)){
            return count;
        }
        duplicate+=a;
        count++;
        if(duplicate.contains(b)){
            return count;
        }
        return -1;
    }
}