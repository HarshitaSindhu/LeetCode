class Solution {
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        getAllCombinations(candidates, 0, target, ans, combin);
        return ans;
    }

    private void getAllCombinations(int[] arr, int idx, int target, List<List<Integer>> ans, List<Integer> combin) {
        if (idx == arr.length || target < 0) {
            return;
        }

        if (target == 0) {
            if (!set.contains(combin)) {
                ans.add(new ArrayList<>(combin));
                set.add(new ArrayList<>(combin));
            }
            return;
        }

        combin.add(arr[idx]);
        getAllCombinations(arr, idx, target - arr[idx], ans, combin);

        combin.remove(combin.size() - 1);
        getAllCombinations(arr, idx + 1, target, ans, combin);
    }
}
