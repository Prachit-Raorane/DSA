package net.prachit.dsa.binarySearch;

import java.util.Arrays;

//GOOGLE
//https://www.youtube.com/watch?v=2JSQIhPcHQg&ab_channel=AdityaVerma
public class BookAllocation {

    public int solution(int[] books, int students){

        int low= Arrays.stream(books).max().getAsInt();
        int high = Arrays.stream(books).reduce(Integer::sum).getAsInt();
        int mid,result = 0;

        while (low <= high){
            mid = (high+low) /2;
            if(check(mid,books,students)){
                result = mid;
                high = mid -1 ;
            }else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean check(int size, int[] books, int students) {
        int currentNumberOfPages = books[0],  assignment = 1;

        for (int i = 1; i < books.length; i++) {

            currentNumberOfPages += books[i];
            if(currentNumberOfPages > size){
                currentNumberOfPages = books[i];
                assignment ++;
            }

        }
        return students == assignment;
    }
}
