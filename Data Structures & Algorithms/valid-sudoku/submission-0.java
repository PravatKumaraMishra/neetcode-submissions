public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];

                if (num == '.') {
                    continue;
                }

                String squareKey = (r / 3) + "," + (c / 3);

                if (!rows.computeIfAbsent(r, k -> new HashSet<>()).add(num) ||
                    !cols.computeIfAbsent(c, k -> new HashSet<>()).add(num) ||
                    !squares.computeIfAbsent(squareKey, k -> new HashSet<>()).add(num)) {
                    return false;
                }
            }
        }

        return true;
    }
}
