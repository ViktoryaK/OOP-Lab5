package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void search() {
        Store store = new Store();
        Flower rose = new Flower();

        rose.setPrice(33);
        rose.setColor(FlowerColor.RED);
        rose.setFlowerType(FlowerType.ROSE);
        store.add(rose, 1);
        Assertions.assertEquals(store.search(rose), 1);

    }
}