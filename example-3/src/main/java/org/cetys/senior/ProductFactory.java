package org.cetys.senior;

/**
 * Created by edwin on May, 2020
 */
public class ProductFactory {

    private static ProductFactory uniqueInstance;

    private ProductFactory() {
    }

    public static ProductFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ProductFactory();
        }
        return uniqueInstance;
    }

    public Product createProduct(String name) {
        final Product product;
        switch (name.toLowerCase()) {
            case "simple burger":
                product = new Burger(20, "simple burger", "single", "beef");
                break;
            case "double burger":
                product = new Burger(30, "double burger", "double", "beef");
                break;
            case "chicken burger":
                product = new Burger(15, "chicken burger", "single", "chicken");
                break;
            case "small coke":
                product = new Soda(10, "small coke", "small", "cola");
                break;
            case "small sprite":
                product = new Soda(10, "small sprite", "small", "lime");
                break;
            case "big coke":
                product = new Soda(25, "big coke", "big", "cola");
                break;
            default:
                product = null;
        }
        return product;
    }
}
