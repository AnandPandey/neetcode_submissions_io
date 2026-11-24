class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            String key = get_key(s);
            if(map.containsKey(key))
                map.get(key).add(s);
            else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(key,temp);
            }

        }
        return new ArrayList<>(map.values());
    }
    public String get_key(String s){
        int[] frequency = new int[26];
        for(char ch: s.toCharArray()){
                frequency[ch -'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int c: frequency){
                sb.append(c).append("#");
            }
            String key = sb.toString();
            return key;
    }
}
