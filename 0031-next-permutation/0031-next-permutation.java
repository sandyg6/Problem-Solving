class Solution {
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //find break point
        int ind = -1;
        for(int i = n-2; i >= 0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            reverse(nums, 0, n-1);
            return;
        }

        // find next greatest element
        for(int i = n-1; i > ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }

        // reverse remaining half
        reverse(nums, ind+1, n-1);
    }
}