package org.cetys.senior;

/**
 * Created by edwin on Apr, 2020
 */
public class OnlineOrder extends Order {
    private static final float DELIVERY_FEE = 30;
    private final Customer customer;

    public OnlineOrder(Customer customer) {
        this.customer = customer;
    }

    @Override
    public float charge() {
        var items = getProducts();
        float total = 0;
        for (Product product : items) {
            System.out.println(product.getName() + "\t$" + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Delvery\t$" + DELIVERY_FEE);
        total += DELIVERY_FEE;
        System.out.println("  TOTAL\t$" + total);

        notifyUpdate(total);

        return total;
    }
}
