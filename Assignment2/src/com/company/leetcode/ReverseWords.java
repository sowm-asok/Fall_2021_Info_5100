package com.company.leetcode;

public class ReverseWords {

    public static void main(String[] args) {
        String result = reverseWords("   the    sky   is   blue");
//        String result = reverseWords("  hello world  ");
//        String result = reverseWords("a good   example");
//        String result = reverseWords("  Bob    Loves  Alice   ");
//        String result = reverseWords("Alice does not even like bob");
        System.out.println(result);
    }

    private static String reverseWords(String s) {
        // Split words wrt spaces into an array. Spaces will become empty strings
        String arr[] = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        // Append word to sb in reverse order if word length>0 to eliminate empty strings
        for (int i = arr.length - 1; i >= 0; i--) {
            String str = arr[i];
            if (str.length() != 0) {
                // If sb is empty don't add space before word, else add space before word(if adding space after word, again have to trim at end)
                if (sb.length() == 0) {
                    sb.append(str);
                } else {
                    sb.append(" ");
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
