class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max_window=0;
        for (int i=0; i<n; i++){
            Set<Character> set= new HashSet<>();
            for (int j=i; j<n; j++){
                char temp=s.charAt(j);
                if (set.contains(temp))
                    break;
                set.add(temp);
                max_window=Math.max(max_window,j-i+1);
            }
        }
        return max_window;
    }
}
