package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> resultMap = new HashMap<>();
        ArrayList<String> count = new ArrayList<>();

        for(String str: strs){
            int[] countArray = new int[26];
            for(char c : str.toLowerCase().toCharArray()){
                countArray[c - 'a'] += 1; // this will count the occurance of the character at that position.
            }

            // this array should act as a key to my hashmap
            String hashMapKey = Arrays.toString(countArray);
            if(!resultMap.containsKey(hashMapKey)) resultMap.put(hashMapKey, new ArrayList<>());

            resultMap.get(hashMapKey).add(str);

        }
        return resultMap.values().stream().toList();
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("act","pots","tops","cat","stop","hat");
        System.out.println(groupAnagrams(strs.toArray(new String[0])));
    }
}
