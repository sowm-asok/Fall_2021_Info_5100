package DecoratorDesignPattern;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        carBase.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}