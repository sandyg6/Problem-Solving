class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int result = check(tops[0], tops, bottoms);
        if (result != -1) return result;
        return check(bottoms[0], tops, bottoms);
    }

    private int check(int target, int[] tops, int[] bottoms) {
        int rotationsTop = 0;
        int rotationsBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            int top = tops[i], bottom = bottoms[i];
            if (top != target && bottom != target) {
                return -1;
            }
            if (top != target) rotationsTop++;
            if (bottom != target) rotationsBottom++;
        }

        return Math.min(rotationsTop, rotationsBottom);
    }
}
