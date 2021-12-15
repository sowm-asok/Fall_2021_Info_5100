package com.company.Question1;

public interface iRobot {

    boolean move();

    void turnLeft();

    void turnRight();

    void clean();

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
