class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> max_dq = new ArrayDeque<Integer>();
        int[] max_of_windows = new int[n-k+1];
        for(int i=0; i<n; i++){
            if(!max_dq.isEmpty() && max_dq.peekFirst()<=i-k)
                max_dq.pollFirst();
            while(!max_dq.isEmpty() && nums[max_dq.peekLast()]<=nums[i])
                max_dq.pollLast();
            max_dq.offerLast(i);
            if(i>=k-1) max_of_windows[i-k+1] = nums[max_dq.peekFirst()];
        }
        return max_of_windows;
    }
}
