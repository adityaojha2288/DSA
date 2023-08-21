package com.company;

public class SudokoSOlver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        solve(board);
    }
    static boolean solve(int[][] board){

        int n = board.length;
        int row = -1;
        int col =-1;
        boolean empty = true;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n ; j++) {
                if(board[i][j]==0){

                   row  = i;
                   col = j;
                   empty = false;
                   break;

                }
            }
            if (!empty){
                break;
            }
        }
        if(empty){
            return true;
        }
        if (col == n && row == n && !empty) return true;
        for (int num = 1; num <10 ; num++) {
            if(isSafe(board, row, col,num)){
                board[row][col] = num;
                if (solve(board)){
                    display(board);
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }

        }
        return false;
    }
    static boolean isSafe(int[][] board , int row, int col , int number){
        for (int i = 0; i <board.length ; i++) {
            if(board[row][i]== number){
                return false;
            }
        }
        for (int[] ints : board) {
            if (ints[col] == number) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int start = row - row%sqrt;
        int end =  col - col%sqrt;
        for (int r = start; r <start + sqrt ; r++) {
            for (int c = end; c <end+sqrt ; c++) {
                if(board[r][c]== number){
                    return false;
                }

            }

        }
        return true;
    }
    static void display(int[][] board){
        for (int[] row : board){
            for(int i : row){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
