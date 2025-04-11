package org.example.exercises;

import java.util.Arrays;

public class OlxApp {

    private static final String AGED_WINE = "Aged Wine";
    private static final String CONCERT_PASSES = "ColdPlay concert passes";
    private static final String LEGENDARY_ITEM = "PokemonGo";
    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;
    private static final int SELLIN_THRESHOLD_1 = 11;
    private static final int SELLIN_THRESHOLD_2 = 6;

    public Item[] items;

    public OlxApp(Item[] items) {
        this.items = items;
    }

    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Item("Mangoes", 10, 20)
        };

        OlxApp app = new OlxApp(items);
        app.updateQuality();
        System.out.println(app);
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name != AGED_WINE && items[i].name != CONCERT_PASSES) {
                if (items[i].quality > MIN_QUALITY) {
                    if (items[i].name != LEGENDARY_ITEM) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < MAX_QUALITY) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name == CONCERT_PASSES) {
                        if (items[i].sellIn < SELLIN_THRESHOLD_1) {
                            if (items[i].quality < MAX_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < SELLIN_THRESHOLD_2) {
                            if (items[i].quality < MAX_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (items[i].name != LEGENDARY_ITEM) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (items[i].name != AGED_WINE) {
                    if (items[i].name != CONCERT_PASSES) {
                        if (items[i].quality > MIN_QUALITY) {
                            if (items[i].name != LEGENDARY_ITEM) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = MIN_QUALITY;
                    }
                } else {
                    if (items[i].quality < MAX_QUALITY) {
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
