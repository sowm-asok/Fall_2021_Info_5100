package com.company.Abstract;

public class PsychiatristObject {

    // Asks moody object about its mood
    public void examine(MoodyObject moodyObject) {
        moodyObject.queryMood();
        System.out.println(moodyObject.getMood());
    }

    // A moodyObject is observed to either laugh or cry
    public void observe(MoodyObject moodyObject) {
        moodyObject.expressFeelings();
        System.out.println("Observation: " + moodyObject.toString());
    }
}
