package net.prachit.dsa.Strings;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if(s.length() == 1){
            return s;
        }
        String max = "";

        for(int i=0;i<s.length();i++){
            for(int j= i+1; j <= s.length();j++){

                String sub = s.substring(i,j);

                if(new StringBuilder(sub).reverse().toString().equals(sub)){
                    if(sub.length() > max.length()){
                        max = sub;
                    }
                }
            }
        }

        return max;

    }
}
