import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] str){
        //Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : str){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());// to avoid nullpointerexception
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
