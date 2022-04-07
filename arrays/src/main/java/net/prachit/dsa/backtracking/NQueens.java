package net.prachit.dsa.backtracking;

/**
 *  1 1 1 1
 *  1 1 1 1
 *  1 1 1 1
 *  1 1 1 1
 */
public class NQueens {

    private boolean isSafe(int [][] board, int row,int column){
        int i,j;
        for( i =0; i<= row ; i++){
            if (board[i][column] == 1) return false;
        }

        for (i=row , j=column; i>=0 && j >= 0; i--,j-- ){
            if (board[i][j] == 1) return false;
        }

        for (i=row , j=column; i< board.length && j < board.length; i++,j++ ){
            if (board[i][j] == 1) return false;
        }

        for (i=row , j=column; i>=0 && j < board.length; i--,j++ ){
            if (board[i][j] == 1) return false;
        }

        for (i=row , j=column; i< board.length && j >=0; i++,j-- ){
            if (board[i][j] == 1) return false;
        }

        return true;
    }


    public void NQueen(int n){
        int [][] board = new int[n][n];

        if(solveNQ(board,0,n)){
            printBoard(n, board);
        }else{
            System.out.println("Can not be solved");
        }
    }

    private void printBoard(int n, int[][] board) {
        for (int row = 0; row < n; row++){
            for (int column = 0; column < n; column++){
                System.out.print(" "+ board[row][column]);
            }
            System.out.println("");
        }
    }

    private boolean solveNQ(int[][] board, int row, int size) {
        if(row >= size){
            return true;
        }

        for (int col = 0; col < size; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = 1;
                if (solveNQ(board,row+1,size)) return true;
                board[row][col] = 0;
            }
        }

        return false;
    }
}
