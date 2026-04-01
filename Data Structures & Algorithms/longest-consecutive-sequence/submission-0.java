class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        int count=0;
        int max_count=0;
        for(int i: nums){
            set.add(i);
        }
        for (int i:nums){
            int num=i;
            count+=1;
            while (set.contains(num+1)){
                count+=1;
                num=num+1;
            }
            if (count>max_count){
                max_count=count;
            }
            count=0;
        }
        return max_count;
    }
}
