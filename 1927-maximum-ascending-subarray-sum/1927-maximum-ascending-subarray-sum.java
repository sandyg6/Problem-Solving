class Solution {
    public int maxAscendingSum(int[] nums) {
        int ascSum = nums[0], maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            ascSum = nums[i] > nums[i-1] ? ascSum + nums[i] : nums[i];
            maxSum = Math.max(ascSum, maxSum);
        }
        return maxSum;
    }
}