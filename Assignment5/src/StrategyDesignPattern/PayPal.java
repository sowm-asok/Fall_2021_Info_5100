package StrategyDesignPattern;

public class PayPal implements PaymentStrategy {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int pay) {
        System.out.println("PayPal : $" + pay);
    }
}