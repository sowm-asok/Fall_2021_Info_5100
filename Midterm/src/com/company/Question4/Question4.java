package com.company.Question4;

import java.util.HashMap;

public class Question4 {
    public static void main(String[] args) {
        String s = "abcabcbb";
//        String s = "abcdabcdbbabab";
        String result = longestSubstring(s);
        System.out.println(result);
    }

    public static String longestSubstring(String s) {
        int i, p1 = 0;
        int start = 0, end = 0, longest = 0;
        int n = s.length();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put(s.charAt(0), 0);

        for (i = 1; i < n; i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), i);
            } else {
                if (hm.get(s.charAt(i)) >= p1) {
                    end = i - p1;
                    if (longest < end) {
                        start = p1;
                        longest = end;
                    }
                    p1 = hm.get(s.charAt(i)) + 1;
                }
                hm.replace(s.charAt(i), i);
            }
        }
        if (longest < i - p1) {
            start = p1;
            longest = i - p1;
        }
        return s.substring(start, start + longest);
    }
}












