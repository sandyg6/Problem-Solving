class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        // Take four variable L - Left, R- Right, T- Top, B = Bottom
        int L = 0, T = 0, R = matrix[0].length - 1, B = matrix.length - 1;
        //Spiral Traversal
        while(L <= R && T <= B){
            // 1. Left to Right
            for(int i = L; i <= R; i++){
                res.add(matrix[T][i]);
            }
            T++;
            // 2. Top to Bottom
            for(int i = T; i <= B; i++){
                res.add(matrix[i][R]);
            }
            R--;
            // Check for Bounds
            if(!(L <= R && T <= B)){
                break;
            }
            // 3. Right to Left
            for(int i = R; i >= L; i--){
                res.add(matrix[B][i]);
            }
            B--;
            // 4. Bottom to Top
            for(int i = B; i>= T; i--){
                res.add(matrix[i][L]);
            }
            L++;
        }
        return res;
    }
}