class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int num: hm.keySet()){
            if(hm.get(num) == 2){
                result[0] = num;
                break;
            }
        }

        for(int i = 1; i <= n; i++){
            if(!hm.containsKey(i)){
                result[1] = i;
                break;
            }
        }

        return result;
    }
}