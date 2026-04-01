class Solution {
    public boolean isAnagram(String s, String t) {
        /*if (s.length()!= t.length()) {
            return false;
        }
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);*/
        if (s.length() != t.length()) return false;
        HashMap <Character,Integer> map= new HashMap<>();
        for (char i: s.toCharArray()){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }
            
        }
        for (char j: t.toCharArray()){
            if (map.containsKey(j)){
                map.put(j, map.get(j) - 1);
            }else{
            return false;
        }
            
        }
        for (int i: map.values()){
            if (i!=0){
                return false;
            }
                
        }return true;
        
    }
}
