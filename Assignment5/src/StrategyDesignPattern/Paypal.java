package StrategyDesignPattern;

public class Paypal implements PaymentStrategy {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int pay) {
        System.out.println("PayPal : $" + pay);
    }
}
