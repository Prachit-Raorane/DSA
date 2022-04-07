package net.prachit.dsa.trees;

import org.junit.jupiter.api.Test;

class BinaryTreeHeightTest {

    private final BinaryTreeHeight binaryTreeHeight = new BinaryTreeHeight();

    @Test
    void height() {
        System.out.println(binaryTreeHeight.height(createTree()));
    }


    /**
     *
     *        15
     *    10      20
     *   8  12   16  25
     *                  30
     *                      40
     */
    private Node createTree(){
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        root.right.right.right = new Node(30);
        root.right.right.right.right = new Node(40);


        return root;
    }
}