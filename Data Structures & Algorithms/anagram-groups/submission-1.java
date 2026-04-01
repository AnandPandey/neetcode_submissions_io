class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String i : strs) {
            char[] ch = i.toCharArray();   
            Arrays.sort(ch);
            String key= new String(ch);

            if (map.containsKey(key)) {
                map.get(key).add(i);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(i);
                map.put(key, temp);
            }
        }

        return new ArrayList<>(map.values());
    }
}