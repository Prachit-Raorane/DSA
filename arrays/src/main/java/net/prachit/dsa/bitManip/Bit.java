package net.prachit.dsa.bitManip;

import java.util.Arrays;

public class Bit {

    public boolean oddEven(int number){
        return (number & 1) == 1;
    }

    public boolean ithBit(int number, int position) {
        int mask = 1 << position;
        return !((number & mask) == 0);
    }


    public int bitsRequiredToConvert(int number1,int number2){

        int xor = number1 ^ number2;

        int counter = 0;

        while (xor !=0){
            xor = xor & xor-1;
            counter ++;
        }

        return counter;
    }

    public int findOneUniqueNumber(int[] numbers) {
        return  Arrays.stream(numbers).reduce((left, right) -> left ^ right).getAsInt();
    }
}
