package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoVertical(board) || monoHorizontal(board))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            int count = 0;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] == 1) {
                    count++;
                }
            }
            if (count == board.length) {
                result = true;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            int count = 0;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[cell][row] == 1) {
                        count++;
                }
            }
            if (count == board.length) {
                result = true;
            }
        }
        return result;
    }
}
