class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                length += 2;
            }
            else set.add(c);
        }
        if(!set.isEmpty()) length += 1;
        return length;
    }
}