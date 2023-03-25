package Tutorials.map_hashmap;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {
        
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Lukas", 12345);
        empIds.put("Carl", 12346);
        empIds.put("Segan", 12347);

        System.out.println(empIds);

        System.out.println(empIds.get("Lukas"));

        for (String key : empIds.keySet()) {
            System.out.println("Name: " + key + " Id: " + empIds.get(key));
        }
    }
}
