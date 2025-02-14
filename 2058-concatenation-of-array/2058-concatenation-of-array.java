class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = Arrays.copyOf(nums, 2*n);
        for(int i = n; i < 2*n; i++){
            ans[i] = nums[i - n];
        }
        return ans;
    }
}