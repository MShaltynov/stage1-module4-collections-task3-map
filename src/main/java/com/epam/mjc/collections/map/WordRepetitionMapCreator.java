package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> results = new HashMap<>();
        if(sentence.length()==0){
            return results;
        }
        String[] words = sentence.split("[\\s+\\p{Punct}\"]+");
        for (String s : words) {
            s=s.toLowerCase();
            if (results.containsKey(s)) {
                results.put(s, results.get(s) + 1);
            } else {
                results.put(s,1);
            }
        }
        return results;
    }

}
