package com.company.Question2;

public class Printer {
    private static Printer instance;
    private static Object object = new Object();

    private Printer() { // Default constructor not used as new instance is created from getInstance() function
    }

    public static Printer getInstance() {
        if(instance == null) { // Double lock check added as synchronized takes time
            synchronized (object) {
                if(instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

    public static void getConnection() {
        System.out.println("Your Printer is working");
    }
}


