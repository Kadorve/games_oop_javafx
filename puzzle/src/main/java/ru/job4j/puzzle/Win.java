package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (monoHorizontal(board) || monoVertical(board)) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                int count = 0;
                for (int cellNext = 1; cellNext < board.length; cellNext++) {
                    if (board[row][cellNext] + board[row][cell] == 2) {
                        count++;
                    }
                }
                if (count == board.length - 1) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                int count = 0;
                for (int rowNext = 1; rowNext < board.length; rowNext++) {
                    if (board[rowNext][cell] + board[row][cell] == 2) {
                        count++;
                    }
                }
                if (count == board.length - 1) {
                    result = true;
                }
            }
        }
        return result;
    }
}
