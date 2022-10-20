package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    @Test
    void search() {
        Store store = new Store();
        Flower rose = new Flower();
        Flower chamomile = new Flower();
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        chamomile.setPrice(price);
        chamomile.setColor(FlowerColor.BLUE);
        chamomile.setFlowerType(FlowerType.CHAMOMILE);
        rose.setPrice(price);
        rose.setColor(FlowerColor.RED);
        rose.setFlowerType(FlowerType.ROSE);
        store.add(rose, quantity);
        store.add(chamomile, quantity);
        Assertions.assertEquals(store.search(rose), quantity);
        Assertions.assertEquals(store.search(chamomile), quantity);
    }
}
