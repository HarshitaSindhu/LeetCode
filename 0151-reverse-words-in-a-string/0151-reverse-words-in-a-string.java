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
        int l = s.length();
        String currentWord = "";
        ArrayList<String> wordList = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    wordList.add(currentWord);
                    currentWord = "";
                }
            }
        }

        if (!currentWord.equals("")) {
            wordList.add(currentWord);
        }

        String[] words = wordList.toArray(new String[0]);
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
