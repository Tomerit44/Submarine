package com.example.submarines;

import java.util.Arrays;

public class Player extends User
{
    private int points;
    private Item[] items = new Item[3];
    public Player(String name, String bdate, int phone, int points, Item[] items) {
        super(name, bdate, phone);
        this.items=items;
        this.points=points;

    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Player: " +"\n" +
                "points: " + points +"\n" +
                "items: " + Arrays.toString(items) +"\n" +
                "name: " + name + "\n" +
                "bdate: " + bdate + "\n" +
                "phone: " + phone;
    }
}
