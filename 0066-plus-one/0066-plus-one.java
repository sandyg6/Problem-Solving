class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int sum = 0, carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            sum = carry;
            sum += digits[i];
            res.add(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0) res.add(carry);
        int[] ans = new int[res.size()];
        for(int i = res.size() - 1; i >= 0; i--){
            ans[res.size() - 1 - i] = res.get(i);
        }
        return ans;
    }
}