class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder st = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                st.append(Character.toLowerCase(ch));
            }else if (Character.isDigit(ch)){
                st.append(ch);
            }
        }
        int i = 0;
        int j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}