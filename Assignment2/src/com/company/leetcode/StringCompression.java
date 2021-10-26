package com.company.leetcode;

import java.util.ArrayList;

public class StringCompression {

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
//        char[] chars = {'a'};
//        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
//        char[] chars = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        int result = compress(chars);
        System.out.println(result);
    }

    private static int compress(char[] chars) {
        String s = "";
        int start = 0;
        ArrayList<String> list = new ArrayList<String>();

        // Iterate over each character group except last group and add char and its count in list
        for (int i = 0; i < chars.length; i++) {
            if (chars[start] != chars[i]) {
                list.add(String.valueOf(chars[start]));
                list.add(Integer.toString(i - start));
                start = i;
            }
        }

        // Add the last character group
        list.add(String.valueOf(chars[start]));
        list.add(Integer.toString(chars.length - start));

        // Split and assign values if count>10 for group and add assign it to char[]
        int insert = 0;
        int index = 0;
        for(int i=0; i < list.size() ; i++) {
            String str = list.get(i);
            if(str.equals("1") && (i%2 != 0) ) {
                continue;
            }
            else {
                for(int j=0; j<str.length(); j++){
                    chars[insert] = str.charAt(j);
                    insert++;
                }
            }
            index++;
        }
        return insert;
    }
}
