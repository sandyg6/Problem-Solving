class Solution {
    public boolean isEvenCount(int num){
        int n = (int)Math.log10(num) + 1;
        return n % 2 == 0 ? true : false;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(isEvenCount(num)) count++;
        }
        return count;
    }
}