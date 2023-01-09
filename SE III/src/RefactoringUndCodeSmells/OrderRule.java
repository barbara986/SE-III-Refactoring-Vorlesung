package RefactoringUndCodeSmells;

public class OrderRule {
    private Order _order;

    public OrderRule(Order order) {
        _order = order;
    }

    public boolean validate() {
        return (_order.basePrice() > 1000);
    }
}
