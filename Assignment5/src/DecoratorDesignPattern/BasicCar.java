package DecoratorDesignPattern;

public class BasicCar implements ICar {

    public BasicCar() {
    }

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}