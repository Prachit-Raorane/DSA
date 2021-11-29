package net.prachit.dsa.misc;
        ;

public class BiggestNumberThanRight {

    public void print(int[] input){
        int length = input.length;
        int maximum = input[length-1];
        System.out.println(input[length-1]);
        for (int i = input.length - 1; i >= 0; i--) {
            if(input[i] > maximum){
                System.out.println(input[i]);
                maximum = input[i];
            }
        }

    }
}
