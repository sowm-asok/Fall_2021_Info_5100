package com.company.Abstract;

public class SadObject extends MoodyObject {

    // Returns string indicating sad
    public String getMood() {
        return "I feel sad Today";
    }

    // Print crying string "'waah' 'boo hoo' 'weep' 'sob'"
    @Override
    public void expressFeelings() {
        System.out.println("'waah' 'boo hoo' 'weep' 'sob'");
    }

    // Returns message about self : "Subject cries a lot"
    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}
