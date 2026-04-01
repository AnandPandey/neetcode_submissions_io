class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) {
            return false;
        }
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int right = 0;
        StringBuilder sb = new StringBuilder();
        while (right < s1.length()) {
            sb.append(s2.charAt(right));
            right++;
        }
        if (isAnagram(sb.toString(), s1)) return true;
        while (right < s2.length()) {
            sb.deleteCharAt(0);
            sb.append(s2.charAt(right));
            right++;
            if (isAnagram(sb.toString(), s1)) return true;
        }
        return false;
    }
}
