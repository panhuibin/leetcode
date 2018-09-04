package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/word-search/description/
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 * <p>
 * Example:
 * <p>
 * board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * <p>
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 */

class WordSearch {
    public boolean exist(char[][] board, String word) {
        int height = board.length;
        int width = board[0].length;
        int[][] visited = new int[height][width];
        for (int[] row : visited) {
            Arrays.fill(row, 0);
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (isWordFound(board, visited, i, j, word, 0)) return true;
            }
        }
        return false;

    }

    private boolean isWordFound(char[][] board, final int[][] visited, int i, int j, String word, int index) {
        if (board[i][j] == word.charAt(index)) {
            int[][] currentVisited = Arrays.stream(visited).map(int[]::clone).toArray(int[][]::new);
            currentVisited[i][j] = 1;
            if (index == word.length() - 1) {
                return true;
            }
            if ((i > 0) && (visited[i - 1][j] == 0)) {
                if (isWordFound(board, currentVisited, i - 1, j, word, index + 1)) return true;
            }
            if ((i < board.length - 1) && (visited[i + 1][j] == 0)) {
                if (isWordFound(board, currentVisited, i + 1, j, word, index + 1)) return true;
            }
            if ((j > 0) && (visited[i][j - 1] == 0)) {
                if (isWordFound(board, currentVisited, i, j - 1, word, index + 1)) return true;
            }
            if ((j < board[0].length - 1) && (visited[i][j + 1] == 0)) {
                if (isWordFound(board, currentVisited, i, j + 1, word, index + 1)) return true;
            }
        }
        return false;
    }
}
