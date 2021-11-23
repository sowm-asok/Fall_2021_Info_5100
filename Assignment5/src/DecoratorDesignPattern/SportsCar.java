package DecoratorDesignPattern;

public class SportsCar extends CarDecorator {

    public SportsCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        carBase.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}