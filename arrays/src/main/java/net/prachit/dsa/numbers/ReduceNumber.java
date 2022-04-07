package net.prachit.dsa.numbers;

public class ReduceNumber {

    public int reduce(int number){

     if (number == 0 ) return number;
     if(number % 9 == 0)
         return 9;
    return number % 9;

    }
}
