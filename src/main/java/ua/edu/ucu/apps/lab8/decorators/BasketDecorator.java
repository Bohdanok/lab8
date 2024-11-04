package ua.edu.ucu.apps.lab8.decorators;


import lombok.ToString;
import ua.edu.ucu.apps.lab8.flower.Item;

@ToString
public class BasketDecorator extends ItemDecorator {
    private static final double BASKET_PRICE = 4;
    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return BASKET_PRICE + item.price();
    }

    public String getDescription() {
        return item.getDescription() + "Wrapped in basket decorator";
    }
}