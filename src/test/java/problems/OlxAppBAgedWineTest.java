package problems;

import org.example.exercises.Item;
import org.example.exercises.OlxApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OlxAppBAgedWineTest {

	@Test
	public void testUpdateQualityAgedWine1() {
		Item item = new Item("Aged Wine", 4, 3);
		Item[] items = new Item[] { item };
		OlxApp app = new OlxApp(items);
		app.updateQuality();
		assertEquals("Aged Wine", app.items[0].name);
		assertEquals(3, app.items[0].sellIn);
		assertEquals(4, app.items[0].quality);
	}

	@Test
	public void testUpdateQualityAgedWine2() {
		Item item = new Item("Aged Wine", -1, 3);
		Item[] items = new Item[] { item };
		OlxApp app = new OlxApp(items);
		app.updateQuality();
		assertEquals("Aged Wine", app.items[0].name);
		assertEquals(-2, app.items[0].sellIn);
		assertEquals(5, app.items[0].quality);
	}

	@Test
	public void testUpdateQualityAgedWine3() {
		Item item = new Item("Aged Wine", 4, 50);
		Item[] items = new Item[] { item };
		OlxApp app = new OlxApp(items);
		app.updateQuality();
		assertEquals("Aged Wine", app.items[0].name);
		assertEquals(3, app.items[0].sellIn);
		assertEquals(50, app.items[0].quality);
	}
}
