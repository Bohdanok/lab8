package ua.edu.ucu.apps.lab8.flower;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.lab8.flower.FlowerBucket;
import ua.edu.ucu.apps.lab8.flower.FlowerPack;
import ua.edu.ucu.apps.lab8.flower.FlowerSpec;

public class Store {
    private List<FlowerBucket> inventory;

    public Store(List<FlowerBucket> bucket) {
        this.inventory = new ArrayList<>();
        for (FlowerBucket fb : bucket) {
            this.inventory.add(new FlowerBucket(fb));
        }
    }

    public Store() {
        this.inventory = new ArrayList<>();
    }

    public void add(FlowerBucket bubket) {
        this.inventory.add(bubket);
    }

    public ArrayList<FlowerPack> search(FlowerSpec wanted) {
        ArrayList<FlowerPack> wantedPack = new ArrayList<>();
        for (FlowerBucket flowerBucket : this.inventory) {
            for (FlowerPack flowerPack : flowerBucket.getFlowerPacks()) {
                if (wanted.match(flowerPack.getFlower())) {
                    wantedPack.add(flowerPack);
                }
            }
        }
        return wantedPack;
    }

}
