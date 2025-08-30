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
        String currentWord = "";
        int l = s.length();

        // count words correctly (ignore multiple spaces)
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String words[] = new String[count];

        int index = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != ' ') {
                currentWord += (s.charAt(i));
            } else {
                if (!currentWord.equals("")) {   // only add non-empty word
                    words[index] = currentWord;
                    currentWord = "";
                    index++;
                }
            }
        }
        if (!currentWord.equals("")) {
            words[index] = currentWord;
        }

        reverse(words);

        String ans = "";
        for (int i = 0; i < words.length; i++) {
            ans += words[i];
            if (i != words.length - 1) {
                ans += " ";
            }
        }

        return ans;
    }
}
