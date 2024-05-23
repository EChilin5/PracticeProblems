package SortandSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    // Write a method to sort an array of strings so that all anagrams
    // are next to each other
    // I have seen this question before
    public static void main(String[] args) {
        String[] array = new String[]{"listen", "care", "eat", "race", "tea", "silent", "ate"};
        System.out.println("Solution");
        groupAnagram(array);
    }
    public static void print(String[] array){
        System.out.println();
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void groupAnagram(String[] array){
        // create a hashmap with
        // want to group together tea, eat, ate
        // into one location
        // maybe use a hashmap
        // key can be the orriginal value
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            // create a an array of hashing with 26 lettters the size of the alphabet
            char[] hash = new char[26];
            // get word in array
            String word = array[i];
            for(int j = 0; j <word.length(); j++){
                char temp = word.charAt(j);
                // create char value based of hash value
                hash[temp-'a']++;
            }
            // convert hash to a string
            String key = new String(hash);
            // store word if key exist
            if(map.containsKey(key)){
                map.get(key).add(word);
            }else{
                // store new key into the hashmap with a default arrayList
                // then store the value
                map.put(key, new ArrayList<>());
                map.get(key).add(word);
            }
        }

        for(List<String> value : map.values()){
            System.out.println(value);
        }
    }
}
