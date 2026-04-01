class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allsubsets = new ArrayList<>();
        getallSubsets(nums, new ArrayList<>(), 0, allsubsets);
        return allsubsets;
    }
    public void getallSubsets(int[] nums, List<Integer> ans, int i, List<List<Integer>> allsubsets) {
        if (i == nums.length) {
            allsubsets.add(new ArrayList<>(ans)); 
            return;
        }
        ans.add(nums[i]);
        getallSubsets(nums, ans, i + 1, allsubsets);
        ans.remove(ans.size() - 1);
        getallSubsets(nums, ans, i + 1, allsubsets);
    }
}