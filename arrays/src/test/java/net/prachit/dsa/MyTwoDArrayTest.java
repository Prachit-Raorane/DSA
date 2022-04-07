package net.prachit.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTwoDArrayTest {

    @Test
    void iterator() {
        MyTwoDArray myTwoDArray = new MyTwoDArray(new Integer [][] {{1,2,3},{4,5,6},{},{7,8}});

        for (Integer i : myTwoDArray){
            System.out.println(i);
        }
    }
}