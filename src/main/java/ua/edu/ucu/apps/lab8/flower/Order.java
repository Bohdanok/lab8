package ua.edu.ucu.apps.lab8.flower;

import java.util.List;

import ua.edu.ucu.apps.lab8.delivery.Delivery;
import ua.edu.ucu.apps.lab8.payment.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order<T> {

    private List<Item<T>> items;
    private Delivery deliveryStrategy;
    private Payment paymentStrategy;

    public Order(List<Item<T>> items, Delivery delivery, Payment payment) {
        this.items = items;
        this.deliveryStrategy = delivery;
        this.paymentStrategy = payment;
    }

    public void setItems(List<Item<T>> newItems) {
        items = newItems;
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(item -> item.price()).sum();
    }

    public void processOrder() {
        this.deliveryStrategy = null;
        this.items = null;
        this.paymentStrategy = null;
        System.out.println("The order processed! Wait for your goods my man!");
    }

    public void addItem(Item<T> item) {
        this.items.add(item);
    }

    public void removeItem(Item<T> item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).matches(item)) {
                items.remove(i);
                return;
            }
        }
    }
}
