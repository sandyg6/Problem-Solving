class Solution {
    // private void rev(int[] arr){
    //     int left = 0;
    //     int right = arr.length - 1;
    //     while(left < right){
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //     }
    // }
    public void rotate(int[][] matrix) {
        for(int i = 0;i < matrix.length; i++){
            for(int j = i+1; j < matrix[i].length ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            int[] arr = matrix[i];
            int left = 0;
            int right = arr.length - 1;
            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;right--;
            }
        }
    }
}