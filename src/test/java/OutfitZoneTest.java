import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OutfitZoneTest {

    @Test
    void testHot() {
        OutfitZone oz = new OutfitZone();
        assertEquals("Wear cotton shirt and sunglasses", oz.recommendOutfit("hot"));
    }

    @Test
    void testCold() {
        OutfitZone oz = new OutfitZone();
        assertEquals("Wear jacket and warm clothes", oz.recommendOutfit("cold"));
    }

    @Test
    void testRainy() {
        OutfitZone oz = new OutfitZone();
        assertEquals("Take umbrella and wear raincoat", oz.recommendOutfit("rainy"));
    }
}