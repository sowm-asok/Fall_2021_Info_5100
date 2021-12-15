package com.company.Question2;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = new ArrayList<>();

        result = groupAnagrams(input);
        System.out.print("[");
        for(int i = 0; i < result.size(); i++){
            System.out.print("[");
            for(int j = 0; j < result.get(i).size(); j++) {
                String item = result.get(i).get(j);
                System.out.print("\"" + item + "\"");
                if(j != result.get(i).size() -1) System.out.print(",");
            }
            System.out.print("]");
            if(i != result.size()-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        for(String str: strs) {
            char[]ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(str);
        }

        List<List<String>> list = new ArrayList();
        for(List<String> l: map.values())
            list.add(l);
        return list;
    }
}
