class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long ans = 1;
        int n = rowIndex + 1;
        for(int i = 1; i < n; i++){
            ans = ans * (n - i);
            ans = ans / i;
            res.add((int)ans);
        }
        return res;
    }
}