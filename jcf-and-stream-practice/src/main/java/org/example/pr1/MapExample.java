package org.example.pr1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();
        
        score.put("Kim", 90);
        score.put("Lee", 85);
        score.put("Park", 95);

        System.out.println("score = " + score);
        
        score.put("Lee", 88);
        System.out.println("score = " + score);
        
        Integer parkScore = score.get("Park");
        System.out.println("parkScore = " + parkScore);
    
        Integer nonScore = score.get("Non");
        System.out.println("nonScore = " + nonScore);
        
        Integer defaultScore = score.getOrDefault("Non", 0);
        System.out.println("defaultScore = " + defaultScore);

        System.out.println("Contains 'Kim' ? " + score.containsKey("Kim"));

        System.out.println("All keys: " + score.keySet());
    }
}
