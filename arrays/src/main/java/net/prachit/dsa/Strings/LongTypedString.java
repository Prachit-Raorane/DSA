package net.prachit.dsa.Strings;

public class LongTypedString {

    public boolean longTypeString(String name, String typed){
        if(name.equals(typed)){
            return true;
        }

        if(typed.length() < name.length()){
            return false;
        }

        int np=0,tp=0;
        char current = name.charAt(0);
        while(np < name.length() && tp < typed.length()){

            if(name.charAt(np) == typed.charAt(tp)){
                current = name.charAt(np);
                np++;
                tp++;
            }else if(current == typed.charAt(tp)){
                tp ++;
            }else{
                return false;
            }
        }

        while (tp<typed.length() && typed.charAt(tp)==current){
            tp ++;
        }

        return tp==typed.length() && np==name.length();
    }
}
