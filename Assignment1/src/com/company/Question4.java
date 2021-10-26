package com.company;

import java.util.HashMap;

public class Question4 {

    public static void main(String[] args) {
        String ransomNote = "aac";
        String magazine = "abcaab";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineTable = new HashMap<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if (magazineTable.containsKey(ch)) {
                magazineTable.put(ch, magazineTable.get(ch) + 1);
            } else {
                magazineTable.put(ch, 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (magazineTable.containsKey(ch)) {
                if (magazineTable.get(ch) != 0) {
                    magazineTable.put(ch, magazineTable.get(ch) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
