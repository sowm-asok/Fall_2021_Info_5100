package StrategyDesignPattern;

public class CreditCard implements PaymentStrategy {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int pay) {
        System.out.println("CreditCard : $" + pay);
    }
}
