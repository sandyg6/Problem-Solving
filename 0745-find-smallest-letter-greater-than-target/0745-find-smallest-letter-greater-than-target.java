class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(letters[mid] <= target) left++;
            else right--;
        }
        return letters[left%n];
    }
}