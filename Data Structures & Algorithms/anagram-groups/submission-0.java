class Solution {

    public boolean isAnagram(String s , String t){
        if (s.length()!= t.length()) {
            return false;
        }
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> r_arr = new ArrayList<>();
        int[] arr = new int[strs.length]; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                continue;
            }
            List<String> lst = new ArrayList<>();
            lst.add(strs[i]);
            arr[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] != 1) {
                    if (isAnagram(strs[i], strs[j])) {
                        lst.add(strs[j]);
                        arr[j] = 1;
                    }
                }
            }
            r_arr.add(lst);
        }
        return r_arr;
    }
}