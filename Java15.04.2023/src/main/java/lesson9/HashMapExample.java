package lesson9;

import java.util.HashMap;

import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Map<String, String>> mp = new HashMap<>();
        mp.put("key1", new HashMap<>() {{
            put("Art1", "100");
            put("Max1", "200");
        }});
        mp.put("key2", new HashMap<>() {{
            put("Rita2", "300");
            put("Sasha2", "400");
            put("Igor2", "500");
        }});
        for (Map.Entry<String, Map<String, String>> entry : mp.entrySet()) {
            String key = entry.getKey();
            Map<String, String> value = entry.getValue();
            for (Map.Entry<String, String> entry2 : value.entrySet()) {
                String key2 = entry2.getKey();
                String value2 = entry2.getValue();
                System.out.print(key + " ");
                System.out.println(key2 + " " + value2);
            }

        }
        //mp.entrySet().stream().flatMap(a -> a.getValue().entrySet().stream().
        //                map(b -> a.getKey() + " " + b.getKey() + " " + b.getValue())).
        //        forEach(System.out::println);
    }
}



