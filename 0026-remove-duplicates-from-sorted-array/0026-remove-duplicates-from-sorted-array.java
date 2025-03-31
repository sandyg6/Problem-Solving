class Solution {
    public int removeDuplicates(int[] nums) {
        // int distinct = 0;
        int idx = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[idx] == nums[j]){
                continue;
            }
            else{
                idx++;
                nums[idx] = nums[j];
            }
        }
        return idx + 1;
    }
}