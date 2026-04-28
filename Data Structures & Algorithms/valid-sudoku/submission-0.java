class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;

        int[][] rows = new int[n][n+1];
        int[][] columns = new int[n][n+1];
        int[][] squares = new int[n][n+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sq = (i/3)*3 + j/3;
                int num = (board[i][j] == '.') ? 0 : board[i][j] - '0';
                if (num != 0 && (rows[i][num] != 0 || columns[j][num] != 0 || squares[sq][num] != 0)) return false;
                rows[i][num]++;
                columns[j][num]++;
                squares[sq][num]++;
            }
        }

        return true;
        
    }
}
