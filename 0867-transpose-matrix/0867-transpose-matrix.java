class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // arr needs 'c' rows and 'r' columns
        int[][] arr = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[j][i] = matrix[i][j];
            }
        }

        return arr;
    }
}