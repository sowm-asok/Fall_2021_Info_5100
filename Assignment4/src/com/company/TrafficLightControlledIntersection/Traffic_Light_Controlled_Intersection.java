package com.company.TrafficLightControlledIntersection;

public class Traffic_Light_Controlled_Intersection {

    // Only have the roadId that has the green signal
    private Integer greenSignal;

    public Traffic_Light_Controlled_Intersection() {
        this.greenSignal = 1;  // Initially road A will always have green signal
    }

    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        synchronized (greenSignal) {
            // If current road does not have green signal, turn the greenSignal on for that road
            if (greenSignal != roadId) {
                turnGreen.run();
                greenSignal = roadId;
            }  // At this point, green signal is on and hence car can cross road
            crossCar.run();
        }
    }
}