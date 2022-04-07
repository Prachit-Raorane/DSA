package net.prachit.dsa.Strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generate(final int n){

        ArrayList<String> result = new ArrayList<>();
        resultString("",n,n, result);
        return result;
    }

    private void resultString(String current, int open, int close, ArrayList<String> result) {

        if(open == 0 && close == 0){
            result.add(current);
            return;
        }

        if(open > 0){
            resultString(current + "(",open-1,close,result);
            //current = current.substring(0,current.length()-1);
        }

        if(close>0 && close > open){
            resultString(current+")",open,close-1,result);
            //current = current.substring(0,current.length()-1);
        }
    }

}
