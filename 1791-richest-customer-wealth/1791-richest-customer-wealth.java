class Solution {
    public int sum(int[] arr){
        int sum = 0;
        for(int a: arr){
            sum += a;
        }
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] a: accounts){
            if(sum(a) >= max) max = sum(a);
        }
        return max;
    }
}