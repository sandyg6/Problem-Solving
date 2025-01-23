class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int counter = 0;
        for(int i = 0; i < n;i++){
            if(nums[i] != 0)
                nums[counter++] = nums[i];
        }
        while(counter < nums.length)
            nums[counter++] = 0;
    }
}