package com.company.leetcode;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {
        boolean result = isIsomorphic("egg", "add");
//        boolean result = isIsomorphic("foo", "bar");
//        boolean result = isIsomorphic("paper", "title");
        System.out.println(result);
    }

    private static boolean isIsomorphic(String s, String t) {
        int[] id1;
        int[] id2;

        if (s.length() != t.length()) {
            return false;
        }

        id1 = addId(s);
        id2 = addId(t);

        for (int i = 0; i < s.length(); i++) {
            if (id1[i] != id2[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] addId(String s) {
        int count = 1;
        int idOrder[] = new int[s.length()];
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (table.containsKey(s.charAt(i))) {
                idOrder[i] = table.get(s.charAt(i));
            } else {
                table.put(s.charAt(i), count);
                idOrder[i] = count;
                count++;
            }
        }
        return idOrder;
    }
}
