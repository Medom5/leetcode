class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rows = new HashSet<>();
        Set<Character> columns = new HashSet<>();
        Set<String> blocks = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char rVal = board[i][j];
                char cVal = board[j][i];

                if ((rVal != '.'
                        && (!rows.add(rVal) || !blocks.add(rVal + "in" + i / 3 + "_" + j / 3))) ||
                        (cVal != '.' && !columns.add(cVal))) {

                    return false;
                }
            }
            rows.clear();
            columns.clear();
        }
        return true;
    }
}