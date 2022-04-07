package net.prachit.dsa.matrix;

public class SearchInMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int[] row = null;
        int prev = 0 ;
        for(int i = 0 ; i < matrix.length ; i++){
            if(target > prev && target < matrix[i][0]){
                row = matrix[i-1];
                break;
            }

            prev = matrix[i][0];
        }

        if(row == null){
            return false;
        }


        for(int num : row){
            if(num == target){
                return true;
            }
        }


        return false;
    }
}
