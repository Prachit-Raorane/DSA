package net.prachit.dsa.Strings;

import java.util.*;

public class LongestNonRepeatingSubString {

        public int bruteForce(String s) {
            if(s.isEmpty()) return 0;
            int max = 0;
            for(int i = 0; i<s.length() ; i++){
                for (int j =i+1 ; j <= s.length();j++){
                    String[] charArray = s.substring(i,j).split("");
                    Set<String> tempSet = new HashSet<>(Arrays.asList(charArray));
                    if(charArray.length == tempSet.size() && max < charArray.length){
                        max = charArray.length;
                    }
                }

            }

            return max;

        }

        public int slidingWindow(String a){
            int start = 0;
            int globalMax = 0;
            Map<Character,Integer> characterPositions = new HashMap<>();

            for (int index = 0; index < a.length(); index++) {

                Character currentCharacter = a.charAt(index);

                if(characterPositions.containsKey(currentCharacter)){
                    start = Math.max(start,characterPositions.get(currentCharacter) + 1);
                }

                characterPositions.put(currentCharacter,index);

                globalMax = Math.max(globalMax,index-start+1);
            }



            return globalMax;
        }
}
