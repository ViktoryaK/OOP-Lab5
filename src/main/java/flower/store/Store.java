package flower.store;

import java.util.Hashtable;

public class Store {

    private Hashtable<Flower, Integer> assortment;

    public Store() {
        this.assortment = new Hashtable<>();
    }

    public void add(Flower flower, int number) {
        if (!assortment.containsKey(flower)) {
            assortment.put(flower, number);
        }
        else {
            assortment.put(flower, assortment.get(flower) + number);
        }



    }

    public int search(Flower flower) {
        return assortment.get(flower);
    }
}
