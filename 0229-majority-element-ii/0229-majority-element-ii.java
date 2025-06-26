class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i < n; i++){
            if(count1 == 0 && nums[i] != element2){
                count1 = 1;
                element1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != element1){
                count2 = 1;
                element2 = nums[i];
            }
            else if(element1 == nums[i]) count1++;
            else if(element2 == nums[i]) count2++;
            else{
                count1--;count2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        int c1 = 0, c2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == element1) c1++;
            if(nums[i] == element2) c2++;
        }
        int mini = (int)(n/3) + 1;
        if(c1 >= mini) ls.add(element1);
        if(c2 >= mini) ls.add(element2);

        return ls;

    }
}