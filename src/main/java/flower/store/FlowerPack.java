package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        double sum = flower.getPrice() * quantity;
        return sum;
    }
}
