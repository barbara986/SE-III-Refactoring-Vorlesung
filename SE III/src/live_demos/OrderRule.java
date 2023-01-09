package live_demos;
// Replace Magic Number with Symbolic Constant
public class OrderRule {
    private Order order;        

    public OrderRule(Order order) {
        this.order = order;
    }

    public void addTax () {
    	if (order.productType.equals("tickets_und_essen")) {
        	order.basePrice *= 1.07;
        }
    	else if(order.productType.equals("nicht_ermaessigt")) {
    		order.basePrice *= 1.19;
    	}
    }
}
