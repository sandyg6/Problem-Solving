class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];

        //Identify the duplicated number
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] < 0) {
                result[0] = num;  // Duplicated number
            } else {
                nums[num - 1] = -nums[num - 1];  // Negate the number at index (num - 1)
            }
        }

        //Find the missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;  // The missing number is i + 1
                break;
            }
        }

        return result;
    }
}
