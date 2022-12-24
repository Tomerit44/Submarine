package com.example.submarines;

public class Buytime extends Item
{
    protected int added_time;

    public Buytime(int price, int added_time) {
        super(price);
        this.added_time = added_time;
    }

    public int getAdded_time() {
        return added_time;
    }

    public void setAdded_time(int added_time) {
        this.added_time = added_time;
    }

    @Override
    public String toString() {
        return "Buytime: " + "\n" +
                "added_time: " + added_time + "\n" +
                "rice:" + price;
    }
}
