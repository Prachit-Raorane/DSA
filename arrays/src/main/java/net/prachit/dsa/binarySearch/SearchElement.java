package net.prachit.dsa.binarySearch;

import net.prachit.dsa.arrays.SearchType;

public class SearchElement {

    public int binarySearch(int[] numbers, int search, SearchType searchType){

        if(numbers == null || numbers.length == 0 ){
            return -1;
        }

        if (searchType == SearchType.BINARY_SEARCH) {
            return binarySearch(numbers, search, 0, numbers.length - 1);
        } else {
            return infiniteBinarySearch(numbers,search);
        }
    }

    private int binarySearch(int[] nums, int search, int left, int right) {
        if(left > right){
            return -1;
        }

        int mid = (right+left) / 2;

        int elementInMiddle = nums[mid];
        if(elementInMiddle == search){
            return mid;
        }

        if(search < elementInMiddle){
            return binarySearch(nums,search,left,mid);
        }else{
            return binarySearch(nums,search,mid + 1,right);

        }
    }

    private int infiniteBinarySearch(int nums[], int search){
        int low = 0;
        int high = 2;

        while (nums[high] < search){
            low = high;
            high = high * 2;
        }

        return binarySearch(nums,search,low,high);
    }
}
