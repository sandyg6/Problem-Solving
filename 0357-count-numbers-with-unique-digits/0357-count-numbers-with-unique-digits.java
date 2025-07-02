class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n+1];
        if(n == 0) return 1;
        if(n==1) return 10;
        
        dp[0] = 1;dp[1] =10;
        for(int i = 2; i <= n; i++){
            dp[i] += dp[i-1];
            int k = 9;
            int count = 9;
            for(int j =1;j < i; j++){
                count *= k--;
            }
            dp[i] += count;
        }
        return dp[n];
    }
}