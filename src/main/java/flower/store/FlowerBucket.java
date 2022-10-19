package flower.store;

import java.util.ArrayList;

public class FlowerBucket {

    private double sum = 0;

    private ArrayList<FlowerPack> pacs;

    public FlowerBucket() {
        this.pacs = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        pacs.add(flowerPack);
    }

    public double getPrice() {
        for (FlowerPack flo: pacs) {
            sum += flo.getPrice();
        }
        return sum;
    }
}

