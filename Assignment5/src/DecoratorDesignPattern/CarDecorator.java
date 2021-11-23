package DecoratorDesignPattern;

public abstract class CarDecorator implements ICar {
    protected ICar carBase;

    public CarDecorator(ICar car) {
        this.carBase = car;
    }

    public abstract void assemble();
}