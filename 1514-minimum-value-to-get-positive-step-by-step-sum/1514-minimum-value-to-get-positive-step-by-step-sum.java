class Solution {
    public int minStartValue(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int runningSum = 0;
        for(int num: nums){
            runningSum += num;
            minSum = Math.min(minSum, runningSum);
        }
        return (minSum < 1) ? (-minSum + 1) : 1;
    }
}