package com.company;

public class Main {

    public static void main(String[] args) {       //why do semantics matter?

        int num = 10;
        Integer num1 = 23;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        max = max +1; //it is automatically wrapped
        min = min -1;
        //int is a property of Integer

        System.out.println("Max value of Integer = " + max);
        System.out.println("Max value of Integer = " + min); //Run->Debug

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
//        maxShort = maxShort + 1; // -> throws error: java: incompatible types: possible lossy conversion from int to short
//        minShort = minShort - 1; -> error thrown because of system memory. overflow outputs reaction can never be predicted

        System.out.println("Max value of Short = " + maxShort);
        System.out.println("Max value of Short = " + minShort);

//        char a = 'A';
        char a = '\u0041';

        System.out.println("Character a is : " + a);

    }


}


