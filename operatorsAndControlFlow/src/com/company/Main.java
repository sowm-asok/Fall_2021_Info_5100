package com.company;

public class Main {

    public static void main(String[] args) {

/*
        Arithmetic operator functions: +,-,*,/,%
        Unary operators: a+=2, b-=1;
        boolean operation;
*/

        int a;  //option+cmd+L indentation shortcut

        /*
        if control flow
        conditional operators: ==, !=, >,<, >=,<=
        assignment operator: =
        bit operators: &, |, ^(xor), !(negation), +(bit addition), -(bit division)

        Decimal     Binary
        0           0000
        1           0001
        15          1111

        A   1101 1010
        B   1001 0110
        A+B = 128+64+0+16+8+0+2(2^1*1)+0=
        */

        a = 11;
        a = -a;
        a = a + 1;
        System.out.println("A value is: " + a);

    /*    int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = -3;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 4;
     */
        int[] arr = {1,-3,9,10,4};
        for(int i = 0; i < arr.length ; i ++){
            System.out.println("Element in index " + i + " is: " + arr[i]);
        }

        for (int num : arr ){
            System.out.println("Element is " + num);
        }

        boolean[] bValues = {true, false, false, true};
        for (boolean booleanValue : bValues) {
            System.out.println("Value is: " + booleanValue);
        }
        
        int count = 10;
//        while( count > 0){
//            System.out.println("Count value = " + count);
//            count--;
//        }
        
        // Do while -> Code is run at least once like app start check for code initialization
        do{
            System.out.println("Count value = " + count);
            count--;
        } while( count > 0);

        char[] name = {'A','s','o','w','m'};
        for (Character ch : name){
            System.out.println(ch);
        }
        System.out.println("Name in ch is: " + name);

        // instead use this
        String Name = "Sowmya";
        String lastName = "Asokan";

        Name = Name + lastName;
        System.out.println(Name); // a new temp variable is created and the values are added in that while myName originally remains unchanged

        //Using function
        String firstName = "Sowmya";
        printName( firstName, lastName );

    }// End of main function


    private static void printName(String firstName, String lastName){
        String fullName = firstName + " " + lastName; //fullName is local variable
        System.out.println("Using function Name is " + fullName);
    }

}// End of the class
