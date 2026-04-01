class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            if (freq[ch - 'A'] > maxFreq)
                maxFreq = freq[ch - 'A'];

            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
            }
            windowSize = right - left + 1;
            if (windowSize > answer)
                answer = windowSize;
        }
        return answer;
    }
}
