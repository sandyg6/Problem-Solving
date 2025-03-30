class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String s: strs){
            char[] s_arr = s.toCharArray();
            Arrays.sort(s_arr);
            String str = new String(s_arr);

            if(!hm.containsKey(str)){
                hm.put(str, new ArrayList<String>());
            }       
            hm.get(str).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}