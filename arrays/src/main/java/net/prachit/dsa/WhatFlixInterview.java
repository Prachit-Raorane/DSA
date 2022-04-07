package net.prachit.dsa;

//123
public class WhatFlixInterview {

    public int reverse(final int input){
        int temp = input;
        int result=0;

        while(temp > 0){
            result = result *10 + temp%10;
            temp /=10;
        }

        return result;
    }


    /**
     * ["((()))","(()())","(())()","()(())","()()()"]
     */
    public void paranthesisGenerator(final int pair){
        String result = "";
        build(pair, pair,result);
    }

    private void build(int open, int close, String result) {

        if(open==0 && close == 0 ){
            System.out.println(result);
        }

        if(open > 0){
            build(open -1 ,close,result+"(");
        }

        if(close > open ){
            build(open ,close -1 ,result+")");
        }
    }





    static class Node{

        Node left,right;
        int val;


        public Node(int val) {
            this.val = val;
        }
    }

    /**
     *           10
     *        6      13
     *      4  7  11  14
     */


    public boolean checkBinarySearchTree(Node n){

        return check(n.left,Integer.MIN_VALUE,n.val) && check(n.right,n.val,Integer.MAX_VALUE);

    }

    private boolean check(Node node, int min, int max) {
        if(node == null) return true;

        return node.val >= min && node.val <=max && check(node.left,min,node.val) && check(node.right,node.val,max);
    }


}
