class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<n-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int required = 0 - nums[i];
            int left=i+1;
            int right=n-1;
            while (left<right){
                if (nums[left]+nums[right]<required){
                    left+=1;
                }
                    
                else if (nums[left]+nums[right]>required){
                    right-=1;
                }
                    
                else{
                    result.add(Arrays.asList(nums[left],nums[i],nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left+=1;
                    right-=1;
                }
            }
             
        }
        return result;
    }
}
