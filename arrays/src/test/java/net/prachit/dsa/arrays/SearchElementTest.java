package net.prachit.dsa.arrays;

import net.prachit.dsa.binarySearch.SearchElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class SearchElementTest {

    private SearchElement searchElement;

    @BeforeEach
    void setUp() {
        searchElement = new SearchElement();
    }

    @Test
    void binarySearch() {
        int [] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        Assertions.assertEquals(4,searchElement.binarySearch(nums,5, SearchType.BINARY_SEARCH));
        Assertions.assertEquals(-1,searchElement.binarySearch(nums,100, SearchType.BINARY_SEARCH));
        Assertions.assertEquals(10,searchElement.binarySearch(nums,11, SearchType.BINARY_SEARCH));
    }

    @Test
    void infiniteBinarySearch(){
        int length = 1_00_000;
        int [] numbers = generateIncreasingRandoms(length,Integer.MAX_VALUE);
        int searchAnswer = 1000;
        int search = numbers[searchAnswer];
        Assertions.assertEquals(searchAnswer, searchElement.binarySearch(numbers,search,SearchType.INFINITE_ARRAY));
    }


    public static int[] generateIncreasingRandoms(int amount, int max) {
        int[] randomNumbers = new int[amount];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(max);
        }
        Arrays.sort(randomNumbers);
        return randomNumbers;
    }
}