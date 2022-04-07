package net.prachit.dsa;

class Node{
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    int val;
    Node next;
}

/**
 * 1 2 3 4
 */
public class LinkedListRotateOnce {

    public static Node rotateOnce(Node head){
        Node headTemp  = head;
        Node temp = head;

        while(temp.next.next !=null){
          temp = temp.next;
        }

        Node prv = temp;
        Node last= temp.next;

        prv.next = null;
        last.next = headTemp;

        return last;
    }

    public static void main(String[] args) {
        Node n = new Node(1,null);
        n.next= new Node(2,null);
        n.next.next =new Node(3,null);
        n.next.next.next=new Node(4,null);

        Node temp = n;
        while (temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }

        System.out.println("");

        Node result = rotateOnce(n);
        Node resultTemp = result;
        while (resultTemp!=null){
            System.out.print(resultTemp.val);
            resultTemp = resultTemp.next;
        }
    }
}
