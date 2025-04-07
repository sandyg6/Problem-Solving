class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int posInd = 0, negInd = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0)
                pos[posInd++] = nums[i];
            else
                neg[negInd++] = nums[i];
        }

        for(int i = 0; i < n/2; i++){
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
        }

        return nums;
    }
}