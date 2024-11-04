package ua.edu.ucu.apps.lab8.payment;

public interface Payment {
    boolean pay(double price);
    String description();
}