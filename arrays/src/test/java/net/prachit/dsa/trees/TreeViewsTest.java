package net.prachit.dsa.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeViewsTest {

    private TreeViews treeViews;

    @BeforeEach
    void setUp() {
        treeViews = new TreeViews();
    }

    @Test
    void printLeftView() {
        System.out.println("");
        System.out.println("Printing Left View");
        System.out.println("");
        treeViews.printLeftView(createTree());
    }

    @Test
    void printRightView() {

        System.out.println("");
        System.out.println("Printing Right View");
        System.out.println("");
        treeViews.printRightView(createTree());
    }

    @Test
    void printTopView() {

        System.out.println("");
        System.out.println("Printing Top View");
        System.out.println("");
        treeViews.printTopView(createTree());
    }

    @Test
    void printBottomView() {

        System.out.println("");
        System.out.println("Printing Bottom View");
        System.out.println("");
        treeViews.printBottomView(createTree());
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