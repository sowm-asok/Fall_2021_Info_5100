package com.company.Question1;

public class Main {

    public static void main(String[] args) {

        Book frank = new Fiction("Frankenstein", 2.99, "1975");
        System.out.println(frank.description());

        Book anne = new NonFiction("Anne Frank", 6.99, "1995");
        System.out.println(anne.description());

        Book maps = new Reference("World Maps", 13.99, "2001", "Encylopedia");
        System.out.println(maps.description());
    }
}
