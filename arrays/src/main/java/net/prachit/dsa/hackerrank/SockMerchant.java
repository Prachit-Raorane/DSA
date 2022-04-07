package net.prachit.dsa.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {


    public  int sockMerchant(int n, List<Integer> ar) {

        ar.sort(Comparator.naturalOrder());
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            if(i+1 <n && ar.get(i).equals(ar.get(i+1))){
                count++;
                i++;
            }

        }
        return count;
    }

    public int qBased(int n , List<Integer> ar){
        Queue<Integer> q = new PriorityQueue<>(Comparator.naturalOrder());
        q.addAll(ar);
        int count = 0;
        while (!q.isEmpty()){

            int first = q.poll();
            if(q.isEmpty()) break;
            int second = q.peek();

            if(first==second){
                count++;
                q.poll();
            }
        }
        return count;
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String,Long> dictionary = magazine.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean flag=true;
        for(String noteWord : note){
            if(dictionary.containsKey(noteWord) && dictionary.get(noteWord) > 0){
               dictionary.put(noteWord , dictionary.get(noteWord)-1);
            }else{
                flag= false;
                break;
            }
        }

        Map<String,Integer> map = new HashMap<>();

        System.out.println(flag ? "Yes" : "No");

    }


}
