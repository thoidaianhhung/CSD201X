package com.company;

public class Main {
    static int N = 5;
    static int k = 1;

    static void printSolution(int[][] board) {
        System.out.printf("%d-\n", k++);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf(" %d ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(int[][] board, int row, int col) {
        int i, j;
        for (i = 0; i < N; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static boolean solveNQUtil(int[][] board, int col) {
        boolean res = false;
        if (col == N) {
            printSolution(board);
            return true;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                res = solveNQUtil(board, col + 1) || res;
                board[i][col] = 0;
            }
        }
        return res;
    }

    static void sloveNQ() {
        int[][] board = new int[N][N];
        if (!solveNQUtil(board, 0)) {
            System.out.println("Solution does not exits");
        }
    }

    public static void main(String[] args) {
	// write your code here
        sloveNQ();
    }
}
