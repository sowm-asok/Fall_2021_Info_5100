package com.company.Abstract;

public class HappyObject extends MoodyObject {

    // Returns string indicating happy
    public String getMood() {
        return "I feel happy Today";
    }

    // Print laughter string "heeehee....hahahah...HAHAHA!!"
    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    // Returns message about self: "Subject laughs a lot"
    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
