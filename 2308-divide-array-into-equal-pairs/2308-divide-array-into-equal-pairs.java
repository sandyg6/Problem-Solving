class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];

        for(int num: nums){
            freq[num]++;
        }
        for(int i = 0; i < 501; i++){
            if(freq[i] % 2 == 1){
                return false;
            }
        }
        return true;
    }
}