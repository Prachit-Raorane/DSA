package net.prachit.dsa.trees;

public class BinaryTreeMinMax {

    public int min(Node root){

        if (root==null){
            return Integer.MAX_VALUE;
        }

        return Math.min(Math.min(root.key, min(root.left)),min(root.right));
    }
    public int max(Node root){

        if (root==null){
            return Integer.MIN_VALUE;
        }

        return Math.max(Math.max(root.key, max(root.left)),max(root.right));
    }
}
