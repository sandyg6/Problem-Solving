class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int res = 0;
        int left = 0;
        int right = n - 1;

        int area = 0;
        while(left < right){
                area = (right - left) * Math.min(height[left], height[right]);
                res = Math.max(res, area);
                if(height[left] < height[right]) left++;
                else right--;
        }
        return res;
    }
}