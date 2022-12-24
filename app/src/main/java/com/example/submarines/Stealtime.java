package com.example.submarines;

public class Stealtime extends Buytime
{
    private int stolen_time;
    private double added_ratio;

    public Stealtime(int price, int added_time, int stolen_time, double added_ratio) {
        super(price, added_time);
        this.stolen_time=stolen_time;
        this.added_ratio=added_ratio;
    }

    public int getStolen_time() {
        return stolen_time;
    }

    public void setStolen_time(int stolen_time) {
        this.stolen_time = stolen_time;
    }

    public double getAdded_ratio() {
        return added_ratio;
    }

    public void setAdded_ratio(double added_ratio) {
        this.added_ratio = added_ratio;
    }

    @Override
    public String toString() {
        return "Stealtime: " +"\n" +
                "added_time: " + added_time +"\n" +
                "price: " + price +"\n" +
                "stolen_time: " + stolen_time +"\n" +
                "added_ratio: " + added_ratio;
    }
}
