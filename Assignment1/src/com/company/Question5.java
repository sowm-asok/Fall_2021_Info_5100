package com.company;

public class Question5 {

    public static void main(String[] args){
        String str = "1A3d4s5t";
//        String str = "A2bb2d4";
        boolean result = letterWithDigit (str);
        System.out.println(result);
    }

    private static boolean letterWithDigit (String str) {
        int count = 0;
        if(str.isEmpty() || str.isBlank()){
            return false;
        }
        for (int i = 0; i < str.length()-1; i++) {
            if (!( checkIfLetter(str.charAt(i)) && checkIfDigit(str.charAt(i+1)) || (checkIfDigit(str.charAt(i)) && checkIfLetter(str.charAt(i+1))))) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfLetter(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            return true;
        }
        return false;
    }

    private static boolean checkIfDigit(char ch){
        if(ch >= '0' && ch <= '9'){
            return true;
        }
        return false;
    }
}
