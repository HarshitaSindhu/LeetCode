class Solution {

    public static void reverse(String words[]) {
        int i = 0;
        int j = words.length - 1;

        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseWords(String s) {
        int n = s.length();
        String words[] = new String[n];
        int index = 0;
        String currentWord = "";
        int count = 1;  
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != ' ') { 
                currentWord += c;
            } else {
                if (!currentWord.equals("")) {  
                    words[index] = currentWord;
                    index++;
                    currentWord = "";
                }
            }
        }

        if (!currentWord.equals("")) {
            words[index] = currentWord;
            index++;
        }

        String[] actualWords = new String[index];
        for (int i = 0; i < index; i++) {
            actualWords[i] = words[i];
        }

        reverse(actualWords);

        String ans = "";
        for (int i = 0; i < actualWords.length; i++) {
            ans += actualWords[i];
            if (i != actualWords.length - 1) {
                ans += " ";
            }
        }

        return ans;
    }
}
