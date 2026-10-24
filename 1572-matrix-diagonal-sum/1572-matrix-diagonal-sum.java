/*
class Solution {
    public int diagonalSum(int[][] mat) {
        int a=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    a+=mat[i][j];
                }
                else if(i+j==mat.length-1){
                    a+=mat[i][j];
                }

            }
        }
        return a;
    }
}
*/
//Approach 2
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];                // Add primary diagonal element
            sum += mat[i][n - 1 - i];        // Add secondary diagonal element
        }

        // If n is odd, the center element was added twice, so subtract it once
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}