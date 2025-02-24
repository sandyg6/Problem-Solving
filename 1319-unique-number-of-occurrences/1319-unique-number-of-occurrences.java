class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int key: hm.keySet()){
            int value = hm.get(key);
            if(set.contains(value)){
                return false;
            }
            else{
                set.add(value);
            }
        }
        return true;
    }
}