package net.prachit.dsa.trees;

import net.prachit.dsa.bitManip.Bit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BitTest {

    private Bit bit;

    @BeforeEach
    void setUp() {
        bit = new Bit();
    }

    @Test
    public void oddEven() {

        Assertions.assertFalse(bit.oddEven(12));
        Assertions.assertTrue(bit.oddEven(13));
    }

    @Test
    public  void ithBit(){

        Assertions.assertTrue(bit.ithBit(12,2)); // 1 1 0 0
        Assertions.assertFalse(bit.ithBit(12,1)); // 1 1 0 0

    }

    @Test
    void findUniqueNumberNumbersRepeatingTwice() {
        Assertions.assertEquals(1,bit.findOneUniqueNumber(new int[]{1,2,3,4,5,6,2,3,4,5,6}));
        Assertions.assertEquals(2,bit.findOneUniqueNumber(new int[]{1,2,3,4,5,6,1,3,4,5,6}));
        Assertions.assertEquals(0,bit.findOneUniqueNumber(new int[]{1,2,3,4,5,6,1,2,3,4,5,6}));
    }

    @Test
    public void switchBitTest(){
        // 1 1 0 0 = 12
        // 0 0 0 1 = 1
        // 1 1 1 1
        Assertions.assertEquals(3, bit.bitsRequiredToConvert(12,1));
        Assertions.assertEquals(2, bit.bitsRequiredToConvert(12,15));
    }
}
