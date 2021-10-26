package com.company.sumclass;

public class Sum {
    public Sum() {
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Below function is currently not used in the testing in main as there is no three double input add function in main for testing.
    // If testing using three inputs and output is in double format, then below function can be uncommented and used.
//    public double add(double num1, double num2, double num3) {
//        return num1 + num2 + num3;
//    }
}
