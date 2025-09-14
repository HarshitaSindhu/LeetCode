import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> combin = new ArrayList<>();
        combineSum(1, k, n, ans, combin);
        return ans;
    }

    private void combineSum(int start, int k, int target, List<List<Integer>> ans, ArrayList<Integer> combin) {
        if (combin.size() == k && target == 0) {
            ans.add(new ArrayList<>(combin));
            return;
        }
        if (combin.size() > k || target < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            // Include current number
            combin.add(i);
            combineSum(i + 1, k, target - i, ans, combin);
            // Backtrack: remove the last number added
            combin.remove(combin.size() - 1);
        }
    }
}
