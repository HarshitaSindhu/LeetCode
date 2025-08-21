class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord)){
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        Map<String  , Integer> distance = new HashMap<>();
        distance.put(beginWord , 1);

        while(!queue.isEmpty()){
            String currentWord = queue.poll();
            int currentDistance = distance.get(currentWord);


            if(currentWord.equals(endWord)){
                return currentDistance;
            }


            char[] wordArray = currentWord.toCharArray();

          for(int i = 0;i<wordArray.length;i++){
            char originalChar = wordArray[i];
            for(char ch = 'a';ch<='z';ch++){
            if(ch != originalChar){
                wordArray[i] = ch;
                String newWord = new String(wordArray);

                if(wordSet.contains(newWord) && !distance.containsKey(newWord)){
                    queue.add(newWord);
                    distance.put(newWord , currentDistance+1);
                }
            }
          }
          wordArray[i] = originalChar;

          }
        }
        return 0;
    }
}