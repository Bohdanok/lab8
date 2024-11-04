package ua.edu.ucu.apps.lab8.payment;

public class PayPallPaymentStrategy implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payed using paypall:"
        + amount + "dollars(Gang gand)");
        return true;
    }
    public String description() {
        return "Payed using Pay Pall";
    }
}
