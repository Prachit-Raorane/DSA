package net.prachit.dsa.misc;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 1*1 = 1
 * 1*2 = 1
 * 2*1 = 1
 * 1*3 = 1
 * 3*1 = 1
 *
 *
 *
 */
public class GridTraveller {

    class GridSize{
        int row;
        int col;

        public GridSize(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GridSize gridSize = (GridSize) o;
            return row == gridSize.row && col == gridSize.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }
    }




    public BigInteger gridTraveller(int row,int column ){
        Map<GridSize,BigInteger> table = new HashMap<>();
        return travel(row, column,table);
    }

    public BigInteger travel(int row, int column,Map<GridSize, BigInteger> table) {

        GridSize key = new GridSize(row, column);
        if(table.containsKey(key)){
            return table.get(key);
        }
        if(row == 0 || column == 0){
            return BigInteger.ZERO ;
        }

        if(row ==1 || column == 1){
            return BigInteger.ONE;
        }

        BigInteger add = travel(row - 1, column, table).add(travel(row, column - 1, table));
        table.put(new GridSize(row,column),add);
        return add;


    }

}
