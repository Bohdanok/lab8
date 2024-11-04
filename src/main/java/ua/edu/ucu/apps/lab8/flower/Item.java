package ua.edu.ucu.apps.lab8.flower;

import lombok.Getter;

@Getter
public abstract class Item<T> {
    private double price;
    private String description;

    public boolean matches(Item<T> item) {
        return this.price == item.price
        && this.description.equals(item.description);
    }

    public abstract double price();

    public String getDescription() {
        return this.description + " and costs: " + this.price;
    }
}
