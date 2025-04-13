class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        hm.put(0,1);
        int n = nums.length;
        int preSum = 0;
        for(int i = 0; i < n; i++){
            preSum += nums[i];
            int rem = preSum - k; 
            count += hm.getOrDefault(rem, 0);
            hm.put(preSum, hm.getOrDefault(preSum, 0)+1);
        }
        return count;
    }
}