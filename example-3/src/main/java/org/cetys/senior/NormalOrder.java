package org.cetys.senior;

/**
 * Created by edwin on Apr, 2020
 */
public class NormalOrder extends Order {
    private static final float SUGGESTED_TIP = 0.1f;
    private final int id;

    public NormalOrder(int id) {
        this.id = id;
    }

    @Override
    public float charge() {
        var items = getProducts();
        float total = 0;
        for (Product product : items) {
            System.out.println(product.getName() + "\t$" + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Suggested 10% \t$" + total * SUGGESTED_TIP);
        System.out.println("  TOTAL\t$" + total);

        notifyUpdate(total);

        return total;
    }
}
