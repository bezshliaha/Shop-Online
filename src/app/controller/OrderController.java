package app.controller;

import app.model.OrderComponent;

public class OrderController {
    private OrderComponent orderComponent;

    public void setOrderComponent(OrderComponent orderComponent) {
        this.orderComponent = orderComponent;
    }

    public double processOrder(int quantity, double price) {
        return orderComponent.calculateOrderCost(quantity, price);
    }
}