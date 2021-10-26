package com.company.leetcode;


public class ValidPalindrome {

    public static void main(String[] args) {
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
//        boolean result = isPalindrome("race a car");
        System.out.println(result);
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right;
        StringBuilder str = new StringBuilder();
        Character ch;

        // Adding alphanumeric characters to str
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                str.append(Character.toLowerCase(ch));
            }
        }

        right = str.length() - 1;

        // Checking if str is a palindrome using two pointers
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


