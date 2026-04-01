class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left=0;
        int right=n-1;
        int res=0;
        while(left<right){
            int amount=Math.min(heights[left],heights[right])*(right-left);
            res=Math.max(res,amount);
            if (heights[left]< heights[right])
                left++;
            else
                right--;
        }
        return res;
    }
}
