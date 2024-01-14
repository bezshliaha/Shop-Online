package app.model;

public class PickupOrder implements OrderComponent {
    @Override
    public double calculateOrderCost(int quantity, double price) {
        return quantity * price;
    }
}
