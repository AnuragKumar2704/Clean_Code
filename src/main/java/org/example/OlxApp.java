package org.example;

import java.util.Arrays;

public class OlxApp {
	
	public Item[] items;

	public OlxApp(Item[] items) {
		this.items = items;
	}

	public static void main(String[] args) {

		Item[] items = new Item[] { 
							new Item("Mangoes", 10, 20)
					   };

		OlxApp app = new OlxApp(items);

		app.updateQuality();

		System.out.println(app);

	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (items[i].name != "Aged Wine" && items[i].name != "ColdPlay concert passes") {
				if (items[i].quality > 0) {
					if (items[i].name != "PokemonGo") {
						items[i].quality = items[i].quality - 1;
					}
				}
			} else {
				// This part handles the items for which quality can increase
				// "ColdPlay concert passes" and "Aged Wine"

				if (items[i].quality < 50) {
					items[i].quality = items[i].quality + 1;

					if (items[i].name == "ColdPlay concert passes") {
						if (items[i].sellIn < 11) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}

						if (items[i].sellIn < 6) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}
					}
				}
			}

			// Everything except for Sulfuras the sellIn Decreases
			if (items[i].name != "PokemonGo") {
				items[i].sellIn = items[i].sellIn - 1;
			}

			if (items[i].sellIn < 0) {
				if (items[i].name != "Aged Wine") {

					if (items[i].name != "ColdPlay concert passes") {
						if (items[i].quality > 0) {
							if (items[i].name != "PokemonGo") {
								items[i].quality = items[i].quality - 1;
							}
						}
					} else {
						// For Backstage passes with sellin less than zero
						// quality is set to zero
						items[i].quality = 0;
					}
				} else {
					// For Aged Wine below 50 quality increases actually by 2
					// In the previous line
					if (items[i].quality < 50) {
						items[i].quality = items[i].quality + 1;
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

}