class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int dist = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                int ans = Math.abs(i - start);
                dist = Math.min(ans, dist);
            }
        }
        return dist;
    }
}