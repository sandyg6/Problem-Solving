class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if( n == 0)
            return new int[] {-1, -1};
        int left = 0;
        int right = n - 1;
        int mid = -1;
        int firstOccInd = -1;
        while(left <= right){
            mid = (left+right) / 2;
            if(nums[mid] == target) {
                firstOccInd = mid;
                right = mid - 1;
            }
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }


        left = 0;
        right = n - 1;
        mid = -1;
        int lastOccInd = -1;
        while(left <= right){
            mid = (left+right) / 2;
            if(nums[mid] == target) {
                lastOccInd = mid;
                left = mid + 1;
            }
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        
        return new int[] {firstOccInd, lastOccInd};
    }
}