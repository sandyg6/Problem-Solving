class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] twoSum = new int[2];
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum > target) right--;
            else if(sum < target) left++;
            else{
                twoSum[0] = left+1;
                twoSum[1] = right+1;
                break;
            }
        }
        return twoSum;
    }
}