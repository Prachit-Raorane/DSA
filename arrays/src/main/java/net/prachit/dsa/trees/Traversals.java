package net.prachit.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {



    /**
     *
     * print LNR
     */
    public void inorder(Node node){


        if(node==null) return;
        inorder(node.left);
        System.out.print(" "+node.key+ " ");
        inorder(node.right);
    }

    /**
     *
     * print NLR
     */
    public void preorder(Node node){

        if(node==null) return;
        System.out.print(" "+node.key+ " ");
        preorder(node.left);
        preorder(node.right);
    }

    /**
     *
     * print LRN
     */
    public void postorder(Node node){

        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(" "+node.key+ " ");
    }

    public void printLevelOrderRecursion(Node node){
        BinaryTreeHeight binaryTreeHeight  = new BinaryTreeHeight();
        int height = binaryTreeHeight.height(node);

        for (int level = 0; level <= height; level++) {
            levelOrder(node,level);
        }
    }

    private void levelOrder(Node node, int level) {
        if (node == null) {
            return;
        }else if(1==level){
            System.out.print(" " +node.key + " ");
            return;
        }else if(level > 1){
            levelOrder(node.left,level -1);
            levelOrder(node.right,level -1);
        }

    }


    public void printLevelOrderQueueNewLine(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            if (current == null) {
                if (queue.isEmpty()){
                    return;
                }
                queue.add(null);
                System.out.println(" ");
                continue;
            }
            System.out.print(" " +current.key + " ");
            if(current.left!=null) {
                queue.add(current.left);
            }
            if(current.right!=null) {
                queue.add(current.right);
            }
        }

    }





}
