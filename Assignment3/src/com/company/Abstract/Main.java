package com.company.Abstract;

public class Main {

    public static void main(String[] args) {
        PsychiatristObject psychiatristObject = new PsychiatristObject();

        MoodyObject happy = new HappyObject();
        psychiatristObject.examine(happy);
        System.out.println("");
        psychiatristObject.observe(happy);
        System.out.println("");

        MoodyObject sad = new SadObject();
        psychiatristObject.examine(sad);
        System.out.println("");
        psychiatristObject.observe(sad);
    }
}
