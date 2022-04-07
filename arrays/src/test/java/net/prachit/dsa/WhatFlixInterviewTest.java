package net.prachit.dsa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhatFlixInterviewTest {

    @Test
    void reverse() {

        WhatFlixInterview whatFlixInterview = new WhatFlixInterview();

        //Assertions.assertEquals(321,whatFlixInterview.reverse(123));
        System.out.println(whatFlixInterview.reverse(Integer.MAX_VALUE));
        //Assertions.assertEquals(321,whatFlixInterview.reverse(123));

    }


    @Test
    void pairs(){
        WhatFlixInterview whatFlixInterview = new WhatFlixInterview();

        whatFlixInterview.paranthesisGenerator(3);

    }


    /**
     *           10
     *        6      13
     *      4  7  11  14
     */


    @Test
    void checkBinaryTest(){
        WhatFlixInterview whatFlixInterview = new WhatFlixInterview();

        WhatFlixInterview.Node root  = new WhatFlixInterview.Node(10);
        root.left=new WhatFlixInterview.Node(6);
        root.left.left=new WhatFlixInterview.Node(4);
        root.left.right=new WhatFlixInterview.Node(7);

        whatFlixInterview.paranthesisGenerator(3);

    }
}