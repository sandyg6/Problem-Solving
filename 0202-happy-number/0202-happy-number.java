class Solution {
    private int square(int num){
        int sq_num = 0;
        while(num > 0){
            int rem = num % 10;
            sq_num += rem * rem;
            num/=10;
        }
        return sq_num;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);

        if(slow == 1) return true;
        return false;
    }
}