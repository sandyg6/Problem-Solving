class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];
        int b = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<n ;i++){
            b = target - nums[i];
            if(hm.containsKey(b)){
                res[0] = hm.get(b);
                res[1] = i;
                return res;
            } else{
                hm.put(nums[i], i);
            }
        }
        return res;
    }
}