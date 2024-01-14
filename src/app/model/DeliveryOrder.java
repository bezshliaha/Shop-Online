package app.model;

public class DeliveryOrder implements OrderComponent {
    private static final double DELIVERY_COST_PERCENTAGE = 0.1;

    @Override
    public double calculateOrderCost(int quantity, double price) {
        double orderCost = quantity * price;
        return orderCost + (orderCost * DELIVERY_COST_PERCENTAGE);
    }
}
