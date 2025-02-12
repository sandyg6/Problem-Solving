class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] arr = Arrays.copyOf(nums, n);
        Arrays.fill(nums, '_');
        int j = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != val){
                nums[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}