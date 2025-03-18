class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int right = 0;
        int left = 0;

        int curr_sum = 0;
        int xor_sum = 0;
        int max_window_size = 0;
        while(right < n){
            curr_sum += nums[right];
            xor_sum ^= nums[right];

            while(xor_sum != curr_sum){
                curr_sum -= nums[left];
                xor_sum ^= nums[left];
                left++;
            }

            max_window_size = Math.max(max_window_size, right - left + 1);
            right++;
        }
        return max_window_size;
    }
}