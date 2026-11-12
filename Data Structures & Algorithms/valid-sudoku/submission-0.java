class Solution {
    public boolean isValidSudoku(char[][] board) {
        // We use one set for all 3 rules by combining each digit with its location
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num == '.') {
                    continue;
                }
                // Same digit in the same group creates the same string, so add() returns false
                if (!set.add(num + " in row " + i) || 
                    !set.add(num + " in col " + j) || 
                    // Integer division groups every 3 rows and columns into one block
                    !set.add(num + " in block " + i / 3 + "-" + j / 3)) {
                    return false;
                }
            }
        }
        return true;
    }
}
