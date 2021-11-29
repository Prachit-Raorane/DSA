package net.prachit.dsa.misc;

public class StringConstruction {

    public boolean canConstruct(String result, String[] strings) {

        if (result.isBlank()) return true;

        boolean flag = false;
        for (String string : strings) {
            if (result.startsWith(string)) {
                String remainder = result.substring(string.length());
                flag = canConstruct(remainder, strings);
                if (flag){
                    break;
                }
            }
        }
        return flag;
    }

    public int numberOfWaysToConstruct(String result,String[] strings){
        if (result.isBlank()) return 1;

        int count = 0;
        for (String string : strings) {
            if (result.startsWith(string)) {
                String remainder = result.substring(string.length());
                count += numberOfWaysToConstruct(remainder, strings);
            }
        }

        return count;
    }
}