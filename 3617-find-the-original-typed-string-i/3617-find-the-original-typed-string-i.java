class Solution {
    public int possibleStringCount(String word) {
        int res = 1;
        int n = word.length();
        for(int i = 1; i < n; ++i){
            if(word.charAt(i-1) == word.charAt(i))
                res++;
        }
        return res;
    }
}