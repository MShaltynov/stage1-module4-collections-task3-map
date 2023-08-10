package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            Integer key=e.getKey();
            String value =e.getValue();
            if (!result.containsKey(value)) {
                result.put(value, key);
            }else{
                if (result.get(value)>key){
                    result.put(value, key);
                }

            }
        }

        return result;
    }
}
