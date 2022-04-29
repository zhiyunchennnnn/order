package com.fju.order;

import javax.swing.*;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;
    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        shipFeed=delivery.price;
    }
    public int  total() {
        if (delivery instanceof ShopeeDelivery) {
            return amount;
        } else {
            return amount + shipFeed;
        }
    }
}
