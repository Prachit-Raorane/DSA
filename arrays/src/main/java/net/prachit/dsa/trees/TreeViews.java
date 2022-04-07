package net.prachit.dsa.trees;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeViews {

    public void printLeftView(Node root){

        Map<Integer,Node> leftView = new TreeMap<>();

        leftView(root,leftView,0);

        leftView.forEach((level, node) -> System.out.print(" "+ node.key));
    }



    private void leftView(Node node, Map<Integer, Node> leftView, int level) {

        if(node == null){
            return;
        }

        leftView.putIfAbsent(level, node);

        leftView(node.left,leftView,level+1);
        leftView(node.right,leftView,level+1);
    }

    public void printRightView(Node root){

        Map<Integer,Node> rightView = new HashMap<>();

        rightView(root,rightView,0);

        rightView.forEach((level, node) -> System.out.print(" "+ node.key));
    }

    private void rightView(Node node, Map<Integer, Node> rightView, int level) {

        if(node == null){
            return;
        }

        rightView.put(level, node);

        rightView(node.left,rightView,level+1);
        rightView(node.right,rightView,level+1);
    }

    public void printTopView(Node root){

        Map<Integer,Node> topView = new TreeMap<>();

        topView(root,topView,0);

        topView.forEach((level, node) -> System.out.print(" "+ node.key));
    }

    private void topView(Node node, Map<Integer, Node> topView, int level) {

        if(node == null){
            return;

        }

        topView.putIfAbsent(level, node);

        topView(node.left,topView,level-1);
        topView(node.right,topView,level+1);
    }
    public void printBottomView(Node root){

        Map<Integer,Node> bottomView = new TreeMap<>();

        bottomView(root,bottomView,0);

        bottomView.forEach((level, node) -> System.out.print(" "+ node.key));
    }

    private void bottomView(Node node, Map<Integer, Node> bottomView, int level) {

        if(node == null){
            return;

        }

        bottomView.put(level, node);


        bottomView(node.left,bottomView,level-1);
        bottomView(node.right,bottomView,level+1);
    }

}
