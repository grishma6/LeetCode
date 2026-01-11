import java.util.*;

public class Hashing {
    public static void main(String[] args){
        // key-value pairs
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India",90);
        map.put("China",80);
        map.put("USA",100);

        System.out.println(map);
        System.out.println(map);

        //search
        System.out.println(map.containsKey("China")); //to get key is present or not
        System.out.println(map.get("Indonesia"));//if key is not present it returns null

        //Iteration
        //for(int val : arr)
        for(Map.Entry<String, Integer> e : map.entrySet()){ //entrySet -->> both key value pairs
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        //set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key  + " " + map.get(key));
        }

        //remove
        map.remove("China");
        System.out.println(map);

    }
}
