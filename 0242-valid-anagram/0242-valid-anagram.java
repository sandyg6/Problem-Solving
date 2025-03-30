class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] s_arr = s.toCharArray();
        Arrays.sort(s_arr);
        String s_sorted = new String(s_arr);
        char[] t_arr = t.toCharArray();
        Arrays.sort(t_arr);
        String t_sorted = new String(t_arr);
        if(s_sorted.equals(t_sorted)) return true;
        else return false; 
    }
}