class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> elements = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> it: hm.entrySet()){
            int val = it.getValue();
            if(val > n/3) elements.add(it.getKey());
        }

        return elements;
    }
}