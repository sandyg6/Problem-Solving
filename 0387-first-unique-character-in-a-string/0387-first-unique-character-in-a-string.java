import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q = new LinkedList<>();
        ArrayList<Integer> freq = new ArrayList<>(Collections.nCopies(26, 0));
        
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i) - 'a';
            freq.set(ind, freq.get(ind) + 1);
            q.offer(s.charAt(i));
        }
        
        while (!q.isEmpty()) {
            char top = q.poll();
            if (freq.get(top - 'a') == 1) {
                return s.indexOf(top);
            }
        }
        
        return -1;
    }
}
