class Solution {
    public int minStartValue(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int sum = 0;
        for(int num: nums){
            sum += num;
            if(sum < minVal) minVal = sum;
        }
        if(minVal < 0)
            return 1 - minVal;
        return 1;
    }
}