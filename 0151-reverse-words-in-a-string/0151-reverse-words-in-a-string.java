class Solution {

    public static void reverse(String[] words, int len) {
        int i = 0;
        int j = len - 1;

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
        String[] words = new String[n]; // max possible words
        int index = 0;
        String currentWord = "";
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                currentWord += c;
            } else {
                if (!currentWord.isEmpty()) {
                    words[index++] = currentWord;
                    currentWord = "";
                }
            }
        }

        if (!currentWord.isEmpty()) {
            words[index++] = currentWord;
        }

        reverse(words, index);

        return String.join(" ", java.util.Arrays.copyOfRange(words, 0, index));
    }
}
