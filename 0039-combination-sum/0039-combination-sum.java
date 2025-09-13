class Solution {
    Set<List<Integer>> set = new HashSet<>(); // To avoid duplicates

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
            if (!set.contains(combin)) {  // Check if this combination is already present
                ans.add(new ArrayList<>(combin)); // Add a copy of the combination
                set.add(new ArrayList<>(combin)); // Store it in the set to avoid duplicates
            }
            return;
        }

        // Choose current element
        combin.add(arr[idx]);
        // Explore including the current element (can pick it unlimited times)
        getAllCombinations(arr, idx, target - arr[idx], ans, combin);

        // Explore excluding the current element and moving to next index
        combin.remove(combin.size() - 1); // Backtrack before exploring exclusion
        getAllCombinations(arr, idx + 1, target, ans, combin);
    }
}
