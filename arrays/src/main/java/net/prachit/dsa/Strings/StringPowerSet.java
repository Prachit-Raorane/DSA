package net.prachit.dsa.Strings;

public class StringPowerSet {

    public void printPowerSet(String s,int length,String current){
        if(length==s.length()){
            System.out.println(current);
            return;
        }

        printPowerSet(s,length+1,current+s.charAt(length));
        printPowerSet(s,length+1,current);
    }
}
