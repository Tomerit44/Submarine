package com.example.submarines;

public class BuySubColor extends Item
{
    private int sub_color;
    public BuySubColor(int price, int sub_color) {
        super(price);
        this.sub_color=sub_color;
    }

    public int getSub_color() {
        return sub_color;
    }

    public void setSub_color(int sub_color) {
        this.sub_color = sub_color;
    }

    @Override
    public String toString() {
        return "BuySubColor: " +"\n" +
                "sub_color: " + sub_color +"\n" +
                "price: " + price;
    }
}
