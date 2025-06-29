class Solution {
    public int maxAscendingSum(int[] nums) {
        int ascSum = nums[0], maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1])
                ascSum = nums[i];
            else ascSum = ascSum + nums[i];
            maxSum = Math.max(ascSum, maxSum);
        }
        return maxSum;
    }
}