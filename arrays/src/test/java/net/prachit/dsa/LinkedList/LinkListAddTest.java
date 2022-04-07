package net.prachit.dsa.LinkedList;

import org.junit.jupiter.api.Test;

class LinkListAddTest {

    @Test
    void addTwoNumbers() {

        ListNode first = new ListNode(2);
        first.next= new ListNode(4);
        first.next.next= new ListNode(3);

        ListNode second = new ListNode(5);
        second.next= new ListNode(6);
        second.next.next= new ListNode(4);

        ListNode result = new LinkListAdd().addTwoNumbers(first, second);

        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}