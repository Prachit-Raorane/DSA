package net.prachit.dsa.dp;



/**
 Program to print an array in Pendulum Arrangement with constant space

 Given an array arr[] of integers, the task is to arrange them in a way similar to the to-and-fro movement of a Pendulum without using any extra space.

 Pendulum Arrangement:
 The minimum element out of the list of integers must come in the center position of the array.
 The number in the ascending order next to the minimum, goes to the right, the next higher number goes to the left of minimum number and it continues.
 As higher numbers are reached, one goes to one side in a to-and-fro manner similar to that of a Pendulum.


 Examples:
 Input: arr[] = {2, 3, 5, 1, 4}
 Output: 5 3 1 2 4
 The minimum element is 1, so it is moved to the middle.
 The next higher element 2 is moved to the right of the
 middle element while the next higher element 3 is
 moved to the left of the middle element and
 this process is continued.

 Input: arr[] = {11, 2, 4, 55, 6, 8}
 Output: 11 6 2 4 8 55
 **/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.regex.*;

/**

 1. Find mid
 2. find currentLowest number
 3. swpa()
 3.1 store existing to temp
 3.2.Place low in mid
 3.3 place temp to low location

 4. find number as > currentMind && lower < rest
 5.

 right , left , mid, currentLow

 Dry run

 // place in middle

 mid = length /2;
 right = mid +1 ;
 left = mid -1;
 currentLowLocation = findLowLocation(Integer.MIN_VALUE);

 swap (mid,currentLowLocation);

 bool direction = true;

 while(true){

 currentLowLocation = findLowLocation(Integer.MIN_VALUE);
 if(direction){
 swap(right,currentLowLocation);
 right ++;
 }else{

 swap(right,currentLowLocation);
 left --;
 }
 direction = !direction;
 }

 {11, 2, 4, 55, 6, 8}

 mid =3;
 right = 4;
 left  =2;

 [11,4,2,55,6,8] /= r = 4 , l=  2 d= T

 [11, 55, 2, 4 ,6 , 8] / r= 5 , l 2, D= F

 [11 , 6 , 2, 4, 55 ,8] // r= 5, l= 1, D =T

 [11, 6, 2, 4 , 8, 55] // r = 6 , l =1 D =F

 [11, 6, 2, 4, 8 , 55] // r= 6, l =0 , D= T

 [11, 6, 2, 4, 8, 55] // r = 7 ,l = 0 , D =F



 //** 2

 {2, 3, 5, 1, 4}

 mid = 2

 [2,3,1,5,4] // r= 3 , l =1 , D =T

 [5,3,1,2,4] // r= 4 , l = 1 , D = F

 [5 ,3 , 1, 2, 4]
 **/
public class Pendulum {


    public static void swap(int i , int j , int [] arr){
        Queue<String> q = new PriorityBlockingQueue<>();

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


    public static int minLocation(int currentLowLocation , int right , int left , int [] numbers){
        int existingMin = numbers[currentLowLocation];
        int min = Integer.MIN_VALUE;
        int location = -1;
        for (int i = 0; i < numbers.length; i++) {
            if(i != currentLowLocation && i >right   && i < left){
                int current = numbers[i];
                if(current > existingMin && current < min){
                    min = current;
                }
            }
        }

        return Arrays.binarySearch(numbers, min);
    }


    public static int findLocation(int number , int[]numbers){
        System.out.print(number);
        for(int i = 0; i< numbers.length; i ++){
            if(numbers[i]== number){
                return i;
            }
        }

        return -1;
    }
    public  static int [] arrange(int [] numbers){

        int mid,left,right,currentLow= Integer.MIN_VALUE,length=numbers.length;

        if( length%2 == 0 ){
            mid = length /2;
        }else{
            mid = (length /2) + 1;
        }

        right = mid + 1;
        left = mid - 1;

        currentLow= findLocation(Arrays.stream(numbers).min().getAsInt(),numbers);

        swap(mid, currentLow, numbers);

        boolean direction = true;
        while(right - 1 < length || left >=0){

            if(direction){
                if(right -1 < length){
                    currentLow =  minLocation(currentLow,right-2,left+1,numbers);
                    swap(right-1,currentLow,numbers);
                }
            }else{
                if(left -1 > 0){
                    currentLow =  minLocation(currentLow,right-1,left+2,numbers);
                    swap(right-1,currentLow,numbers);
                }
            }

            direction = !direction;


        }

        return numbers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        int [] input = new int [] {2, 3, 5, 1, 4};
        arrange(input);
        Arrays.stream(input).forEach(System.out::println);
    }
}

