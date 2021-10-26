package com.company.shape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return getSide() * getSide();
    }

    @Override
    public int getPerimeter() {
        return 4 * getSide();
    }
}
