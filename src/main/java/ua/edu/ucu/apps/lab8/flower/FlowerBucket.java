package ua.edu.ucu.apps.lab8.flower;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.lab8.flower.Item;

import lombok.Getter;

@Getter
public class FlowerBucket extends Item<FlowerBucket> {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }


    public FlowerBucket(FlowerBucket other) {
        this.flowerPacks = new ArrayList<>();
        for (FlowerPack flowerPack : other.flowerPacks) {
            this.flowerPacks.add(new FlowerPack(flowerPack));
        }
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public void addFlowers(List<FlowerPack> flowerPacksInp) {
        this.flowerPacks.addAll(flowerPacksInp);
    }

    public double price() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public Flower searchFlower(FlowerSpec spec) {
        for (FlowerPack flowerPack : this.flowerPacks) {
            if (flowerPack.getFlower().match(spec)) {
                return flowerPack.getFlower();
            }
        }
        return null;
    }

    public static FlowerBucket copy(FlowerBucket other) {
        return new FlowerBucket(other);
    }
}
