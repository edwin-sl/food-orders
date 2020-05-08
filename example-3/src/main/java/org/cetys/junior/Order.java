package org.cetys.junior;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edwin on Apr, 2020
 */
abstract public class Order {
    private List<Product> products = new ArrayList<>();

    public Product[] getProducts() {
        return products.toArray(new Product[0]);
    }

    public void addItem(Product product) {
        products.add(product);
    }

    abstract public float charge();
}
