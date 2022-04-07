package net.prachit.dsa.Strings;

public class PalindromeString {


    public boolean isPalindrome(String val,int left,int right){

        if(left >=right) return true;

        if(val.charAt(left) != val.charAt(right)) return false;

        return isPalindrome(val,left + 1, right -1);
    }
}
