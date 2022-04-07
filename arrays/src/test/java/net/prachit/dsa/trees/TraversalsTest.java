package net.prachit.dsa.trees;

import org.junit.jupiter.api.Test;

class TraversalsTest {

    private final Traversals traversals = new Traversals();

    @Test
    void inorder() {

        System.out.println("");
        System.out.println("In order traversal");
        System.out.println("");
        traversals.inorder(createTree());
    }

    @Test
    void preorder() {

        System.out.println("");
        System.out.println("Pre order traversal");
        System.out.println("");
        traversals.preorder(createTree());
    }

    @Test
    void postorder() {

        System.out.println("");
        System.out.println("Post order traversal");
        System.out.println("");
        traversals.postorder(createTree());
    }


    @Test
    void levelOrderRecursionTest() {
        traversals.printLevelOrderRecursion(createTree());
    }

    @Test
    void levelOrderQueueTest() {
        traversals.printLevelOrderQueueNewLine(createTree());
    }

    /**
     *
     *        15
     *    10      20
     *   8  12   16  25
     */
    private Node createTree(){
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.left.left.left = new Node(6);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        return root;
    }
}