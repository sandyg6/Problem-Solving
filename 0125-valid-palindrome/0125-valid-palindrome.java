class Solution {
    public boolean isPalindrome(String S) {
        S = S.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int n = S.length();
        int left = 0;
        int right = n-1;

        if(n <= 1) return true;
        while(left < right){
            if(S.charAt(left) != S.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}