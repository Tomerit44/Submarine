package com.example.submarines;

public class BuyBackgColor extends Item
{
    private int backg_color;
    public BuyBackgColor(int price, int backg_color) {
        super(price);
        this.backg_color=backg_color;

    }

    public int getBackg_color() {
        return backg_color;
    }

    public void setBackg_color(int backg_color) {
        this.backg_color = backg_color;
    }

    @Override
    public String toString() {
        return "BuyBackgColor: " +"\n" +
                "backg_color: " + backg_color +"\n" +
                "price: " + price;
    }
}
