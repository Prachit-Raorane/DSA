package net.prachit.dsa.trees;

public class SizeBinaryTree {

    public int size(Node root){
        if(root == null){
            return 0;
        }

        return size(root.left) + size(root.right) + 1;
    }
}
