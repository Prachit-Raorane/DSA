package net.prachit.dsa.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchInMatrixTest {

    private final SearchInMatrix searchInMatrix = new SearchInMatrix();

    @Test
    void searchMatrix() {
        int[][] input = new int [][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        assertTrue(searchInMatrix.searchMatrix(input, 3));
    }
}