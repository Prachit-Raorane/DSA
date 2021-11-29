package net.prachit.dsa;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MyTest {

    @Test
    void name() {
        String s = "ABCDE";
        System.out.println(s.substring(2,0));

        Map<String,Integer> map = new HashMap<>();
        map.values().stream().filter(v -> v > 1).mapToInt(v -> v + 1).sum();
    }
}
