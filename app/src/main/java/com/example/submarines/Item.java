package com.example.submarines;

public class Item
{
    protected int price;

    public Item(int price)
    {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: " + "\n" +
                "price: " + price;
    }
}
