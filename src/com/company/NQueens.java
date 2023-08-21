package com.company;

public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));

    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col <board.length ; col++) {
            if (isSafe(board,row,col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //vertical
        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }
        }
        // Diagonal Left
        int left = Math.min(row,col);
        for (int i = 1; i <=left ; i++) {
            if(board[row-i][col-i]){
            return false;
            }
        }
        // Diagonal right
        int right = Math.min(row, board.length-col-1);
        for (int i = 0; i <=right ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board){
        for(boolean[] i : board){
            for (boolean element : i) {
                if(element){
                    System.out.print(" Q ");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

}
