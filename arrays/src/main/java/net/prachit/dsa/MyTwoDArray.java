package net.prachit.dsa;

import java.util.Iterator;

public class MyTwoDArray implements Iterable<Integer>{

    private final Integer[][] arr;
    private final int columnLength;
    private final int rowLength;

    public MyTwoDArray(Integer[][] arr) {
        this.arr = arr;

        columnLength = arr[0].length;
        rowLength = arr.length;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int currentRow;
            private int currentColumn;

            @Override
            public boolean hasNext() {
                if(/*currentColumn == columnLength &&*/ currentRow == rowLength) {
                    return false;
                }
                return true;
            }

            @Override
            public Integer next() {

                updateRowColumn();

                int next = arr[currentRow][currentColumn];
                currentColumn ++;

                return next;
            }


            private void updateRowColumn() {
                while(currentRow <= rowLength && arr[currentRow].length == 0){
                    currentRow ++;
                }
                if(currentColumn == arr[currentRow].length){
                    currentColumn = 0;
                }

            }
        };
    }
}
