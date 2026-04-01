class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> allcombinations = new ArrayList<>();
        getallCombinations(nums, new ArrayList<>(), 0, allcombinations,target);
        return allcombinations;
    }
    public void getallCombinations(int[] nums, List<Integer> ans, int i, List<List<Integer>> allcombinations,int target) {
        if (target==0) {
            allcombinations.add(new ArrayList<>(ans)); 
            return;
        }
        if(i>=nums.length || target<0) return;
        ans.add(nums[i]);
        getallCombinations(nums, ans, i , allcombinations,target-nums[i]);
        ans.remove(ans.size() - 1);
        getallCombinations(nums, ans, i + 1, allcombinations,target);
    }
}
