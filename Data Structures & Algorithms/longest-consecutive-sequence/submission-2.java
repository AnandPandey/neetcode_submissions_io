class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int max_count=0;
        for(int i: nums){
            set.add(i);
        }
        for (int i:nums){
            if (!set.contains(i-1)){
                int curr = i;
                int count = 1;
                while (set.contains(curr+1)){
                    count++;
                    curr++;
                }
                max_count = Math.max(count, max_count);
            }
        }
        return max_count;
    }
}
