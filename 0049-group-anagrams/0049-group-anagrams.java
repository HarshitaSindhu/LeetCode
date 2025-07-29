import java.util.*;

class Solution {
    public String SortedString(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String result = new String(arr);
        return result;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String , List<String>> m = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String copy = strs[i];
            String res = SortedString(copy);

            if(m.containsKey(res)){
                m.get(res).add(strs[i]);

            }
            else{
                List<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                m.put(res, new ArrayList<>(arr));
            }
        }
         for (String key : m.keySet()) {
            List<String> currentRow = m.get(key);
            answer.add(currentRow);  
         }

         
        return answer;
    }
}