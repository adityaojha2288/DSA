package com.company;

public class NKinghts {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        kinghts(board,0,0,n);
    }

    static void kinghts(boolean [][] board , int row ,int col, int n){

        if (n ==0){
            display(board);
            System.out.println();
        }
        if(row == board.length-1 && col == board.length-1){
            return;
        }

        if(col == board.length){
            kinghts(board, row+1,0,n);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col] = true;
            kinghts(board,row,col+1,n-1);
            board[row][col] = false;
        }
        kinghts(board,row,col+1,n);

    }
    static boolean isSafe(boolean[][] board, int row, int col){

        if (isValid(board,row-2,col-1)){
            if (board[row-2][col-1]){
                return false;
            }
        }
        if (isValid(board,row-1,col-2)){
            if (board[row-1][col-2]){
                return false;
            }
        }
        if (isValid(board,row-2,col+1)){
            if (board[row-2][col+1]){
                return false;
            }
        }
        if (isValid(board,row-1,col+2)){
            if (board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board , int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
    static void display(boolean[][] board){
        for (boolean[] arr: board){
            for(boolean i : arr){
                if(i){
                    System.out.print(" K ");

                }
                else{
                    System.out.print(" X ");
                }

            }
            System.out.println();
        }

    }
}