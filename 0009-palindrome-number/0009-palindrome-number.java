class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        int j = 0;
        boolean isPalindrome = true;
        if(n==0 || n==1){ 
            return true;
        }
        if(n ==2){
            if(s.charAt(0) == s.charAt(1)) return true;
            else return false;
        }
        for(int i=n-1;i>=n/2;i--){
            if(s.charAt(i) != s.charAt(j)) {
               return false;
            }
            j++;
        }
        return isPalindrome;
    }
}