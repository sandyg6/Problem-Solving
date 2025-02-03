class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i< n; i++){
            l.add(index[i], nums[i]);
        }
        for(int i = 0; i < n;i++){
            nums[i] = l.get(i);
        }
        return nums;
    }
}