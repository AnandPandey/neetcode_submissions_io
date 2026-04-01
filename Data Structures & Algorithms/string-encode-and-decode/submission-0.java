class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for (String s : strs) {
            String encoded = s.length() + "/" + s;
            res += encoded;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int e = i;
            while (e < str.length() && str.charAt(e) != '/') {
                e++;
            }
            int size = Integer.parseInt(str.substring(i, e));
            String word = str.substring(e + 1, e + 1 + size);
            i = e + 1 + size;
            res.add(word);
        }
        return res;
    }
}
